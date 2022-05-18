package Classes;

import Interfaces.BillingInterface;
import Repositories.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Billing implements BillingInterface {

    @Override
    public float totalPrice(MealsRepository meal, OrderRepository order, BillingRepository billing) {

        ResultSet result = new BillingRepository().totalPrice(meal, order, billing);

        try {
            while (result.next()) {
                billing.mealPrice = result.getFloat("meal_price");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Billing.class.getName()).log(Level.SEVERE, null, ex);
        }

        billing.totalPrice = billing.mealPrice * order.getQuantity();
        
        
        
        return billing.totalPrice;

    }

}
