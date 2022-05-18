
package Classes;
import Jframes.adminframe;
import Repositories.EmployeeRepository;
import Repositories.OfferRepository;
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Offer {
    
    public Offer (){}
    
    EmployeeRepository EmployeeModel = new EmployeeRepository();
    
    drowTables drow_table = new drowTables();
    
    public void showoffer(JTable Offer_Table) 
    {
        DefaultTableModel data_table = drow_table.drawOfferTable(Offer_Table);
        try { 
                ResultSet DBresult = EmployeeModel.ShowOffers(Offer_Table);
                while (DBresult.next()) {
                    data_table.addRow(new Object[]{DBresult.getString("offer_id"),
                        DBresult.getString("offer_details")
                    });
            }
        } catch (SQLException SQL_exception) {
            Logger.getLogger(adminframe.class.getName()).log(Level.SEVERE, null, SQL_exception);
        }
    }
    
    public void SetOffers(OfferRepository offer) {
        JOptionPane.showMessageDialog(null, "Added Successfully", "Add", JOptionPane.INFORMATION_MESSAGE);
    }
}
