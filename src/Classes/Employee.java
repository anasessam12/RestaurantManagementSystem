/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Jframes.Employeeframe;
import Jframes.adminframe;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 20112
 */
public class Employee extends user {
//    private double salary;

    //Employee constructor
    public Employee() {

    }

     public void add(user u) {
        try {
            
            Statement st = c.getConn().createStatement();
            String sql = "insert into Employee values (" + u.getId() + ",'" + u.getName() + "','" + u.getPassword() + "')";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Added Successfully", "Add", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    @Override
    public void list(JTable emp_table) {
        DefaultTableModel dt = new DefaultTableModel();

        emp_table.setModel(dt);
        dt.addColumn("Id");
        dt.addColumn("Name");
        dt.addColumn("Passowrd");

        try {
            // TODO add your handling code here:
            Statement st = c.getConn().createStatement();
            String sql = "select * from Employee";
            ResultSet re = st.executeQuery(sql);
            while (re.next()) {

                dt.addRow(new Object[]{re.getString("emp_id"),
                    re.getString("emp_name"),
                    re.getString("emp_pass")});

            }
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    
    public void delete(user u) {

        try {
            Statement st = c.getConn().createStatement();
            String sql = "delete from Employee where emp_id='" + u.getId() + "'";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Employee has been deleted successfully", "success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void send(user u, JTextField e_name, JPasswordField e_pass,JTextField Id_feild) {
        try {

            Statement st = c.getConn().createStatement();
            String sql = "select * from Employee where emp_id='" + u.getId() + "'";

            ResultSet re = st.executeQuery(sql);
            while (re.next()) {
                e_name.setText(re.getString("emp_name"));
                e_pass.setText(re.getString("emp_pass"));
                Id_feild.setText(re.getString("emp_id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(adminframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(user u) {
        try {

            Statement st = c.getConn().createStatement();
            String sql = "update Employee set emp_name='" + u.getName() + "',emp_pass='" + u.getPassword() + "' where emp_id='" + u.getId() + "' ";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Employee has been updated successfully", "success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    public void search(JTable search_table, user u) {
        DefaultTableModel dt = new DefaultTableModel();
        search_table.setModel(dt);
        dt.addColumn("Id");
        dt.addColumn("Name");
        dt.addColumn("Passowrd");
        try {

            Statement st = c.getConn().createStatement();
            String sql = "select * from Employee where emp_id='" + u.getId() + "'";
            ResultSet re = st.executeQuery(sql);
            while (re.next()) {

                dt.addRow(new Object[]{re.getString("emp_id"),
                    re.getString("emp_name"),
                    re.getString("emp_pass")});

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void login(Employee e) {

        try {
            int count = 0;
            Statement st = c.getConn().createStatement();
            String sql = "select count(1) from Employee where emp_id=" + e.getId() + " and emp_pass='" + e.getPassword() + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                count = rs.getInt(1);
            }
            if (count == 1) {
                JOptionPane.showMessageDialog(null, "login successfully", "success", JOptionPane.INFORMATION_MESSAGE);
                new Employeeframe().setVisible(true);
                new adminframe().setVisible(false);
//                new Login().dispose();
                
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Username or Password! ", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void showoffer(JTable off_Table) {

        DefaultTableModel dt = new DefaultTableModel();

        off_Table.setModel(dt);
        dt.addColumn("offer_id");
        dt.addColumn("offer_details");
        

        try {

            Statement st = c.getConn().createStatement();
            String sql = "select * from offers";
            ResultSet re = st.executeQuery(sql);
            while (re.next()) {

                dt.addRow(new Object[]{re.getString("offer_id"),
                    re.getString("offer_details")
                    });

            }
        } catch (SQLException ex) {
            Logger.getLogger(adminframe.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
