
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
    
    
    
    
}
