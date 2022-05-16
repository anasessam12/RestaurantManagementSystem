/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Classes.Billing;
import Classes.Meals;
import Classes.Order;
import Classes.dbconnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Egy
 */
public class BillingRepository {

    dbconnection connection = new dbconnection();

    public ResultSet totalPrice(Meals meal, Order order, Billing billing) {
        ResultSet result = null;
        try {

            Statement statement = connection.getConn().createStatement();
            String sqlQuery = "select meal_price from meals where meal_id=" + meal.getMealId() + "";
            result = statement.executeQuery(sqlQuery);

        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return result;

    }

}
