package Classes;

import Jframes.adminframe;
import Repositories.CustomerRepository;
import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Customer {

   
    CustomerRepository CustomerQuery = new CustomerRepository();
    
    public Customer() {};

    DefaultTableModel drawTable(JTable table){
         DefaultTableModel tableModle = new DefaultTableModel();
            table.setModel(tableModle);
            tableModle.addColumn("Id");
            tableModle.addColumn("Name");
            tableModle.addColumn("Type");
            return tableModle;
    }
    
    public void add(CustomerRepository Customer) {
        try {
            CustomerQuery.addCustomer(Customer);
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void list(JTable employeeTable) {
        DefaultTableModel dataTable = drawTable(employeeTable);
        try {
            ResultSet DBresult = CustomerQuery.listCustomers();
            while (DBresult.next()) {
                dataTable.addRow(new Object[]{
                    DBresult.getString("Customer_id"),
                    DBresult.getString("Customer_name"),  
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

    public void search(JTable searchTable, CustomerRepository Customer) {
       DefaultTableModel dataTable = drawTable(searchTable);
        try {
            ResultSet DBresult = CustomerQuery.SearchCustomers(Customer);
            while (DBresult.next()) {
                dataTable.addRow(new Object[]{
                    DBresult.getString("Customer_id"),
                    DBresult.getString("Customer_name"),
                });
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void delete(CustomerRepository Customer) {
        try {
            CustomerQuery.deleteCustomer(Customer);
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(CustomerRepository Customer) {
        try {
            CustomerQuery.updateCustomer(Customer);
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void send(user u, JTextField c_name,  JTextField id_field) {
        try {

            Statement st = c.getConn().createStatement();
            String sql = "select * from Customer where Customer_id='" + u.getId() + "'";

            ResultSet re = st.executeQuery(sql);
            while (re.next()) {
                c_name.setText(re.getString("Customer_name"));
                id_field.setText(re.getString("Customer_id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(adminframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
