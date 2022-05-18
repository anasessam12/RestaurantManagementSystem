
package Classes;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class drowTables {
    
    public DefaultTableModel drawEmployeeTable(JTable table)
    {
         DefaultTableModel tableModle = new DefaultTableModel();
            table.setModel(tableModle);
            tableModle.addColumn("Id");
            tableModle.addColumn("Name");
            tableModle.addColumn("Password");
            return tableModle;
    }
    
    public DefaultTableModel drawMealsTable(JTable table){
         DefaultTableModel tableModle = new DefaultTableModel();
            table.setModel(tableModle);
            tableModle.addColumn("Id");
            tableModle.addColumn("Name");
            tableModle.addColumn("price");
            tableModle.addColumn("quantity");       
            return tableModle;
    }
    
    public DefaultTableModel drawOrdersTable(JTable table){
         DefaultTableModel tableModle = new DefaultTableModel();
            tableModle.addColumn("ID");
            tableModle.addColumn("Quantity");
            tableModle.addColumn("Total Billing");
            tableModle.addColumn("Customer ID");
            tableModle.addColumn("Employee ID");
            tableModle.addColumn("Meal ID");      
            return tableModle;
    }
    
    public DefaultTableModel drawCustomerTable(JTable table){
         DefaultTableModel tableModle = new DefaultTableModel();
            tableModle.addColumn("Id");
            tableModle.addColumn("Name");
            return tableModle;
    }
    
    public DefaultTableModel drawReportTable(JTable table){
         DefaultTableModel tableModle = new DefaultTableModel();
            tableModle.addColumn("Id");
            tableModle.addColumn("Name");
            tableModle.addColumn("Passowrd");
            tableModle.addColumn("Description");
            return tableModle;
    }
    
    public DefaultTableModel drawOfferTable(JTable table){
         DefaultTableModel tableModle = new DefaultTableModel();
            tableModle.addColumn("offer_id");
            tableModle.addColumn("offer_details");
            return tableModle;
    }  
}
