
package Classes;

import Repositories.*;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Repositories.OrderRepository;

public class Order {

    public Order() {}

    drowTables drow_table = new drowTables();
    
    public void setOrder(OrderRepository order, EmployeeRepository employee, MealsRepository meal, CustomerRepository customer, BillingRepository billing) {
        new OrderRepository().setOrder(order, employee, meal, customer, billing);
    }

    public void cancelOrder(OrderRepository order) {
        new OrderRepository().cancelOrder(order);
    }

    public void showOrder(JTable order_Table) throws SQLException {
        DefaultTableModel dataModel = drow_table.drawOrdersTable(order_Table); 
        ResultSet result = new OrderRepository().showOrder();
        while (result.next()) {
            dataModel.addRow(new Object[]{result.getString("order_id")
                , result.getString("cust_id"), result.getString("emplo_id"), result.getString("mail_id"),result.getString("quantity")
            });
        }
    }
}
