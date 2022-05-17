/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Jframes.Employeeframe;
import Jframes.adminframe;
import Repositories.EmployeeRepository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Employee{
//    private double salary;

    //Employee constructor
    public Employee() {}
    
    EmployeeRepository EmployeeModel = new EmployeeRepository();
    
    private DefaultTableModel drawTable(JTable table){
         DefaultTableModel tableModle = new DefaultTableModel();
            table.setModel(tableModle);
            tableModle.addColumn("Id");
            tableModle.addColumn("Name");
            tableModle.addColumn("Type");
            return tableModle;
    }
    
    public void login(EmployeeRepository Employee) {
        try {
            int count = 0;        
            ResultSet DBresult = EmployeeModel.EmployeeVerfication(Employee);
            while (DBresult.next()) {
                count = DBresult.getInt(1);
            }
            if (count == 1) {
                JOptionPane.showMessageDialog(null, "login successfully", "success", JOptionPane.INFORMATION_MESSAGE);
                new Employeeframe().setVisible(true);
                new adminframe().setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Username or Password! ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void add(EmployeeRepository Emloyee) {
        try {      
            EmployeeModel.addEmployee(Emloyee);           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void list(JTable emp_table) {
        DefaultTableModel tableModle = drawTable(emp_table);
        try {         
            ResultSet DBresult = EmployeeModel.listEmployees();
            while (DBresult.next()) {
                tableModle.addRow(new Object[]{DBresult.getString("emp_id"),
                    DBresult.getString("emp_name"),
                    DBresult.getString("emp_pass")});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void delete(EmployeeRepository Emloyee) {
        try {
            EmployeeModel.deleteEmployee(EmployeeModel);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void update(EmployeeRepository Emloyee) {
        try {

            EmployeeModel.updateEmployee(EmployeeModel);
            JOptionPane.showMessageDialog(null, "Employee has been updated successfully", "success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
      
    public void search(JTable search_table, EmployeeRepository Emloyee) {
        DefaultTableModel tableModle = drawTable(search_table);
        try {     
            ResultSet DBresult = EmployeeModel.SearchEmployee(Emloyee);
            while (DBresult.next()) {
                tableModle.addRow(new Object[]{DBresult.getString("emp_id"),
                DBresult.getString("emp_name"),
                DBresult.getString("emp_pass")});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void send(EmployeeRepository Emloyee, JTextField e_name, JPasswordField e_pass) {
        try {
            ResultSet DBresult = EmployeeModel.sendEmployee(Emloyee);
            while (DBresult.next()) {
                e_name.setText(DBresult.getString("emp_name"));
                e_pass.setText(DBresult.getString("emp_pass"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(adminframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    public void showoffer(JTable off_Table) {
        DefaultTableModel dt = new DefaultTableModel();
        off_Table.setModel(dt);
        dt.addColumn("offer_id");
        dt.addColumn("offer_details");
        try { 
            ResultSet DBresult = EmployeeModel.ShowOffers(off_Table);
            while (DBresult.next()) {
                dt.addRow(new Object[]{DBresult.getString("offer_id"),
                    DBresult.getString("offer_details")
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(adminframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
