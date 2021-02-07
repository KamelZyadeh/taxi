package com.java.tutorial.entities;

import java.util.Objects;

public class Order {

    private long id;
    private long clientId;
    private long taxiId;
    private long transactionId;
    private double price;
    private long sourceId;
    private long destinationId;
    private String date;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public long getClientId() {
        return clientId;
    }
    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public long getTaxiId() {
        return taxiId;
    }
    public void setTaxiId(long taxiId) {
        this.taxiId = taxiId;
    }

    public long getSourceId() {
        return sourceId;
    }
    public void setSource(long sourceId) {
        this.sourceId = sourceId;
    }

    public long getDestinationId() {
        return destinationId;
    }
    public void setDestination(long destination) {
        this.destinationId = destination;
    }

    public long getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(long transactionId) {this.transactionId = transactionId;}

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id &&
                clientId == order.clientId &&
                taxiId == order.taxiId &&
                sourceId == order.sourceId &&
                destinationId == order.destinationId &&
                transactionId == order.transactionId &&
                Objects.equals(price, order.price) &&
                Objects.equals(date, order.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clientId, taxiId, sourceId, destinationId, transactionId, price, date);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", clientId='" + clientId + '\'' +
                ", taxiId='" + taxiId + '\'' +
                ", sourceId='" + sourceId + '\'' +
                ", destinationId='" + destinationId + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", price='" + price + '\'' +
                ", date='" + date + '\'' +
                "}";
    }
}
