/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author user
 */
public class MySqlConnection {
    Connection conn=null;
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/prison","root","081721998@ling");
            JOptionPane.showMessageDialog(null,"Connecting to database");
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
