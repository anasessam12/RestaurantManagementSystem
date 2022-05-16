package Repositories;

import Classes.dbconnection;
import Classes.user;
import java.sql.*;
import javax.swing.JOptionPane;


public class CustomerRepository {
    dbconnection dataBaseConnection = new dbconnection();
    
     public void addCustomer(user Customer) throws SQLException
    {
        Statement statmaent = dataBaseConnection.getConn().createStatement();
        String sql = "insert into Customer values (" + Customer.getId() + ",'" + Customer.getName() + "'," + Customer.getRole_id() + ")";
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
    
    public ResultSet SearchCustomers(user Customer) throws SQLException
    {
       Statement statmaent = dataBaseConnection.getConn().createStatement();
       String sql = "select * from Customer  where Customer_id='" + Customer.getId() + "'";
       ResultSet result = statmaent.executeQuery(sql);
       return result;
    }
    
    public void deleteCustomer(user Customer) throws SQLException
    {
        Statement statmaent = dataBaseConnection.getConn().createStatement();
        String sql = "delete from Customer where Customer_id = " + Customer.getId() + "";
        statmaent.executeUpdate(sql);
    }
    
    public void updateCustomer(user Customer) throws SQLException
    {
        Statement statmaent = dataBaseConnection.getConn().createStatement();
        String sql = "update Customer set "+
                "Customer_name='" + Customer.getName() + 
                "',Customer_type_fk='" + Customer.getRole_id() +
                "' where Customer_id='" + Customer.getId() + "' ";
        statmaent.executeUpdate(sql);
    }
}
