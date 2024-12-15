package org.example;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class ReadData {
    private static final String sql = "SELECT * FROM registration";
    static HashMap<String, Person> people = new HashMap<>();
    public static HashMap<String, Person> getDataFromDataBase() throws Exception{
        Statement statement  = ConnectionWithDataBase.getConnection().createStatement();
        ResultSet resultSet =statement.executeQuery(sql);
        while (resultSet.next()){
            Person person = new Person(resultSet.getString(2),resultSet.getString(3));
            people.put(resultSet.getString(2), person);
        }
        return people;
    }
}