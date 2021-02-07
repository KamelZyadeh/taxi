package com.java.tutorial.statics.data;

public class ConstantHolder {

    public static final String ACCOUNT_SELECT = "SELECT * FROM account";
    public static final String ACCOUNT_SELECT_BY_ID = "SELECT * FROM account a WHERE a.id = ?";
    public static final String ACCOUNT_INSERT = "INSERT INTO account (first_name, last_name, phone_number, user_name, " +
            "password, type) VALUES (?, ?, ?, ?, ?, ?)";
    public static final String ACCOUNT_UPDATE = "UPDATE account SET first_name=?, last_name=?, phone_number=?, user_name=?," +
            "password=?, type=? WHERE id=?";
    public static final String ACCOUNT_DELETE_ALL = "DELETE FROM account";
    public static final String ACCOUNT_DELETE_BY_ID = "DELETE FROM account WHERE id=?";

    public static final String ACCOUNT_LOGIN = "SELECT * FROM account WHERE user_name=? AND password=?";


    public static final String LOCATION_SELECT = "SELECT * FROM location";
    public static final String LOCATION_SELECT_BY_ID = "SELECT * FROM location l WHERE l.id = ?";
    public static final String LOCATION_INSERT = "INSERT INTO location (lng, lat) VALUES (?, ?)";
    public static final String LOCATION_UPDATE = "UPDATE location SET lng=?, lat=? WHERE id=?";
    public static final String LOCATION_DELETE_ALL = "DELETE FROM location";
    public static final String LOCATION_DELETE_BY_ID = "DELETE FROM location WHERE id=?";

    public static final String TRANSACTION_SELECT = "SELECT * FROM transaction";
    public static final String TRANSACTION_SELECT_BY_ID = "SELECT * FROM transaction t WHERE t.id = ?";
    public static final String TRANSACTION_INSERT = "INSERT INTO transaction (date, type) VALUES (?, ?)";
    public static final String TRANSACTION_UPDATE = "UPDATE transaction SET date=?, type=? WHERE id=?";
    public static final String TRANSACTION_DELETE_ALL = "DELETE FROM transaction";
    public static final String TRANSACTION_DELETE_BY_ID = "DELETE FROM transaction WHERE id=?";

    public static final String ORDER_SELECT = "SELECT * FROM \"order\"";
    public static final String ORDER_SELECT_BY_ID = "SELECT * FROM \"order\" o WHERE o.id = ?";
    public static final String ORDER_INSERT = "INSERT INTO \"order\" (taxi_id, client_id, source_id, destination_id," +
            " transaction_id, price, date) VALUES (?, ?, ?, ?, ?, ?, ?)";
    public static final String ORDER_UPDATE = "UPDATE \"order\" SET taxi_id=?, client_id=?, source_id=?, destination_id=?, " +
            " transaction_id=?, price=?, date=? WHERE id=?";
    public static final String ORDER_DELETE_ALL = "DELETE FROM \"order\"";
    public static final String ORDER_DELETE_BY_ID = "DELETE FROM \"order\" WHERE id=?";
}
