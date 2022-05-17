/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Jframes.adminframe;
import Repositories.AdminRepository;
import Repositories.MealsRepository;
import Repositories.OrderRepository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 20112
 */
public class Meals {

    public Meals() {

    }

    public void add(MealsRepository meal, AdminRepository admin) {

        new MealsRepository().add(meal, admin);

    }

    public void list(JTable meal_table2) throws SQLException {
        DefaultTableModel datamodel = new DefaultTableModel();

        meal_table2.setModel(datamodel);
        datamodel.addColumn("Id");
        datamodel.addColumn("Name");
        datamodel.addColumn("price");
        datamodel.addColumn("quantity");

        ResultSet result = new OrderRepository().showOrder();

        while (result.next()) {

            datamodel.addRow(new Object[]{result.getString("meal_id"),
                result.getString("meal_name"),
                result.getString("meal_price"),
                result.getString("meal_quantity")});

        }
    }

    public void search(JTable search_table1, MealsRepository meal) throws SQLException {
        DefaultTableModel datamodel = new DefaultTableModel();
        search_table1.setModel(datamodel);
        datamodel.addColumn("Id");
        datamodel.addColumn("Name");
        datamodel.addColumn("price");
        datamodel.addColumn("quantity");

        ResultSet result = new MealsRepository().search(search_table1, meal);

        while (result.next()) {

            datamodel.addRow(new Object[]{result.getString("meal_id"),
                result.getString("meal_name"),
                result.getString("meal_price"),
                result.getString("meal_quantity")});
        }
    }

    public void delete(MealsRepository meal) {

        new MealsRepository().delete(meal);

    }

    public void update(MealsRepository m) {

        new MealsRepository().update(m);

    }

    public void send(MealsRepository meal, JTextField m_name, JTextField m_price, JTextField m_quan) throws SQLException {

        ResultSet result = new MealsRepository().send(meal);
        while (result.next()) {
            m_name.setText(result.getString("meal_name"));
            m_price.setText(result.getString("meal_price"));
            m_quan.setText(result.getString("meal_quantity"));

        }

    }

}
