package com.java.tutorial.service.impl;

import com.java.tutorial.dao.impl.OrderDAO;
import com.java.tutorial.entities.Order;
import com.java.tutorial.exceptions.DAOException;
import com.java.tutorial.exceptions.ServiceException;
import com.java.tutorial.service.CRUDService;

import java.util.List;

public class OrderService extends CRUDService<Order> {
    OrderDAO orderDAO = new OrderDAO();

    @Override
    public void create(Order entity) throws ServiceException {
        try {
            orderDAO.insert(entity);
        } catch (DAOException e) {
            throw new ServiceException("cant insert order in service");
        }
    }

    @Override
    public Order readById(int id) throws ServiceException {
        try {
            return orderDAO.selectById(id);
        } catch (DAOException e) {
            throw new ServiceException("cant select order by id from service");
        }
    }

    @Override
    public List<Order> read() throws ServiceException {
        try {
            return orderDAO.select();
        } catch (DAOException e) {
            throw new ServiceException("cant select list of orders in service");
        }
    }

    @Override
    public void update(Order entity) throws ServiceException {
        try {
            orderDAO.update(entity);
        } catch (DAOException e) {
            throw new ServiceException("updating order in service failed");
        }
    }

    @Override
    public void delete() throws ServiceException {
        try {
            orderDAO.delete();
        } catch (DAOException e) {
            throw new ServiceException("deleting orders in service failed");
        }
    }

    @Override
    public void deleteById(Order entity) throws ServiceException {
        try {
            orderDAO.deleteById(entity);
        } catch (DAOException e) {
            throw new ServiceException("deleting order by id in service failed");
        }
    }
}
