
package Classes;

import Classes.drowTables;
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

    public Employee() {}
    
    EmployeeRepository EmployeeModel = new EmployeeRepository();
    
    drowTables drow_table = new drowTables();
    
    public void login(EmployeeRepository Employee) 
    {
        try {
                int dataBase_verfication = 0;        
                ResultSet DBresult = EmployeeModel.EmployeeVerfication(Employee);
                while (DBresult.next()) 
                {
                    dataBase_verfication = DBresult.getInt(1);
                }

                if (dataBase_verfication == 1){
                    JOptionPane.showMessageDialog(null, "login successfully", "success", JOptionPane.INFORMATION_MESSAGE);
                    new Employeeframe().setVisible(true);
                    new adminframe().setVisible(false);
                } 
                else{
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password! ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        
        catch (SQLException SQL_exception) 
        {
            JOptionPane.showMessageDialog(null, SQL_exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void add(EmployeeRepository Employee) 
    {
        try 
        {      
            EmployeeModel.addEmployee(Employee);           
        } 
        catch (SQLException SQL_exception)
        {
            JOptionPane.showMessageDialog(null, SQL_exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void list(JTable Employee_Table) {
        DefaultTableModel tableModle = drow_table.drawEmployeeTable(Employee_Table);
        
        try 
        {         
            ResultSet DBresult = EmployeeModel.listEmployees();
            while (DBresult.next()) {
                tableModle.addRow(new Object[]{DBresult.getString("emp_id"),
                    DBresult.getString("emp_name"),
                    DBresult.getString("emp_pass")});
            }
        } 
        catch (SQLException SQL_exception) 
        {
            JOptionPane.showMessageDialog(null, SQL_exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void delete(EmployeeRepository Employee) {
        try 
        {
            EmployeeModel.deleteEmployee(Employee);
        } 
        catch (SQLException SQL_exception) 
        {
            JOptionPane.showMessageDialog(null, SQL_exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void update(EmployeeRepository Employee) {
        try 
        {

            EmployeeModel.updateEmployee(Employee);
            JOptionPane.showMessageDialog(null, "Employee has been updated successfully", "success", JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (SQLException SQL_exception) 
        {
            JOptionPane.showMessageDialog(null, SQL_exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
      
    public void search(JTable search_table, EmployeeRepository Employee) {
        DefaultTableModel tableModle = drow_table.drawEmployeeTable(search_table);
        try 
        {     
                ResultSet DBresult = EmployeeModel.SearchEmployee(Employee);
                while (DBresult.next()) 
                {
                    tableModle.addRow(new Object[]{DBresult.getString("emp_id"),
                    DBresult.getString("emp_name"),
                    DBresult.getString("emp_pass")});
                }
        } 
        catch (SQLException SQL_exception) 
        {
            JOptionPane.showMessageDialog(null, SQL_exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void send(EmployeeRepository Employee, JTextField Employee_name, JPasswordField Employee_password) {
        try 
        {
            ResultSet DBresult = EmployeeModel.sendEmployee(Employee);
            while (DBresult.next()) {
                Employee_name.setText(DBresult.getString("emp_name"));
                Employee_password.setText(DBresult.getString("emp_pass"));
            }
        } 
        catch (SQLException SQL_exception) {
            Logger.getLogger(adminframe.class.getName()).log(Level.SEVERE, null, SQL_exception);
        }
    }
   
    
}
