
package Classes;

import Jframes.Employeeframe;
import Jframes.adminframe;
import Repositories.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Admin {
    public Admin() {}
    
    AdminRepository AdminModel = new AdminRepository();
    
    drowTables drow_table = new drowTables();
    
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
            } 
            else {
                JOptionPane.showMessageDialog(null, "Invalid Username or Password! ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ReportAboutEmployees(int userRole, JTable report_table, ModulesData User, String descreption) {
        DefaultTableModel tableModel = drow_table.drawEmployeeTable(report_table);
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
                } 
                else {
                    JOptionPane.showMessageDialog(null, "ID Not Found!!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }    
    }
    
    

}
