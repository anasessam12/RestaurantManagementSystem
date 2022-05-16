/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 20112
 */
public class dbconnection {
    private Connection conn;

    public Connection getConn() {
        return conn;
    }
   public dbconnection() {
       try{
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conn = DriverManager.getConnection("jdbc:sqlserver://localhost\\ABDO-HUSSEIN\\SQLEXPRESS:1433;databaseName=Restaurant_System", "sa", "12345");
       }
       catch(ClassNotFoundException ex){
           Logger.getLogger(dbconnection.class.getName()).log(Level.SEVERE, null, ex);
       }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQLException", "Error", JOptionPane.ERROR_MESSAGE);  
        }

    }
    
}


















