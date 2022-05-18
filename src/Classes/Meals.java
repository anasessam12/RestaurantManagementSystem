
package Classes;

import Repositories.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Meals {
    
    public Meals() {}
    
    public void addMeal(MealsRepository meal, AdminRepository admin) {
        new MealsRepository().add(meal, admin);
    }
    
    drowTables drow_table = new drowTables();
    
    public void listMeals(JTable meal_table2) throws SQLException { 
        DefaultTableModel dataTable = drow_table.drawMealsTable(meal_table2);
        ResultSet result = new MealsRepository().list(meal_table2);
        while (result.next()) {
            dataTable.addRow(new Object[]{result.getString("meal_id"),
                result.getString("meal_name"),
                result.getString("meal_price"),
                result.getString("meal_quantity")});
        }
    }

    public void searchMeals(JTable search_table1, MealsRepository meal) throws SQLException {
       DefaultTableModel dataTable = drow_table.drawEmployeeTable(search_table1);
        ResultSet result = new MealsRepository().search(search_table1, meal);
        while (result.next()) {
            dataTable.addRow(new Object[]{result.getString("meal_id"),
                result.getString("meal_name"),
                result.getString("meal_price"),
                result.getString("meal_quantity")});
        }
    }

    public void deleteMeal(MealsRepository meal) {
        new MealsRepository().delete(meal);
    }

    public void updateMeal(MealsRepository m) {
        new MealsRepository().update(m);
    }

    public void sendMeal(MealsRepository meal, JTextField m_name, JTextField m_price, JTextField m_quan) throws SQLException {
        ResultSet result = new MealsRepository().send(meal);
        while (result.next()) {
            m_name.setText(result.getString("meal_name"));
            m_price.setText(result.getString("meal_price"));
            m_quan.setText(result.getString("meal_quantity"));
        }
    }
}
