package service;

import java.sql.*;

public class DBConnection {
    Connection connection;

    DBConnection() throws SQLException {
        this.connection = this.getConnection();
    }

    public Connection getConnection() throws SQLException {

        String url = "jdbc:mysql://localhost:3306/schemas/product";
        String username = "root";
        String password = "123456";

        return DriverManager.getConnection(url, username, password);
    }

    public ResultSet executeSQL(String sql) throws SQLException {
        Statement statement = this.connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        return resultSet;
    }
}
