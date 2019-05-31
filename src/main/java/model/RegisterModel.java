package model;

import entity.Register;

import java.sql.*;

public class RegisterModel {
    private Connection connection;

    private void initConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/t1807m?user=root&password=");
        }
    }
    public boolean insert(Register register) {
        try {
            initConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into register (username, password, confirmpassword, email, phone,fullname) values (?, ?, ?, ?, ?,?)");

            preparedStatement.setString(1, register.getUsername());
            preparedStatement.setString(2, register.getPassword());
            preparedStatement.setString(3, register.getConfirmpassword());
            preparedStatement.setString(4, register.getEmail());
            preparedStatement.setString(5, register.getPhone());
            preparedStatement.setString(6, register.getFullname());
            preparedStatement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
