/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

/**
 *
 * @author Egy
 */
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

}
