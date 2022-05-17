package Classes;
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;


public class dbconnection 
{
    private Connection dataBase_connection;

    public Connection getdataBase_Connection()
    {
        return dataBase_connection;
    }

    public dbconnection()
    {
        try 
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            dataBase_connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\ABDO-HUSSEIN\\SQLEXPRESS:1433;databaseName=RestaurantManagementSystem", "sa", "12345");
        } 
        catch (ClassNotFoundException exception_NotFound)
        {
            Logger.getLogger(dbconnection.class.getName()).log(Level.SEVERE, null, exception_NotFound);
        } 
        catch (SQLException SQL_exception)
        {
            JOptionPane.showMessageDialog(null, "SQLException", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

}
