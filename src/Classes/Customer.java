package Classes;

import Jframes.adminframe;
import Repositories.CustomerRepository;
import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Customer {

   
    CustomerRepository CustomerModel = new CustomerRepository();
    
    public Customer() {}

    public DefaultTableModel drawTable(JTable table){
         DefaultTableModel tableModle = new DefaultTableModel();
            table.setModel(tableModle);
            tableModle.addColumn("Id");
            tableModle.addColumn("Name");
            
            return tableModle;
    }
    
    public void add(CustomerRepository Customer) {
        try {
            CustomerModel.addCustomer(Customer);
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void list(JTable employeeTable) {
        DefaultTableModel dataTable = drawTable(employeeTable);
        try {
            ResultSet DBresult = CustomerModel.listCustomers();
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
            ResultSet DBresult = CustomerModel.SearchCustomers(Customer);
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
            CustomerModel.deleteCustomer(Customer);
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(CustomerRepository Customer) {
        try {
            CustomerModel.updateCustomer(Customer);
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void send(CustomerRepository Customer, JTextField c_name,  JTextField id_field) {
        try {
            ResultSet DBresult = CustomerModel.sendCustomer(Customer);
            while (DBresult.next()) {
                c_name.setText(DBresult.getString("Customer_name"));
                id_field.setText(DBresult.getString("Customer_id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(adminframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
