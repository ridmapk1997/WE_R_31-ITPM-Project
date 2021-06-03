/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class dbms {
    
    public static Connection c;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/institute";
            String un="root";
            String pw="ridmapk";
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/institute", "root", "ridmapk");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void iud(String q) throws Exception {
        Statement s = c.createStatement();
        s.executeUpdate(q);
    }

    public static ResultSet search(String q) throws Exception {
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery(q);
        return rs;
    }
    
}
