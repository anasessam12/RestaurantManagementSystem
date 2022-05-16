package Classes;

import Jframes.adminframe;
import Repositories.CustomerRepository;
import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


enum cust_type {
    Markting, Loyalty, Reward
};

public class Customer extends user {

    cust_type type;
    CustomerRepository CustomerQuery = new CustomerRepository();
    
    public Customer() {};

    public Customer(cust_type type, int id, String name, String password) {   
        this.id = id;
        this.name = name;
        this.Password = password;  
        this.type = type;
    }

    
    public cust_type getType() {
        return type;
    }
    DefaultTableModel drawTable(JTable table){
         DefaultTableModel tableModle = new DefaultTableModel();
            table.setModel(tableModle);
            tableModle.addColumn("Id");
            tableModle.addColumn("Name");
            tableModle.addColumn("Type");
            return tableModle;
    }
    
    public void add(user Customer) {
        try {
            CustomerQuery.addCustomer(Customer);
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
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

    public void search(JTable searchTable, user Customer) {
       DefaultTableModel dataTable = drawTable(searchTable);
        try {
            ResultSet DBresult = CustomerQuery.SearchCustomers(Customer);
            while (DBresult.next()) {
                dataTable.addRow(new Object[]{
                    DBresult.getString("Customer_id"),
                    DBresult.getString("Customer_name"),
                    DBresult.getString("Customer_type_fk")
                });
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void delete(user Customer) {
        try {
            CustomerQuery.deleteCustomer(Customer);
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(user Customer) {
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
