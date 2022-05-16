/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Repositories.BillingRepository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Egy
 */
public class Billing {

    float mealPrice = 0;
    float totalPrice = 0;

    public float totalPrice(Meals meal, Order order , Billing billing) throws SQLException {

        ResultSet result = new BillingRepository().totalPrice(meal, order, this);
        
        while (result.next()) {
                billing.mealPrice = result.getFloat("meal_price");
            }

        totalPrice = mealPrice * order.getQuantity();

        return totalPrice;

    }

}
