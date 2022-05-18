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

    drowTables drow_table = new drowTables();
    
    
    
    public void AddCustomer(CustomerRepository Customer) {
        try {
            CustomerModel.addCustomer(Customer);
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ListCustomers(JTable employeeTable) {
            DefaultTableModel tableModle = drow_table.drawEmployeeTable(employeeTable);
        try {
            ResultSet DBresult = CustomerModel.listCustomers();
            while (DBresult.next()) {
                tableModle.addRow(new Object[]{
                    DBresult.getString("Customer_id"),
                    DBresult.getString("Customer_name"),  
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

    public void SearchForCustomer(JTable searchTable, CustomerRepository Customer) {
            DefaultTableModel tableModle = drow_table.drawEmployeeTable(searchTable);
        try {
            ResultSet DBresult = CustomerModel.SearchForCustomers(Customer);
            while (DBresult.next()) {
                tableModle.addRow(new Object[]{
                    DBresult.getString("Customer_id"),
                    DBresult.getString("Customer_name"),
                });
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void DeleteACustomer(CustomerRepository Customer) {
        try {
            CustomerModel.deleteCustomer(Customer);
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void UpdateCustomer(CustomerRepository Customer) {
        try {
            CustomerModel.updateCustomer(Customer);
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void SendCustomer(CustomerRepository Customer, JTextField c_name,  JTextField id_field) {
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
