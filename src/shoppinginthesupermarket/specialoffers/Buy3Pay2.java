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
public class Buy3Pay2 extends SpecialOffer{
    
    private int offerId;
    
    public Buy3Pay2(int offerId, SpecialOfferProcessor specialOfferProcessor) {
        super(specialOfferProcessor);
        this.offerId=offerId;
    }

    @Override
    public int getOfferId() {
        return offerId;
    }

    public void setOfferId(int offerId) {
        this.offerId = offerId;
    }

     @Override
    public boolean isOfferIdSame(Object obj) {

        Buy3Pay2 offer = (Buy3Pay2) obj;
        return offer.getOfferId() == this.offerId;
    }

    @Override
    public boolean isSameTypeOfOfferAs(Object other) {
        {
            if ((other.getClass() == this.getClass())) {
                SpecialOffer otherSpecialOffer = (SpecialOffer) other;
                return otherSpecialOffer.getOfferId() == this.getOfferId();
            } else {
                return false;
            }
        }

    }

    
}
