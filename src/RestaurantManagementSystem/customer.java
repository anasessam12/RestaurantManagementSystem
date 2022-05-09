/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestaurantManagementSystem;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 20112
 */
enum cust_type {
    Markting, Loyalty, Reward
};

public class customer extends user {

    cust_type type;
    String pass;

    public customer() {
    }

    public customer(cust_type type, int id, String name, String pass) {
        super(name, id, pass);
        this.type = type;
    }

    public void setType(cust_type type) {
        this.type = type;
    }

    public cust_type getType() {
        return type;
    }

    public void add(user u) {

        try {

            Statement st = c.getConn().createStatement();
            String sql = "insert into Customer values (" + u.getId() + ",'" + u.getName() + "'," + u.getRole_id() + ")";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Added Successfully", "Add", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    public void list(JTable emp_table) {
        DefaultTableModel dt = new DefaultTableModel();

        emp_table.setModel(dt);
        dt.addColumn("Id");
        dt.addColumn("Name");
        dt.addColumn("type");

        try {
            // TODO add your handling code here:
            Statement st = c.getConn().createStatement();
            String sql = "select * from Customer";
            ResultSet re = st.executeQuery(sql);
            while (re.next()) {

                dt.addRow(new Object[]{re.getString("Customer_id"),
                    re.getString("Customer_name"),
                    re.getString("Customer_type_fk")});

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void search(JTable search_table, user u) {
        DefaultTableModel dt = new DefaultTableModel();
        search_table.setModel(dt);
        dt.addColumn("Id");
        dt.addColumn("Name");
        dt.addColumn("type");
        try {

            Statement st = c.getConn().createStatement();
            String sql = "select * from Customer  where Customer_id='" + u.getId() + "'";
            ResultSet re = st.executeQuery(sql);
            while (re.next()) {

                dt.addRow(new Object[]{re.getString("Customer_id"),
                    re.getString("Customer_name"),
                    re.getString("Customer_type_fk")});

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void delete(user u) {

        try {
            Statement st = c.getConn().createStatement();
            String sql = "delete from Customer where Customer_id = " + u.getId() + "";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Customer has been deleted successfully", "success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void update(user u) {
        try {

            Statement st = c.getConn().createStatement();
            String sql = "update Customer set Customer_name='" + u.getName() + "',Customer_type_fk='" + u.getRole_id() + "' where Customer_id='" + u.getId() + "' ";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Customer has been updated successfully", "success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void send(user u, JTextField c_name, JTextField c_type) {
        try {

            Statement st = c.getConn().createStatement();
            String sql = "select * from Customer where Customer_id='" + u.getId() + "'";

            ResultSet re = st.executeQuery(sql);
            while (re.next()) {
                c_name.setText(re.getString("Customer_name"));
                c_type.setText(re.getString("Customer_type_fk"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(adminframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void findCustomer(user u, JTable customerTable) {
        DefaultTableModel dt = new DefaultTableModel();
        customerTable.setModel(dt);
        dt.addColumn("Id");
        dt.addColumn("Payments");
        dt.addColumn("Orders");
        dt.addColumn("Offers");
        try {

            Statement st = c.getConn().createStatement();
            String sql = "select * from Customer_Profile where cust_id= " + u.getId() + "";
            ResultSet re = st.executeQuery(sql);
            while (re.next()) {

                dt.addRow(new Object[]{re.getString("cust_id"),
                    re.getString("payments"),
                    re.getString("orders"), re.getString("offers")});

            }
            JOptionPane.showMessageDialog(null, "Done Successfully", "Report", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ID Not Found!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
