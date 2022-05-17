
package Classes;
import Jframes.adminframe;
import Repositories.OfferRepository;
import Repositories.EmployeeRepository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Offer {
    
    public Offer (){}
    
    EmployeeRepository EmployeeModel = new EmployeeRepository();
    
    public void showoffer(JTable Offer_Table) 
    {
        DefaultTableModel data_table = new DefaultTableModel();
        Offer_Table.setModel(data_table);
        data_table.addColumn("offer_id");
        data_table.addColumn("offer_details");
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
    


    
}
