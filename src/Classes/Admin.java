/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Jframes.Employeeframe;
import Jframes.adminframe;
import Repositories.AdminRepository;
import Repositories.ModulesData;
import Repositories.OfferRepository;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 20112
 */
//REPORTS
public class Admin {

    public Admin() {}
    
    AdminRepository AdminModel = new AdminRepository();
    
    public void login(AdminRepository Admin) {

        try {
            int count = 0;
            ResultSet DBresult = AdminModel.AdminVerfication(Admin);
            while (DBresult.next()) {
                count = DBresult.getInt(1);
            }
            if (count == 1) {
                JOptionPane.showMessageDialog(null, "login successfully", "success", JOptionPane.INFORMATION_MESSAGE);
                new Employeeframe().setVisible(false);
                new adminframe().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Username or Password! ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void report(int userRole, JTable report_table, ModulesData User, String descreption) {
        DefaultTableModel tableModel = new DefaultTableModel();
        report_table.setModel(tableModel);
        tableModel.addColumn("Id");
        tableModel.addColumn("Name");
        tableModel.addColumn("Passowrd");
        tableModel.addColumn("Description");
        
        if (userRole == 2) {       
            try {
                int count = 0;
                ResultSet DBresult = AdminModel.GetEmployeeData(User);
                while (DBresult.next()) {
                    tableModel.addRow(new Object[]{DBresult.getString("emp_id"),
                    DBresult.getString("emp_name"),
                    DBresult.getString("emp_pass"), (descreption)});
                    count = 1;
                }
                if (count == 1) {
                    JOptionPane.showMessageDialog(null, "Done Successfully", "Report", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "ID Not Found!!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            try {
                int count = 0;
                 ResultSet DBresult = AdminModel.GetCustomerData(User);
                while (DBresult.next()) {
                    tableModel.addRow(new Object[]{DBresult.getString("Customer_id"),
                    DBresult.getString("Customer_name"), (descreption)});
                    count = 1;
                }
                if (count == 1) {
                    JOptionPane.showMessageDialog(null, "Done Successfully", "Report", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "ID Not Found!!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void setOffer(OfferRepository o, AdminRepository Admin) {
        try {
            AdminModel.SettingOffer(o, Admin);
            JOptionPane.showMessageDialog(null, "Added Successfully", "Add", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "This ID is already exist!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
