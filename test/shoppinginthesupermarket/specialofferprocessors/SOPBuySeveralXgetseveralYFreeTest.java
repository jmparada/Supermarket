/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinginthesupermarket.specialofferprocessors;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;
import shoppinginthesupermarket.Item;
import shoppinginthesupermarket.specialoffers.SeveralXgetseveralY;
import shoppinginthesupermarket.specialoffers.SpecialOffer;

/**
 *
 * @author oracle
 */
public class SOPBuySeveralXgetseveralYFreeTest {

    public SOPBuySeveralXgetseveralYFreeTest() {
    }

    /**
     * Test of getTotalDiscount method, of class SOPBuySeveralXgetseveralYFree.
     */
    @Test
    public void testGetTotalDiscount() {
        System.out.println("getTotalDiscount");
        SOPBuySeveralXgetseveralYFree instance = new SOPBuySeveralXgetseveralYFree();
        List<List<Item>> itemsByOfferId = new ArrayList<>();
        List<Item> itemsByOffer = new ArrayList();
        

        SpecialOffer several = new SeveralXgetseveralY(40, instance, "pizza", "ketchup", 3, 2);
        Item pizza = new Item("pizza", new BigDecimal("3.50"), several);
        Item ketchup = new Item("ketchup", new BigDecimal("2"), several);
        itemsByOffer.add(pizza);
        itemsByOffer.add(pizza);
        itemsByOffer.add(pizza);
        itemsByOffer.add(ketchup);
        itemsByOffer.add(ketchup);

        itemsByOfferId.add(itemsByOffer);
        instance.setSpecialOfferList(itemsByOffer);
        
        BigDecimal expResult = new BigDecimal("4");
        BigDecimal result = instance.getTotalDiscount();
        assertEquals(expResult, result);

    }

}
