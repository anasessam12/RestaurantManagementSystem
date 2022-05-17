/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;


import Classes.dbconnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author LEGION
 */
public class AdminRepository extends ModulesData{ 
    
    public ResultSet AdminVerfication(AdminRepository admin) throws SQLException
    {
        Statement statement = connection.createStatement();
        String sql = "select count(1) from adminn where admin_id=" + admin.getId() + " and admin_pass='" + admin.getPassword() + "'";
        ResultSet result = statement.executeQuery(sql);
        return result;
    }
    
    public ResultSet GetEmployeeData (ModulesData user) throws SQLException
    {
        Statement statement = connection.createStatement();
        String sql = "select * from Employee where emp_id = " + user.getId() + "";
        ResultSet result = statement.executeQuery(sql);
        return result;
    }
    
    public ResultSet GetCustomerData (ModulesData user) throws SQLException
    {
        Statement statement = connection.createStatement();
        String sql = "select * from Customer where Customer_id = " + user.getId() + "";
        ResultSet result = statement.executeQuery(sql);
        return result;
    }
    
    public void SettingOffer(OfferRepository offer, AdminRepository admin) throws SQLException
    {
        Statement statement = connection.createStatement();
        String sql = "insert into offers values (" + offer.getOfferId() + ",'" + offer.getOfferDetails() + "'," + admin.getId() + ")";
        statement.executeUpdate(sql);
        
    }
}
