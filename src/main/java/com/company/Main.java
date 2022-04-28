package com.company;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Connection conn = null;
        List<String> streets = new ArrayList<String>();
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/bank1?serverTimezone=UTC", "root", "root");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from bank1.branches;");
            while (rs.next()) {
                //System.out.print("Street:" + rs.getString("street"));
                streets.add(rs.getString("street"));
                //System.out.println(", House number: " + rs.getInt("housenumber"));
            }
            for (int i = 0; i < streets.size(); i++) {
                System.out.println(streets.get(i));
            }
            JFrame frame = new JFrame("Hello World Java Swing");
            frame.setMinimumSize(new Dimension(800, 600));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // center the JLabel
            JLabel lblText = new JLabel("Hello World!", SwingConstants.CENTER);
            JList<String> streetlist = new JList(streets.toArray());

            // add JLabel to JFrame
            frame.getContentPane().add(streetlist);

            // display it
            frame.pack();
            frame.setVisible(true);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {


            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
