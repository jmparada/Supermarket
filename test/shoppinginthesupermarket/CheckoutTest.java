/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinginthesupermarket;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import shoppinginthesupermarket.specialofferprocessors.SOPBuySeveralXgetseveralYFree;
import shoppinginthesupermarket.specialofferprocessors.SOPBuyThreePayTwo;
import shoppinginthesupermarket.specialofferprocessors.SpecialOfferProcessor;
import shoppinginthesupermarket.specialoffers.Buy3Pay2;
import shoppinginthesupermarket.specialoffers.SeveralXgetseveralY;
import shoppinginthesupermarket.specialoffers.SpecialOffer;

/**
 *
 * @author oracle
 */
public class CheckoutTest {

    public CheckoutTest() {
    }

    /**
     * Test of setSpecialOffers method, of class Checkout.
     */
    @Test
    public void testSetSpecialOffers() {
        System.out.println("setSpecialOffers");

        List<SpecialOffer> specialOffers = new ArrayList<>();

        SpecialOfferProcessor SOPBuy3Pay2 = new SOPBuyThreePayTwo();
        SpecialOffer threePay2 = new Buy3Pay2(30, SOPBuy3Pay2);
        SpecialOffer threePay2_2 = new Buy3Pay2(300, SOPBuy3Pay2);
        specialOffers.add(threePay2);
        specialOffers.add(threePay2_2);

        Checkout instance = new Checkout();
        instance.setSpecialOffers(specialOffers);

        assertEquals(instance.getSpecialOffers(), specialOffers);

    }

    /**
     * Test of processTrolley method, of class Checkout.
     */
    @Test
    public void testProcessTrolley() {
        System.out.println("processTrolley");
        Trolley trolley = new Trolley(null);
        Checkout instance = new Checkout();
        Receipt result = instance.processTrolley(trolley);

        CheckoutPrinter coPrinter = new CheckoutPrinter();
        coPrinter.addWelcome();
        coPrinter.addTotalWithoutDiscounts(BigDecimal.ZERO);
        coPrinter.addDiscounts(BigDecimal.ZERO);
        coPrinter.addTotalWithDiscounts(BigDecimal.ZERO);

        Receipt expResult = coPrinter.getReceipt();

        assertEquals(expResult.getContent(), result.getContent());

    }

    /**
     * Test of prepareTotalWithoutDiscountsAndKeepApartSpecialOffers method, of
     * class Checkout.
     */
    @Test
    public void testPrepareTotalWithoutDiscountsAndKeepApartSpecialOffers() {
        System.out.println("prepareTotalWithoutDiscountsAndKeepApartSpecialOffers");

        SpecialOfferProcessor SOPseveralXGetY = new SOPBuySeveralXgetseveralYFree();
        SpecialOffer several = new SeveralXgetseveralY(40, SOPseveralXGetY, "pizza", "ketchup", 3, 2);
        Item pizza = new Item("pizza", new BigDecimal("3.50"), several);
        Item ketchup = new Item("ketchup", new BigDecimal("2"), several);

        Trolley trolley = new Trolley(null);
        trolley.addItem(pizza);
        trolley.addItem(ketchup);

        Checkout instance = new Checkout();
        BigDecimal expResult = new BigDecimal("5.50");
        BigDecimal result = instance.prepareTotalWithoutDiscountsAndKeepApartSpecialOffers(trolley);
        assertEquals(expResult, result);

    }

    /**
     * Test of prepareTotalDiscounts method, of class Checkout.
     */
    @Test
    public void testPrepareTotalDiscounts() {
        System.out.println("prepareTotalDiscounts");
        SpecialOfferProcessor SOPseveralXGetY = new SOPBuySeveralXgetseveralYFree();
        SpecialOffer several = new SeveralXgetseveralY(40, SOPseveralXGetY, "pizza", "ketchup", 3, 2);
        Item pizza = new Item("pizza", new BigDecimal("3.50"), several);
        Item ketchup = new Item("ketchup", new BigDecimal("2"), several);

        Trolley trolley = new Trolley(null);
        trolley.addItem(pizza);
        trolley.addItem(ketchup);

        Checkout instance = new Checkout();
        List<SpecialOffer> specialOffers = new ArrayList();
        specialOffers.add(several);

        instance.setSpecialOffers(specialOffers);
        instance.processTrolley(trolley);

        BigDecimal expResult = BigDecimal.ZERO;
        BigDecimal result = instance.prepareTotalDiscounts();
        assertEquals(expResult, result);
    }

}
