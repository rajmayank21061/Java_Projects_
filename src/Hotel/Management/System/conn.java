package Hotel.Management.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class conn {
    public Statement statement;
    Connection connection;
    private static final String url = "jdbc:mysql://localhost:3306/GuestTracker";
    private static final String username = "root";
    private static final String password = "mayankK99@";
    public conn(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            connection = DriverManager.getConnection(url,username,password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
