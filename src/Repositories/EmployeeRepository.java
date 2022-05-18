package Repositories;

import java.sql.*;
import javax.swing.*;

public class EmployeeRepository extends ModulesData {

    public ResultSet EmployeeVerfication(EmployeeRepository employee) throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "select count(1) from Employee where emp_id=" + employee.getId() + " and emp_pass='" + employee.getPassword() + "'";
        ResultSet result = statement.executeQuery(sql);
        return result;
    }

    public void addEmployee(EmployeeRepository employee) throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "insert into Employee values (" + employee.getId() + ",'" + employee.getName() + "','" + employee.getPassword() + "')";
        statement.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Added Successfully", "Add", JOptionPane.INFORMATION_MESSAGE);
    }

    public ResultSet listEmployees() throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "select * from Employee";
        ResultSet result = statement.executeQuery(sql);
        return result;
    }

    public void deleteEmployee(EmployeeRepository employee) throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "delete from Employee where emp_id= '" + employee.getId() + "'";
        statement.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Employee has been deleted successfully", "success", JOptionPane.INFORMATION_MESSAGE);
    }

    public void updateEmployee(EmployeeRepository employee) throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "update Employee set emp_name='" + employee.getName() + "',emp_pass='" + employee.getPassword() + "' where emp_id='" + employee.getId() + "' ";
        statement.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Employee has been updated successfully", "success", JOptionPane.INFORMATION_MESSAGE);
    }

    public ResultSet SearchEmployee(EmployeeRepository employee) throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "select * from Employee where emp_id='" + employee.getId() + "'";
        ResultSet result = statement.executeQuery(sql);
        return result;
    }

    public ResultSet sendEmployee(EmployeeRepository employee) throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "select * from Employee where emp_id='" + employee.getId() + "'";
        ResultSet result = statement.executeQuery(sql);
        return result;
    }

    public ResultSet ShowOffers(JTable offerTable) throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "select * from offers";
        ResultSet result = statement.executeQuery(sql);
        return result;
    }
}
