package com.company;

import javax.swing.*;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        /*Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/bank1?serverTimezone=UTC", "root", "03071319");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from bank1.branches;");
            while (rs.next()) {
                System.out.print("Street:" + rs.getString("street"));
                System.out.println(", House number: " + rs.getInt("housenumber"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {


            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }*/
        try {
            int a = 7/0;
        }
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage() + "!!");
        }

    }
}
