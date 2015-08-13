/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinginthesupermarket.specialoffers;

import java.math.BigDecimal;
import shoppinginthesupermarket.specialofferprocessors.SpecialOfferProcessor;

/**
 *
 * @author oracle
 */
public class Buy2ForSpecialPrice extends SpecialOffer {

    private int offerId;
    private BigDecimal specialPriceForTwo;

    public Buy2ForSpecialPrice(int offerId, SpecialOfferProcessor specialOfferProcessor,  BigDecimal specialPriceForTwo) {
        super(specialOfferProcessor);
        this.offerId = offerId;
        this.specialPriceForTwo = specialPriceForTwo;

    }


    @Override
    public int getOfferId() {
        return offerId;
    }

    public BigDecimal getSpecialPriceForTwo() {
        return specialPriceForTwo;
    }

    public void setOfferId(int offerId) {
        this.offerId = offerId;
    }

    public void setSpecialPriceForTwo(BigDecimal specialPriceForTwo) {
        this.specialPriceForTwo = specialPriceForTwo;
    }
    
    
    @Override
    public boolean isOfferIdSame(Object obj) {
        Buy2ForSpecialPrice offer = (Buy2ForSpecialPrice) obj;
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
