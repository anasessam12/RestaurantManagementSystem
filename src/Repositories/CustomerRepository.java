package Repositories;

import java.sql.*;
import javax.swing.JOptionPane;


public class CustomerRepository extends ModulesData{
    
      
     public void addCustomer(CustomerRepository customer) throws SQLException
    {
        Statement statement = connection.createStatement();
        String sql = "insert into Customer values (" + customer.getId() + ",'" + customer.getName() + "' )";
        statement.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Added Successfully", "Add", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public ResultSet listCustomers() throws SQLException
    {
        Statement statement = connection.createStatement();
        String sql = "select * from Customer";
        ResultSet result = statement.executeQuery(sql);
        return result;
    }
    
    public ResultSet SearchCustomers(CustomerRepository customer) throws SQLException
    {
       Statement statement = connection.createStatement();
       String sql = "select * from Customer  where Customer_id='" + customer.getId() + "'";
       ResultSet result = statement.executeQuery(sql);
       return result;
    }
    
    public void deleteCustomer(CustomerRepository customer) throws SQLException
    {
        Statement statement = connection.createStatement();
        String sql = "delete from Customer where Customer_id = " + customer.getId() + "";
        statement.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Employee has been deleted successfully", "success", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void updateCustomer(CustomerRepository customer) throws SQLException
    {
        Statement statement = connection.createStatement();
        String sql = "update Customer set "+
                "Customer_name='" + customer.getName() + 
                "' where Customer_id='" + customer.getId() + "' ";
        statement.executeUpdate(sql);
    }
    
    public ResultSet sendCustomer(CustomerRepository customer) throws SQLException
    {
       Statement statement = connection.createStatement();
       String sql = "select * from Customer  where Customer_id='" + customer.getId() + "'";
       ResultSet result = statement.executeQuery(sql);
       return result;
    }
}
