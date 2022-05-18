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
import Classes.Customer;
import Classes.dbconnection;
import Jframes.adminframe;
import java.sql.Connection;
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

    private int orderID;
    private int time;
    private int quantity;

    dbconnection dataBaseConnection = new dbconnection();
    Connection connection = dataBaseConnection.getConn();

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setOrder(OrderRepository order, EmployeeRepository employee, MealsRepository meal, CustomerRepository customer, BillingRepository billing) {

        try {

            Statement statement = connection.createStatement();

            String sqlQuery = "set nocount off ; insert into orders  values (" + order.getQuantity() + "," + billing.totalPrice(meal, order, billing) + "," + customer.getId() + "," + employee.getId() + "," + meal.getMealId() + ")";

            statement.executeQuery(sqlQuery);

        } catch (SQLException exception) {

        }

    }

    public void cancelOrder(OrderRepository order) {

        try {
            Statement statement = connection.createStatement();
            String sqlQuery = "delete from orders where order_id='" + getOrderID() + "'";
            statement.executeUpdate(sqlQuery);
            JOptionPane.showMessageDialog(null, "Order has been deleted successfully", "success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException exception) {

            JOptionPane.showMessageDialog(null, exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public ResultSet showOrder() {

        ResultSet result = null;

        try {

            Statement statement = connection.createStatement();
            String sqlQuery = "select * from orders";
            result = statement.executeQuery(sqlQuery);

        } catch (SQLException exception) {
            Logger.getLogger(adminframe.class.getName()).log(Level.SEVERE, null, exception);
        }
        return result;

    }

}
