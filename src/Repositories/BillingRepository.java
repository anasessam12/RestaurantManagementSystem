/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Classes.Billing;
import Classes.Meals;
import Classes.Order;
import java.sql.Connection;
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

    dbconnection dataBaseConnection = new dbconnection();
    Connection connection = dataBaseConnection.getConn();
    public float mealPrice = 0;
    public float totalPrice = 0;

    public float getMealPrice() {
        return mealPrice;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setMealPrice(float mealPrice) {
        this.mealPrice = mealPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public ResultSet totalPrice(MealsRepository meal, OrderRepository order, BillingRepository billing) {
        ResultSet result = null;
        try {

            Statement statement = connection.createStatement();
            String sqlQuery = "select meal_price from meals where meal_id=" + meal.getMealId() + "";
            result = statement.executeQuery(sqlQuery);

        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return result;

    }

}
