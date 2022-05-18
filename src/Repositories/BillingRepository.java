
package Repositories;

import Classes.dbconnection;
import java.sql.*;
import javax.swing.JOptionPane;

public class BillingRepository {

    dbconnection dataBaseConnection = dbconnection.getInstance();
    Connection connection = dataBaseConnection.getDatabase_connection();
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
