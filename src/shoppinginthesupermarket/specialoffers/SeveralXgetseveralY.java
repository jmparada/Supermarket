/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinginthesupermarket.specialoffers;

import shoppinginthesupermarket.specialofferprocessors.SpecialOfferProcessor;

/**
 *
 * @author oracle
 */
public class SeveralXgetseveralY extends SpecialOffer {

    int offerId;
    String idItemX;
    String idItemY;

    int numberOfItemsX;
    int numberOfItemsY;

    public SeveralXgetseveralY(int offerId, SpecialOfferProcessor specialOfferProcessor, String idItemX, String idItemY, int numberOfItemsX, int numberOfItemsY) {

        super(specialOfferProcessor);
        this.offerId = offerId;
        this.idItemX = idItemX;
        this.idItemY = idItemY;
        this.numberOfItemsX = numberOfItemsX;
        this.numberOfItemsY = numberOfItemsY;
        
    }

    public void setOfferId(int offerId) {
        this.offerId = offerId;
    }

    public void setIdItemX(String idItemX) {
        this.idItemX = idItemX;
    }

    public void setIdItemY(String idItemY) {
        this.idItemY = idItemY;
    }

    public void setNumberOfItemsX(int numberOfItemsX) {
        this.numberOfItemsX = numberOfItemsX;
    }

    public void setNumberOfItemsY(int numberOfItemsY) {
        this.numberOfItemsY = numberOfItemsY;
    }

    @Override
    public int getOfferId() {
        return offerId;
    }

    public String getIdItemX() {
        return idItemX;
    }

    public String getIdItemY() {
        return idItemY;
    }

    public int getNumberOfItemsX() {
        return numberOfItemsX;
    }

    public int getNumberOfItemsY() {
        return numberOfItemsY;
    }

    @Override
    public boolean isOfferIdSame(Object obj) {

        SeveralXgetseveralY b24sp = (SeveralXgetseveralY) obj;
        return b24sp.getOfferId() == this.offerId;
    }

}
