/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Classes.Billing;
import Classes.Employee;
import Classes.Meals;
import Classes.Order;
import Classes.customer;
import Classes.dbconnection;
import Jframes.adminframe;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Egy
 */
public class OrderRepository {

    dbconnection connection = new dbconnection();

    public void setOrder(Order order, Employee employee, Meals meal, customer customer, Billing billing) {

        try {

            Statement statement = connection.getConn().createStatement();

            String sqlQuery = "set nocount off ; insert into orders  values (" + order.getQuantity() + "," + billing.totalPrice(meal, order, billing) + "," + customer.getId() + "," + employee.getId() + "," + meal.getMealId() + ")";
//            String sql = "set nocount off ;insert into order_detalis  values (" +o.getQuantity()+","+m.getMealId()+")";
//      st.executeQuery(sql);
            statement.executeQuery(sqlQuery);

        } catch (SQLException exception) {

//    JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }

    }

    public void cancelOrder(Order order) {

        try {
            Statement statement = connection.getConn().createStatement();
            String sqlQuery = "delete from orders where order_id='" + order.getOrderID() + "'";
            statement.executeUpdate(sqlQuery);
            JOptionPane.showMessageDialog(null, "Order has been deleted successfully", "success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException exception) {

            JOptionPane.showMessageDialog(null, exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public ResultSet showOrder() {

        ResultSet result = null;

        try {

            Statement statement = connection.getConn().createStatement();
            String sqlQuery = "select * from orders";
            result = statement.executeQuery(sqlQuery);

        } catch (SQLException exception) {
            Logger.getLogger(adminframe.class.getName()).log(Level.SEVERE, null, exception);
        }
        return result;

    }

}
