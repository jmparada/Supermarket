/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinginthesupermarket.specialofferprocessors;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import shoppinginthesupermarket.Item;

/**
 *
 * @author oracle
 */
public class SOPBuyThreeCheapestFree extends SpecialOfferProcessor {

    @Override
    public BigDecimal getTotalDiscount() {

        BigDecimal totalDiscount = new BigDecimal("0");

        if (!itemsWithConcreteSpecialOfferList.isEmpty()) {

            List<List<Item>> itemsByOfferId = splitOffersById(itemsWithConcreteSpecialOfferList);
            totalDiscount = totalDiscount.add(processOffers(itemsByOfferId));

        }

        return totalDiscount;
    }

    
    private BigDecimal processOffers(List<List<Item>> itemsByOfferIdList) {

        BigDecimal total = new BigDecimal("0");

        for (List<Item> list : itemsByOfferIdList) {
            int itemsToDiscount = list.size() / 3;
            total = total.add(discountCheapestItems(list, itemsToDiscount));
        }

        return total;
    }

    private BigDecimal discountCheapestItems(List<Item> list, int itemsToDiscount) {

        BigDecimal totalDisc = new BigDecimal("0");

        for (int i = 0; i < itemsToDiscount; i++) {

            Item itemMinPrice = (Item) list.get(0);

            Iterator iter = list.iterator();

            while (iter.hasNext()) {
                Item item = (Item) iter.next();
                if (itemMinPrice.getPrice().compareTo(item.getPrice())==1) {
                    itemMinPrice = item;
                }

            }
            totalDisc = totalDisc.add(itemMinPrice.getPrice());
            list.remove(itemMinPrice);

        }
        return totalDisc;

    }

}
