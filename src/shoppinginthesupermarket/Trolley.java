/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinginthesupermarket;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oracle
 */

public class Trolley {

    private List<Item> itemsToBuy;

    public Trolley(List<Item> itemsToBuy) {
        if (itemsToBuy != null) {
            this.itemsToBuy = itemsToBuy;
        } else {
            this.itemsToBuy = new ArrayList<>();
        }
    }

    public List<Item> getItemsToBuy() {
        return itemsToBuy;
    }

    public void setItemsToBuy(List<Item> itemsToBuy) {
        this.itemsToBuy = itemsToBuy;
    }

    public void addItem(Item i) {
        itemsToBuy.add(i);
    }

    public void removeItem(Item i) {
        itemsToBuy.remove(i);
    }

}
