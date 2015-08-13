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
import shoppinginthesupermarket.specialoffers.Buy3CheapestFree;
import shoppinginthesupermarket.specialoffers.SpecialOffer;

/**
 *
 * @author oracle
 */
public class SOPBuyThreeCheapestFreeTest {
    
    public SOPBuyThreeCheapestFreeTest() {
    }
    

    /**
     * Test of getTotalDiscount method, of class SOPBuyThreeCheapestFree.
     */
    @Test
    public void testGetTotalDiscount() {
        System.out.println("getTotalDiscount");
        SpecialOfferProcessor instance = new SOPBuyThreeCheapestFree();
        
        List<List<Item>> itemsByOfferId = new ArrayList<>();
        List<Item> itemsByOffer = new ArrayList();
        

        SpecialOffer threeCheapestFree = new Buy3CheapestFree(20, instance);
        Item chorizo = new Item("chorizo", new BigDecimal("3.5"), threeCheapestFree);
        Item pistaccio = new Item("pistaccio", new BigDecimal("3.5"), threeCheapestFree);
        Item beans = new Item("beans", new BigDecimal("1"), threeCheapestFree);
        
        itemsByOffer.add(chorizo);
        itemsByOffer.add(pistaccio);
        itemsByOffer.add(beans);
   
        itemsByOfferId.add(itemsByOffer);
        instance.setSpecialOfferList(itemsByOffer);
        
        BigDecimal expResult = new BigDecimal("1");
        BigDecimal result = instance.getTotalDiscount();
        assertEquals(expResult, result);
    }
    
}
