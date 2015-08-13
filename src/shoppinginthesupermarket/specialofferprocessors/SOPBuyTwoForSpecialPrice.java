/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinginthesupermarket.specialofferprocessors;

import java.math.BigDecimal;
import java.util.List;
import shoppinginthesupermarket.Item;
import shoppinginthesupermarket.specialoffers.Buy2ForSpecialPrice;

/**
 *
 * @author oracle
 */
public class SOPBuyTwoForSpecialPrice extends SpecialOfferProcessor {

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
            BigDecimal timesToDiscount = new BigDecimal(list.size() / 2);
            Item item=(Item)list.get(0);
            BigDecimal itemPrice=item.getPrice();
            Buy2ForSpecialPrice offer=(Buy2ForSpecialPrice)item.getSpecialOffer();
            BigDecimal offerForTwo=offer.getSpecialPriceForTwo();
            total =total.add(timesToDiscount.multiply((itemPrice.multiply(new BigDecimal("2"))).subtract(offerForTwo)));
             
        }

        return total;
    }



}

