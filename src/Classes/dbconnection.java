
package Classes;

import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;

public class dbconnection {

    private Connection conn;

    public Connection getDatabase_connection() {
        return conn;
    }

    public dbconnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost\\ABDO-HUSSEIN\\SQLEXPRESS:1433;databaseName=RestaurantManagementSystem", "sa", "12345");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dbconnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQLException", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
