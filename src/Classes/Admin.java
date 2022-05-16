/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Jframes.Employeeframe;
import Jframes.adminframe;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 20112
 */
//REPORTS
public class Admin extends user {

    public Admin() {
    }

    

    public void login(Admin a) {
        try {
            int count = 0;
            Statement st = c.getConn().createStatement();
            String sql = "select count(1) from adminn where admin_id=" + a.getId() + " and admin_pass='" + a.getPassword() + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                count = rs.getInt(1);
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

    public void report(int userRole, JTable report_table, user u, String descreption) {
        DefaultTableModel dt = new DefaultTableModel();
        report_table.setModel(dt);
        if (userRole == 2) {
            dt.addColumn("Id");
            dt.addColumn("Name");
            dt.addColumn("Passowrd");
            dt.addColumn("Description");
            try {
                // TODO add your handling code here:
                int count = 0;
                Statement st = c.getConn().createStatement();
                String sql = "select * from Employee where emp_id = " + u.getId() + "";
                ResultSet re = st.executeQuery(sql);
                while (re.next()) {
                    dt.addRow(new Object[]{re.getString("emp_id"),
                        re.getString("emp_name"),
                        re.getString("emp_pass"), (descreption)});
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
            dt.addColumn("Id");
            dt.addColumn("Name");
            dt.addColumn("Type");
            dt.addColumn("Description");
            try {
                // TODO add your handling code here:
                int count = 0;
                Statement st = c.getConn().createStatement();
                String sql = "select * from Customer where Customer_id = " + u.getId() + "";
                ResultSet re = st.executeQuery(sql);
                while (re.next()) {

                    dt.addRow(new Object[]{re.getString("Customer_id"),
                        re.getString("Customer_name"),
                        re.getString("Customer_type_fk"), (descreption)});
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

    public void setOffer(Offer o, Admin a) {

        try {
            Statement st = c.getConn().createStatement();
            String sql = "insert into offers values (" + o.getOfferId() + ",'" + o.getOfferDetails() + "'," + a.getId() + ")";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Added Successfully", "Add", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "This ID is already exist!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
