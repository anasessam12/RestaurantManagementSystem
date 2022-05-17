/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Repositories.BillingRepository;
import Repositories.CustomerRepository;
import Repositories.MealsRepository;
import Repositories.ModulesData;
import Repositories.OrderRepository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Billing {

    public float totalPrice(MealsRepository meal, OrderRepository order, BillingRepository billing) throws SQLException {

        ResultSet result = new BillingRepository().totalPrice(meal, order, billing);

        while (result.next()) {
            billing.mealPrice = result.getFloat("meal_price");
        }

        billing.totalPrice = billing.mealPrice * order.getQuantity();

        return billing.totalPrice;

    }

}
