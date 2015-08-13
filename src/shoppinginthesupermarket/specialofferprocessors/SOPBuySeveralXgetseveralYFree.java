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
import shoppinginthesupermarket.specialoffers.SeveralXgetseveralY;

/**
 *
 * @author oracle
 */
public class SOPBuySeveralXgetseveralYFree extends SpecialOfferProcessor {

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

        BigDecimal totalDiscounts = new BigDecimal("0");

        for (List<Item> list : itemsByOfferIdList) {

            totalDiscounts = totalDiscounts.add(checkXandDiscountY(list));
        }

        return totalDiscounts;
    }

    private BigDecimal checkXandDiscountY(List<Item> list) {

        BigDecimal totalDisc = new BigDecimal("0");

        Item item = (Item) list.get(0);
        SeveralXgetseveralY offer = (SeveralXgetseveralY) item.getSpecialOffer();
        String xId = offer.getIdItemX();
        String yId = offer.getIdItemY();

        int necessaryXToDiscount = offer.getNumberOfItemsX();
        int numberOfYToDiscount = offer.getNumberOfItemsY();

        int countX = 0;
        int countY = 0;

        Iterator iter = list.iterator();
        BigDecimal priceY = new BigDecimal("0");

        while (iter.hasNext()) {
            Item it = (Item) iter.next();
            if (it.getId().equals(xId)) {
                countX++;
            } else if (it.getId().equals(yId)) {
                countY++;
                priceY = it.getPrice();
            }

        }

        int maxNumberOfYToDiscount = (countX / necessaryXToDiscount) * numberOfYToDiscount;

        if (maxNumberOfYToDiscount >= countY) {
            totalDisc = priceY.multiply(new BigDecimal(countY));
        } else {
            totalDisc =  priceY.multiply(new BigDecimal(maxNumberOfYToDiscount));
        }

        return totalDisc;
    }

}
