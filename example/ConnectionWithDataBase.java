package org.example;


import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionWithDataBase {
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "postgres";
    private static final String password ="1111";

    public static Connection getConnection() throws Exception{
        Connection connection;
        try {
            connection = DriverManager.getConnection(url,user,password);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}

