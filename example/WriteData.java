package org.example;

import java.sql.PreparedStatement;

public class WriteData {
    public static void WriteD(String username, String password) {
        String sqlInsert = "INSERT INTO registration(username, password) VALUES (?,?)";

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = ConnectionWithDataBase.getConnection().prepareStatement(sqlInsert);
            preparedStatement.setString(1, username); // Заменяем первый знак вопроса
            preparedStatement.setString(2, password);  // Заменяем второй знак вопроса
            preparedStatement.executeUpdate();
            System.out.println("update");

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}