/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinginthesupermarket.specialoffers;

import java.math.BigDecimal;

import org.junit.Test;
import static org.junit.Assert.*;
import shoppinginthesupermarket.specialofferprocessors.SOPBuyTwoForSpecialPrice;
import shoppinginthesupermarket.specialofferprocessors.SpecialOfferProcessor;

/**
 *
 * @author oracle
 */
public class Buy2ForSpecialPriceTest {

    public Buy2ForSpecialPriceTest() {

    }

    /**
     * Test of getOfferId method, of class Buy2ForSpecialPrice.
     */
    @Test
    public void testGetOfferId() {
        System.out.println("getOfferId");
        SpecialOfferProcessor SOPbuy2Special = new SOPBuyTwoForSpecialPrice();
        SpecialOffer instance = new Buy2ForSpecialPrice(10, SOPbuy2Special, new BigDecimal("20"));

        int expResult = 10;
        int result = instance.getOfferId();
        assertEquals(expResult, result);

    }

    /**
     * Test of getSpecialPriceForTwo method, of class Buy2ForSpecialPrice.
     */
    @Test
    public void testGetSpecialPriceForTwo() {
        System.out.println("getSpecialPriceForTwo");
        SpecialOfferProcessor SOPbuy2Special = new SOPBuyTwoForSpecialPrice();
        Buy2ForSpecialPrice instance = new Buy2ForSpecialPrice(5, SOPbuy2Special, new BigDecimal("10"));

        BigDecimal expResult = BigDecimal.TEN;
        BigDecimal result = instance.getSpecialPriceForTwo();
        assertEquals(expResult, result);

    }

    /**
     * Test of setOfferId method, of class Buy2ForSpecialPrice.
     */
    @Test
    public void testSetOfferId() {
        System.out.println("setOfferId");
        SpecialOfferProcessor SOPbuy2Special = new SOPBuyTwoForSpecialPrice();
        Buy2ForSpecialPrice instance = new Buy2ForSpecialPrice(5, SOPbuy2Special, new BigDecimal("10"));
        
        int offerId = 0;
        
        instance.setOfferId(offerId);
        assertEquals(offerId, instance.getOfferId());
    }

    /**
     * Test of setSpecialPriceForTwo method, of class Buy2ForSpecialPrice.
     */
    @Test
    public void testSetSpecialPriceForTwo() {
        System.out.println("setSpecialPriceForTwo");
       SpecialOfferProcessor SOPbuy2Special = new SOPBuyTwoForSpecialPrice();
        Buy2ForSpecialPrice instance = new Buy2ForSpecialPrice(5, SOPbuy2Special, new BigDecimal("5"));
        
        instance.setSpecialPriceForTwo(BigDecimal.TEN);
        BigDecimal expResult = BigDecimal.TEN;
        BigDecimal result = instance.getSpecialPriceForTwo();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of isOfferIdSame method, of class Buy2ForSpecialPrice.
     */
    @Test
    public void testIsOfferIdSame() {
        System.out.println("isOfferIdSame");
        
        SpecialOfferProcessor SOPbuy2Special = new SOPBuyTwoForSpecialPrice();
        Buy2ForSpecialPrice instance = new Buy2ForSpecialPrice(5, SOPbuy2Special, new BigDecimal("5"));
        
        Object obj = new Buy2ForSpecialPrice(5, SOPbuy2Special, new BigDecimal("50"));
      
        boolean expResult = true;
        boolean result = instance.isOfferIdSame(obj);
        assertEquals(expResult, result);

    }
    
        public void testIsNotOfferIdSame() {
        System.out.println("isOfferIdSame");
        
        SpecialOfferProcessor SOPbuy2Special = new SOPBuyTwoForSpecialPrice();
        Buy2ForSpecialPrice instance = new Buy2ForSpecialPrice(5, SOPbuy2Special, new BigDecimal("5"));
        
        Object obj = new Buy2ForSpecialPrice(50, SOPbuy2Special, new BigDecimal("50"));
      
        boolean expResult = false;
        boolean result = instance.isOfferIdSame(obj);
        assertEquals(expResult, result);

    }

    /**
     * Test of isSameTypeOfOfferAs method, of class Buy2ForSpecialPrice.
     */
    @Test
    public void testIsSameTypeOfOfferAs() {
        System.out.println("isSameTypeOfOfferAs");
        SpecialOfferProcessor SOPbuy2Special = new SOPBuyTwoForSpecialPrice();
        Buy2ForSpecialPrice instance = new Buy2ForSpecialPrice(5, SOPbuy2Special, new BigDecimal("5"));
        Buy2ForSpecialPrice instance2 = new Buy2ForSpecialPrice(5, SOPbuy2Special, new BigDecimal("55"));
        
        Object other = instance2;
        boolean expResult = true;
        boolean result = instance.isSameTypeOfOfferAs(other);
        
        assertEquals(expResult, result);
    }
    
        @Test
    public void testIsNotSameTypeOfOfferAs() {
        System.out.println("isSameTypeOfOfferAs");
        SpecialOfferProcessor SOPbuy2Special = new SOPBuyTwoForSpecialPrice();
        Buy2ForSpecialPrice instance = new Buy2ForSpecialPrice(5, SOPbuy2Special, new BigDecimal("5"));
        Buy2ForSpecialPrice instance2 = new Buy2ForSpecialPrice(50, SOPbuy2Special, new BigDecimal("55"));
        
        Object other = instance2;
        boolean expResult = false;
        boolean result = instance.isSameTypeOfOfferAs(other);
        
        assertEquals(expResult, result);
    }

}
