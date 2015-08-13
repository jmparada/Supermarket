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
import shoppinginthesupermarket.specialoffers.Buy2ForSpecialPrice;
import shoppinginthesupermarket.specialoffers.SpecialOffer;

/**
 *
 * @author oracle
 */
public class SOPBuyTwoForSpecialPriceTest {
    
    public SOPBuyTwoForSpecialPriceTest() {
    }
    

    /**
     * Test of getTotalDiscount method, of class SOPBuyTwoForSpecialPrice.
     */
    @Test
    public void testGetTotalDiscount() {
        System.out.println("getTotalDiscount");
        SpecialOfferProcessor instance = new SOPBuyTwoForSpecialPrice();
        
        List<List<Item>> itemsByOfferId = new ArrayList<>();
        List<Item> itemsByOffer = new ArrayList();
        

        SpecialOffer twoSpecialPrice = new Buy2ForSpecialPrice(20, instance, new BigDecimal("0.7"));
        Item chorizo = new Item("chorizo", new BigDecimal("1.5"), twoSpecialPrice);

        
        itemsByOffer.add(chorizo);
        itemsByOffer.add(chorizo);
   
        itemsByOfferId.add(itemsByOffer);
        instance.setSpecialOfferList(itemsByOffer);
        
        BigDecimal expResult = new BigDecimal("2.3");
        BigDecimal result = instance.getTotalDiscount();
        assertEquals(expResult, result);
    }
    
}
