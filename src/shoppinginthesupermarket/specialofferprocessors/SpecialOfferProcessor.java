/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinginthesupermarket.specialofferprocessors;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import shoppinginthesupermarket.Item;

/**
 *
 * @author oracle
 */
public abstract class SpecialOfferProcessor {

    protected List<Item> itemsWithConcreteSpecialOfferList;

    public List<Item> getSpecialOfferList() {
        return itemsWithConcreteSpecialOfferList;
    }

    public void setSpecialOfferList(List<Item> specialOfferList) {
        this.itemsWithConcreteSpecialOfferList = specialOfferList;
    }

    public abstract BigDecimal getTotalDiscount();

    
    protected List<List<Item>> splitOffersById(List itemsWithConcreteSpecialOfferList) {

        List<List<Item>> listOfLists = new ArrayList<>();

        Iterator i = itemsWithConcreteSpecialOfferList.iterator();
        while (i.hasNext()) {

            Item item = (Item) i.next();
            int offerId = item.getSpecialOffer().getOfferId();

            if (listOfLists.isEmpty()) {
                List<Item> itemList = new ArrayList<>();
                itemList.add(item);
                listOfLists.add(itemList);

            } else {

                boolean isOfferIdInList = false;

                for (List listOfOffers : listOfLists) {
                    Item it = (Item) listOfOffers.get(0);
                    if (offerId == it.getSpecialOffer().getOfferId()) {
                        listOfOffers.add(item);
                        isOfferIdInList = true;
                    }
                    if (isOfferIdInList) {
                        break;
                    }
                }

                if (!isOfferIdInList) {
                    List<Item> itemList = new ArrayList<>();
                    itemList.add(item);
                    listOfLists.add(itemList);

                }
            }
        }
        return listOfLists;
    }

}
