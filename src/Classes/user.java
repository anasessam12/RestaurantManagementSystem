/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Jframes.adminframe;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/*import java.swing.table.DefaultTableModel;*/

/**
 *
 * @author 20112
 */
public class user {

    protected String name;
    protected int id;
    protected String Password;
    dbconnection c = new dbconnection ();
    int role_id;
    public user(){}
    
    public user(String name, int id, String Password) {
        this.name = name;
        this.id = id;
        this.Password = Password;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return Password;
    }
    
    
    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public int getRole_id() {
        return role_id;
    }

    
    
    public void add(user u){
    }
       
    public void list (JTable emp_table ){    
    }
     
    public void update(user u) {
    }
      
      public void send(user u, JTextField e_name, JPasswordField e_pass) {
        try {
            Statement st = c.getConn().createStatement();
            String sql = "select * from Employee where emp_id='" + u.getId() + "'";
            ResultSet re = st.executeQuery(sql);
            while (re.next()) {
                e_name.setText(re.getString("emp_name"));
                e_pass.setText(re.getString("emp_pass"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(adminframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
}

    
    
    
    
    
    
    
    
    
    



