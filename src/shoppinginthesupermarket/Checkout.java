/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinginthesupermarket;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import shoppinginthesupermarket.specialofferprocessors.SpecialOfferProcessor;
import shoppinginthesupermarket.specialoffers.SpecialOffer;

/**
 *
 * @author oracle
 */
public class Checkout {

    private List<SpecialOffer> specialOffers;
    private List<Item> specialOffersInTrolley;

    private CheckoutPrinter printer;

    public Checkout() {
        this.printer = new CheckoutPrinter();
        this.specialOffersInTrolley = new ArrayList<>();
    }

    void setSpecialOffers(List<SpecialOffer> specialOffers) {
        this.specialOffers = specialOffers;
    }

    public List<SpecialOffer> getSpecialOffers() {
        return specialOffers;
    }

    Receipt processTrolley(Trolley trolley) {

        BigDecimal totalWithoutDiscounts;
        BigDecimal totalDiscounts;

        printer.addWelcome();
        totalWithoutDiscounts = prepareTotalWithoutDiscountsAndKeepApartSpecialOffers(trolley);
        totalDiscounts = prepareTotalDiscounts();

        BigDecimal total = totalWithoutDiscounts.subtract(totalDiscounts);
        prepareTotal(total);

        return printer.getReceipt();
    }

    protected BigDecimal prepareTotalWithoutDiscountsAndKeepApartSpecialOffers(Trolley trolley) {

        BigDecimal total = new BigDecimal("0");

        if (!trolley.getItemsToBuy().isEmpty()) {

            for (Item item : trolley.getItemsToBuy()) {
                if (item.hasSpecialOffer()) {
                    specialOffersInTrolley.add(item);
                }
                printer.addItemLine(item.getId(), item.getPrice());
                total = total.add(item.getPrice());
            }
        }
        printer.addTotalWithoutDiscounts(total);

        return total;

    }

    protected BigDecimal prepareTotalDiscounts() {

        BigDecimal totalDiscounts = new BigDecimal("0");
        
        if (specialOffers!=null) {
            //Apply all the offers from the supermarket in the list  
            for (SpecialOffer supermarketSpecialOffer : specialOffers) {

                List<Item> listWithSameOffers = new ArrayList<>();

                for (Item item : specialOffersInTrolley) {
                    SpecialOffer itemSpecialOfferFromTrolley = item.getSpecialOffer();

                    if (itemSpecialOfferFromTrolley.isSameTypeOfOfferAs(supermarketSpecialOffer)) {
                        listWithSameOffers.add(item);
                    }
                }

                if (!listWithSameOffers.isEmpty()) {
                    SpecialOfferProcessor sop = supermarketSpecialOffer.getSpecialOfferProcessor();
                    sop.setSpecialOfferList(listWithSameOffers);
                    totalDiscounts = totalDiscounts.add(sop.getTotalDiscount());
                }

            }
        }

        printer.addDiscounts(totalDiscounts);
        return totalDiscounts;
    }

    private void prepareTotal(BigDecimal total) {
        printer.addTotalWithDiscounts(total);
    }

}
