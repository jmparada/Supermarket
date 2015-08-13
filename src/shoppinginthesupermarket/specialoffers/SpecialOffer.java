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
public abstract class SpecialOffer {

    SpecialOfferProcessor specialOfferProcessor;

    public SpecialOffer(SpecialOfferProcessor specialOfferProcessor) {
        this.specialOfferProcessor = specialOfferProcessor;

    }

    public SpecialOfferProcessor getSpecialOfferProcessor() {
        return specialOfferProcessor;
    }

    public void setSpecialOfferProcessor(SpecialOfferProcessor specialOfferProcessor) {
        this.specialOfferProcessor = specialOfferProcessor;
    }

    public boolean isSameTypeOfOfferAs(Object other) {
        if ((other.getClass() == this.getClass())) {
            return isOfferIdSame(other); //Check if the same offer but with different ids
        } else {
            return false;
        }
    }
    
    public abstract int getOfferId();

    public abstract boolean isOfferIdSame(Object obj);
}
