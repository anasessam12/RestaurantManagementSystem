
package Repositories;

import Classes.dbconnection;
import java.sql.*;
import javax.swing.*;
import java.util.logging.*;
import Jframes.adminframe;

public class MealsRepository {

    public int mealId;
    public String mealName;
    public double price;
    public int quantity;
    dbconnection dataBaseConnection = dbconnection.getInstance();
    Connection connection = dataBaseConnection.getDatabase_connection();

    public void setMealId(int mealId) {
        this.mealId = mealId;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getMealId() {
        return mealId;
    }

    public String getMealName() {
        return mealName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void add(MealsRepository meal, AdminRepository admin) {
        try {
            Statement statement = connection.createStatement();
            String sqlQuery = "insert into meals values (" + meal.getMealId() + ",'" + meal.getMealName() + "'," + meal.getPrice() + "," + meal.getQuantity() + "," + admin.getId() + ")";
            statement.executeUpdate(sqlQuery);
            JOptionPane.showMessageDialog(null, "Added Successfully", "Add", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException exception) {

            JOptionPane.showMessageDialog(null, exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ResultSet list(JTable meal_table2) {
        ResultSet result = null;
        try {
            Statement statement = connection.createStatement();
            String sqlQuery = "select * from meals";
            result = statement.executeQuery(sqlQuery);
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }

    public ResultSet search(JTable search_table1, MealsRepository meals) {
        ResultSet result = null;
        try {
            Statement statement = connection.createStatement();
            String sqlQuery = "select * from meals where meal_id='" + meals.getMealId() + "'";
            result = statement.executeQuery(sqlQuery);

        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }

    public void delete(MealsRepository meal) {
        try {
            Statement statement = connection.createStatement();
            String sqlQuery = "delete from meals where meal_id = " + meal.getMealId() + "";
            statement.executeUpdate(sqlQuery);
            JOptionPane.showMessageDialog(null, "Meal has been deleted successfully", "success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void update(MealsRepository meal) {
        try {
            Statement statement = connection.createStatement();
            String sqlQuery = "update meals set meal_name='" + meal.getMealName() + "',meal_price='" + meal.getPrice() + "',meal_quantity='" + meal.getQuantity() + "' where meal_id='" + meal.getMealId() + "' ";
            statement.executeUpdate(sqlQuery);
            JOptionPane.showMessageDialog(null, "meal has been updated successfully", "success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ResultSet send(MealsRepository meal) {
        ResultSet result = null;
        try {
            Statement statement = connection.createStatement();
            String sqlQuery = "select * from meals where meal_id='" + meal.getMealId() + "'";
            result = statement.executeQuery(sqlQuery);
        } catch (SQLException exception) {
            Logger.getLogger(adminframe.class
                    .getName()).log(Level.SEVERE, null, exception);
        }
        return result;
    }
}
