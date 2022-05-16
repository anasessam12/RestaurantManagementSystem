/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Jframes.adminframe;
import java.sql.*;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Repositories.OrderRepository;

/**
 *
 * @author 20112
 */
public class Order {

    private int orderID;
    private int time;
    private int quantity;
    dbconnection connection = new dbconnection();
    float mealPrice = 0;
    float totalPrice = 0;

    public Order() {

    }

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

    public void setOrder(Order order, Employee employee, Meals meal, customer customer, Billing billing) {

        new OrderRepository().setOrder(order, employee, meal, customer, billing);

    }

    public void cancelOrder(Order order) {

        new OrderRepository().cancelOrder(order);

    }

    public void showOrder(JTable order_Table) throws SQLException {

        DefaultTableModel dataModel = new DefaultTableModel();

        order_Table.setModel(dataModel);
        dataModel.addColumn("ID");
        dataModel.addColumn("Quantity");
        dataModel.addColumn("Total Billing");
        dataModel.addColumn("Customer ID");
        dataModel.addColumn("Employee ID");
        dataModel.addColumn("Meal ID");

        ResultSet result = new OrderRepository().showOrder();

        while (result.next()) {

            dataModel.addRow(new Object[]{result.getString("order_id"),
                result.getString("MEALS_quantity"), result.getString("total_biling"), result.getString("cust_id"), result.getString("emplo_id"), result.getString("meal_ID")
            });

        }
    }

}
