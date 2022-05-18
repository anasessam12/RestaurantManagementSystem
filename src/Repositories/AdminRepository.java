
package Repositories;

import java.sql.*;

public class AdminRepository extends ModulesData{ 
   
    public ResultSet AdminVerfication(AdminRepository admin) throws SQLException
    {
        Statement statement = connection.createStatement();
        String sql = "select count(1) from adminn where admin_id=" + admin.getId() + " and admin_pass='" + admin.getPassword() + "'";
        ResultSet resultofquery = statement.executeQuery(sql);
        return resultofquery;
    }
    
    public ResultSet GetEmployeeData (ModulesData user) throws SQLException
    {
        Statement statement = connection.createStatement();
        String sql = "select * from Employee where emp_id = " + user.getId() + "";
        ResultSet resultofquery = statement.executeQuery(sql);
        return resultofquery;
    }
    
    public ResultSet GetCustomerData (ModulesData user) throws SQLException
    {
        Statement statement = connection.createStatement();
        String sql = "select * from Customer where Customer_id = " + user.getId() + "";
        ResultSet resultofquery = statement.executeQuery(sql);
        return resultofquery;
    }
    
    
}
