package com.java.tutorial.dao.impl;

import com.java.tutorial.dao.DAO;
import com.java.tutorial.entities.Order;
import com.java.tutorial.exceptions.DAOException;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.java.tutorial.statics.data.ConstantHolder.*;
public class OrderDAO extends DAO<Order> {
    @Override
    public boolean update(Order entity) throws DAOException {
        try (PreparedStatement preparedStatement = connection.prepareStatement(ORDER_UPDATE)){
            setting(entity, preparedStatement);
            preparedStatement.setLong(8, entity.getId());
            int i = preparedStatement.executeUpdate();
            if (i==1) {
                return true;
            }
        } catch (SQLException e) {
            throw new DAOException("updating order in dao failed");
        }
        return false;
    }

    @Override
    public int insert(Order entity) throws DAOException {
        try (PreparedStatement preparedStatement = connection.prepareStatement(ORDER_INSERT)){
            setting(entity, preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new DAOException("cant insert order in dao");
        }
        return 0;
    }

    @Override
    public void delete() throws DAOException {
        try (PreparedStatement preparedStatement = connection.prepareStatement(ORDER_DELETE_ALL)){
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new DAOException("deleting orders in dao failed");
        }
    }

    @Override
    public void deleteById(Order entity) throws DAOException {
        try (PreparedStatement preparedStatement = connection.prepareStatement(ORDER_DELETE_BY_ID)){
            preparedStatement.setLong(1, entity.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new DAOException("deleting order by id in dao failed");
        }
    }

    @Override
    public Order selectById(int id) throws DAOException {
        try (PreparedStatement preparedStatement = connection.prepareStatement(ORDER_SELECT_BY_ID)){
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return selection(resultSet);
            }
            return null;
        } catch (SQLException e) {
            throw new DAOException("cant select order by id from dao");
        }
    }

    @Override
    public List<Order> select() throws DAOException {
        ArrayList<Order> orders = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(ORDER_SELECT)){
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Order order = selection(resultSet);
                orders.add(order);
            }
        } catch (SQLException e) {
            throw new DAOException("cant select list of orders in dao");
        }
        return orders;
    }

    private Order selection(ResultSet resultSet) throws SQLException {
        Order order = new Order();
        order.setId(resultSet.getLong("id"));
        order.setTaxiId(resultSet.getLong("taxi_id"));
        order.setClientId(resultSet.getLong("client_id"));
        order.setSource(resultSet.getLong("source_id"));
        order.setDestination(resultSet.getLong("destination_id"));
        order.setTransactionId(resultSet.getLong("transaction_id"));
        order.setPrice(resultSet.getDouble("price"));
        order.setDate(String.valueOf(resultSet.getDate("date")));
        return order;
    }

    private void setting(Order entity, PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.setLong(1, entity.getTaxiId());
        preparedStatement.setLong(2, entity.getClientId());
        preparedStatement.setLong(3, entity.getSourceId());
        preparedStatement.setLong(4, entity.getDestinationId());
        preparedStatement.setLong(5, entity.getTransactionId());
        preparedStatement.setDouble(6, entity.getPrice());
        preparedStatement.setDate(7, Date.valueOf(entity.getDate()));
    }
}
