/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinginthesupermarket;

import java.math.BigDecimal;
import shoppinginthesupermarket.specialoffers.SpecialOffer;

/**
 *
 * @author oracle
 */
public class Item {

    private String id;
    private BigDecimal price;
    private SpecialOffer specialOffer;

    public Item(String id, BigDecimal price) {

        this.id = id;
        this.price = price;
        this.specialOffer = null;
    }

    public Item(String id, BigDecimal price, SpecialOffer specialOffer) {
        this.id = id;
        this.price = price;
        this.specialOffer = specialOffer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SpecialOffer getSpecialOffer() {
        return specialOffer;
    }

    public void setSpecialOffer(SpecialOffer specialOffer) {
        this.specialOffer = specialOffer;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean hasSpecialOffer() {
        
        return this.specialOffer != null;
    }

}
