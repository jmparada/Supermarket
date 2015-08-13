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
public class SOPBuyThreePayTwo extends SpecialOfferProcessor {

    @Override
    public BigDecimal getTotalDiscount() {

        BigDecimal totalDiscount = new BigDecimal("0");

        if (!itemsWithConcreteSpecialOfferList.isEmpty()) {

            List<List<Item>> itemsByOfferId = splitOffersById(itemsWithConcreteSpecialOfferList);
            
            totalDiscount=totalDiscount.add(processOffers(itemsByOfferId));

        }
        
        return totalDiscount;
    }
    
      
    private BigDecimal processOffers(List<List<Item>> itemsByOfferIdList) {

        BigDecimal total = new BigDecimal("0");

        for (List<Item> list : itemsByOfferIdList) {
            int itemsToDiscount = list.size() / 3;
            total = total.add(discountMostExpensiveItems(list, itemsToDiscount));
        }

        return total;
    }

    
    private BigDecimal discountMostExpensiveItems(List<Item> list, int itemsToDiscount) {

        BigDecimal totalDisc = new BigDecimal("0");

        for (int i = 0; i < itemsToDiscount; i++) {

            Item itemMaxPrice = (Item) list.get(0);

            Iterator iter = list.iterator();

            while (iter.hasNext()) {
                Item item = (Item) iter.next();
                
                if (itemMaxPrice.getPrice().compareTo(item.getPrice())==-1) {
                    itemMaxPrice = item;

                }

            }
            totalDisc = totalDisc.add(itemMaxPrice.getPrice());
            list.remove(itemMaxPrice);

        }
        return totalDisc;

    }

}
