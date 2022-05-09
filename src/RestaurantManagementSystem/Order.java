/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestaurantManagementSystem;

import java.sql.*;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 20112
 */
public class Order  {
    private int id ;
    private int time;
    private int quantity ;
    dbconnection conn =new dbconnection ();
    float price = 0;
    float  total_p =0;
    public Order() {
             
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    

   
    
    public float totalPrice (Meals m, Order o){
        try{

    Statement st = conn.getConn().createStatement();
    String sql = "select meal_price from meals where meal_id="+m.getMealId()+"";
    ResultSet re =  st.executeQuery(sql);
while (re.next()){
price = re.getFloat("meal_price");
}


    }
    catch(SQLException ex){

    JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
   }
        
      total_p = price *o.getQuantity();
        
    return total_p ;
    
    
    
    
    
    }
    
    public void setOrder (Order o , Employee e, Meals m,customer c){
        
    try{

            Statement st = conn.getConn().createStatement();
            
            String sql1 = "set nocount off ; insert into orders  values (" +o.getQuantity()+","+totalPrice(m,o) +","+c.getId()+","+e.getId()+","+m.getMealId()+")";
//            String sql = "set nocount off ;insert into order_detalis  values (" +o.getQuantity()+","+m.getMealId()+")";
//      st.executeQuery(sql);
      st.executeQuery(sql1);

    }
    catch(SQLException ex){

//    JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
   }
    
    }
    
    public void cancel_odrer(Order o ) {

        try {
            Statement st = conn.getConn().createStatement();
            String sql = "delete from orders where order_id='" + o.getId() + "'";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Order has been deleted successfully", "success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
    public void showorder(JTable order_Table) {

        DefaultTableModel dt = new DefaultTableModel();

        order_Table.setModel(dt);
        dt.addColumn("ID");
         dt.addColumn("Quantity");
        dt.addColumn("Total Billing");
        dt.addColumn("Customer ID");
        dt.addColumn("Employee ID");
          dt.addColumn("Meal ID");

        try {

            Statement st = conn.getConn().createStatement();
            String sql = "select * from orders";
            ResultSet re = st.executeQuery(sql);
            while (re.next()) {

                dt.addRow(new Object[]{re.getString("order_id"),
                    re.getString("MEALS_quantity"), re.getString("total_biling"), re.getString("cust_id"), re.getString("emplo_id"), re.getString("meal_ID")
                    });

            }
        } catch (SQLException ex) {
            Logger.getLogger(adminframe.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
   
}
