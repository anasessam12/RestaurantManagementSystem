/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Jframes.adminframe;
import Repositories.BillingRepository;
import Repositories.CustomerRepository;
import Repositories.EmployeeRepository;
import Repositories.MealsRepository;
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

    public Order() {

    }

    public void setOrder(OrderRepository order, EmployeeRepository employee, MealsRepository meal, CustomerRepository customer, BillingRepository billing) {

        new OrderRepository().setOrder(order, employee, meal, customer, billing);

    }

    public void cancelOrder(OrderRepository order) {

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
