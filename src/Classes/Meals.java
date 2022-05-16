/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Jframes.adminframe;
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

/**
 *
 * @author 20112
 */
public class Meals {

    protected int mealId;
    protected String mealName;
    protected double price;
    protected int quantity;
    dbconnection c = new dbconnection();

    public Meals() {

    }

    public Meals(int mealId, String mealName, double price, int quantity) {
        this.mealId = mealId;
        this.mealName = mealName;
        this.price = price;
        this.quantity = quantity;
    }

    public void setMealId(int mealId) {
        this.mealId = mealId;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getMealId() {
        return mealId;
    }

    public String getMealName() {
        return mealName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void add(Meals m, Admin a) {
        try {

            Statement st = c.getConn().createStatement();
            String sql = "insert into meals values (" + m.getMealId() + ",'" + m.getMealName() + "'," + m.getPrice() + "," + m.getQuantity() + "," + a.getId() + ")";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Added Successfully", "Add", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    public void list(JTable meal_table2) {
        DefaultTableModel dt = new DefaultTableModel();

        meal_table2.setModel(dt);
        dt.addColumn("Id");
        dt.addColumn("Name");
        dt.addColumn("price");
        dt.addColumn("quantity");

        try {
            // TODO add your handling code here:
            Statement st = c.getConn().createStatement();
            String sql = "select * from meals";
            ResultSet re = st.executeQuery(sql);
            while (re.next()) {

                dt.addRow(new Object[]{re.getString("meal_id"),
                    re.getString("meal_name"),
                    re.getString("meal_price"),
                    re.getString("meal_quantity")});

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void search(JTable search_table1, Meals m) {
        DefaultTableModel dt = new DefaultTableModel();
        search_table1.setModel(dt);
        dt.addColumn("Id");
        dt.addColumn("Name");
        dt.addColumn("price");
        dt.addColumn("quantity");
        try {

            Statement st = c.getConn().createStatement();
            String sql = "select * from meals where meal_id='" + m.getMealId() + "'";
            ResultSet re = st.executeQuery(sql);
            while (re.next()) {

                dt.addRow(new Object[]{re.getString("meal_id"),
                    re.getString("meal_name"),
                    re.getString("meal_price"),
                    re.getString("meal_quantity")});

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void delete(Meals m) {

        try {
            Statement st = c.getConn().createStatement();
            String sql = "delete from meals where meal_id = " + m.getMealId() + "";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Meal has been deleted successfully", "success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void update(Meals m) {
        try {

            Statement st = c.getConn().createStatement();
            String sql = "update meals set meal_name='" + m.getMealName() + "',meal_price='" + m.getPrice() + "',meal_quantity='" + m.getQuantity() + "' where meal_id='" + m.getMealId() + "' ";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "meal has been updated successfully", "success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void send(Meals m, JTextField m_name, JTextField m_price, JTextField m_quan) {
        try {

            Statement st = c.getConn().createStatement();
            String sql = "select * from meals where meal_id='" + m.getMealId() + "'";

            ResultSet re = st.executeQuery(sql);
            while (re.next()) {
                m_name.setText(re.getString("meal_name"));
                m_price.setText(re.getString("meal_price"));
                m_quan.setText(re.getString("meal_quantity"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(adminframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
