
package Repositories;

import Classes.dbconnection;
import Jframes.adminframe;
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;

public class OrderRepository {

    private int orderID;
    private int time;
    private int quantity;

    dbconnection dataBaseConnection = dbconnection.getInstance();
    Connection connection = dataBaseConnection.getDatabase_connection();

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
            String sqlQuery = "insert into orders (total_biling ,cust_id, emplo_id, mail_id,quantity )  values (" +  billing.totalPrice(meal, order, billing) + 
                    "," + customer.getId() + "," + employee.getId() + "," + meal.getMealId() + "," + order.getQuantity() + ")";          
            statement.executeQuery(sqlQuery);
            JOptionPane.showMessageDialog(null, "Order has been set successfully", "success", JOptionPane.INFORMATION_MESSAGE);
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
