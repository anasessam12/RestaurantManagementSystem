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

    
    
    public void add(user u, int roleID){
    try{

        Statement st = c.getConn().createStatement();
        String sql = "insert into users values (" +u.getId()+",'"+u.getName()+"','"+u.getPassword()+"',"+roleID+")";
        st.executeUpdate(sql);
        //JOptionPane.showMessageDialog(null,"Added Successfully","Add",JOptionPane.INFORMATION_MESSAGE);
    }
    catch(SQLException ex){
    JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
    }  
    }
       
    public void list (JTable emp_table )
    {
        DefaultTableModel dt=new DefaultTableModel();       
        emp_table.setModel(dt);
         dt.addColumn("Id");
         dt.addColumn("Name");
         dt.addColumn("Passowrd");    
        try {
            // TODO add your handling code here:
            Statement  st = c.getConn().createStatement();
            String sql = "select * from users";
            ResultSet re = st.executeQuery(sql);
            while(re.next())
            {    
                dt.addRow(new Object[] { re.getString("userr_id"),
                re.getString("userr_name"),
                re.getString("pass")});      
            }
        }catch(SQLException ex){
    JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
    }    }
    
    public void search(JTable search_table, user u) {
        DefaultTableModel dt = new DefaultTableModel();
        search_table.setModel(dt);
        dt.addColumn("Id");
        dt.addColumn("Name");
        dt.addColumn("Passowrd");
        try {

            Statement st = c.getConn().createStatement();
            String sql = "select * from users where userr_id='" + u.getId() + "'";
            ResultSet re = st.executeQuery(sql);
            while (re.next()) {

                dt.addRow(new Object[]{re.getString("userr_id"),
                    re.getString("userr_name"),
                    re.getString("pass")});

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
     public void delete(user u) {

        try {
            Statement st = c.getConn().createStatement();
            String sql = "delete from users where userr_id = " + u.getId() + "";
            st.executeUpdate(sql);
            //JOptionPane.showMessageDialog(null,"Employee has been deleted successfully","success",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
     
      public void update(user u) {
        try {

            Statement st = c.getConn().createStatement();
            String sql = "update users set userr_name='" + u.getName() + "',pass='" + u.getPassword() + "' where userr_id='" + u.getId() + "' ";
            st.executeUpdate(sql);
            //JOptionPane.showMessageDialog(null,"Employee has been updated successfully","success",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
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

    
    
    
    
    
    
    
    
    
    



