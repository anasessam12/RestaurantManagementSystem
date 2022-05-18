package Repositories;

import Classes.dbconnection;
import java.sql.*;
import javax.swing.JOptionPane;


public class CustomerRepository extends ModulesData{
    dbconnection dataBaseConnection = new dbconnection();
    
     public void addCustomer(CustomerRepository Customer) throws SQLException
    {
        Statement statmaent = dataBaseConnection.getConn().createStatement();
        String sql = "insert into Customer values (" + Customer.getId() + ",'" + Customer.getName() + "' )";
        statmaent.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Added Successfully", "Add", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public ResultSet listCustomers() throws SQLException
    {
        Statement statmaent = dataBaseConnection.getConn().createStatement();
        String sql = "select * from Customer";
        ResultSet result = statmaent.executeQuery(sql);
        return result;
    }
    
    public ResultSet SearchCustomers(CustomerRepository Customer) throws SQLException
    {
       Statement statmaent = dataBaseConnection.getConn().createStatement();
       String sql = "select * from Customer  where Customer_id='" + Customer.getId() + "'";
       ResultSet result = statmaent.executeQuery(sql);
       return result;
    }
    
    public void deleteCustomer(CustomerRepository Customer) throws SQLException
    {
        Statement statmaent = dataBaseConnection.getConn().createStatement();
        String sql = "delete from Customer where Customer_id = " + Customer.getId() + "";
        statmaent.executeUpdate(sql);
    }
    
    public void updateCustomer(CustomerRepository Customer) throws SQLException
    {
        Statement statmaent = dataBaseConnection.getConn().createStatement();
        String sql = "update Customer set "+
                "Customer_name='" + Customer.getName() + 
                "' where Customer_id='" + Customer.getId() + "' ";
        statmaent.executeUpdate(sql);
    }
}
