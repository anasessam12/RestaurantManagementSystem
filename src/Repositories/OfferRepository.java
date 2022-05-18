
package Repositories;

import Classes.dbconnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class OfferRepository {

    private int offerId;
    private String offerDetails;

    public OfferRepository() {
    }

    public void setOfferId(int offerId) {
        this.offerId = offerId;
    }

    public void setOfferDetails(String offerDetails) {
        this.offerDetails = offerDetails;
    }

    public int getOfferId() {
        return offerId;
    }

    public String getOfferDetails() {
        return offerDetails;
    }
    dbconnection dataBaseConnection = dbconnection.getInstance();
    Connection connection = dataBaseConnection.getDatabase_connection();
    
    public void SettingOffer(OfferRepository offer) throws SQLException
    {
        Statement statement = connection.createStatement();
        String sql = "insert into offers values (" + offer.getOfferId() + ",'" + offer.getOfferDetails() + ")";
        statement.executeUpdate(sql);
        
    }
}
