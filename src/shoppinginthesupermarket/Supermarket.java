/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinginthesupermarket;

import shoppinginthesupermarket.specialoffers.SpecialOffer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oracle
 */
public class Supermarket {

    private List<SpecialOffer> specialOffers;
    private Checkout checkout;

    public Supermarket() {
        this.specialOffers = new ArrayList<>();
        this.checkout = new Checkout();
    }

    public List<SpecialOffer> getSpecialOffers() {
        return specialOffers;
    }

    public void setSpecialOffers(List<SpecialOffer> specialOffers) {
        this.specialOffers = specialOffers;
    }

    public void addSpecialOffer(SpecialOffer specialOffer) {
        specialOffers.add(specialOffer);
    }

    
    public void checkOut(Trolley trolley) {

        checkout.setSpecialOffers(specialOffers);

        Receipt receipt = checkout.processTrolley(trolley);
        System.out.println(receipt.getContent());
        
    }

}
