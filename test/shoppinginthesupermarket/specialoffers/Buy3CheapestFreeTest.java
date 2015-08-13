/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinginthesupermarket.specialoffers;


import org.junit.Test;
import static org.junit.Assert.*;
import shoppinginthesupermarket.specialofferprocessors.SOPBuyThreeCheapestFree;
import shoppinginthesupermarket.specialofferprocessors.SpecialOfferProcessor;

/**
 *
 * @author oracle
 */
public class Buy3CheapestFreeTest {

    public Buy3CheapestFreeTest() {
    }

    /**
     * Test of getOfferId method, of class Buy3CheapestFree.
     */
    @Test
    public void testGetOfferId() {
        System.out.println("getOfferId");
        SpecialOfferProcessor SOPbuyThreeCheapestFree = new SOPBuyThreeCheapestFree();
        SpecialOffer instance = new Buy3CheapestFree(10, SOPbuyThreeCheapestFree);

        int expResult = 10;
        int result = instance.getOfferId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOfferId method, of class Buy3CheapestFree.
     */
    @Test
    public void testSetOfferId() {
        System.out.println("setOfferId");
        SpecialOfferProcessor SOPbuyThreeCheapestFree = new SOPBuyThreeCheapestFree();
        Buy3CheapestFree instance = new Buy3CheapestFree(10, SOPbuyThreeCheapestFree);

        instance.setOfferId(20);
        int expResult = 20;
        int result = instance.getOfferId();
        assertEquals(expResult, result);
    }

    /**
     * Test of isOfferIdSame method, of class Buy3CheapestFree.
     */
    @Test
    public void testIsOfferIdSame() {
        System.out.println("isOfferIdSame");
        SpecialOfferProcessor SOPbuyThreeCheapestFree = new SOPBuyThreeCheapestFree();
        Buy3CheapestFree instance = new Buy3CheapestFree(10, SOPbuyThreeCheapestFree);

        Object obj = new Buy3CheapestFree(10, SOPbuyThreeCheapestFree);

        boolean expResult = true;
        boolean result = instance.isOfferIdSame(obj);
        assertEquals(expResult, result);

    }
      public void testIsNotOfferIdSame() {
        System.out.println("isOfferIdSame");
        SpecialOfferProcessor SOPbuyThreeCheapestFree = new SOPBuyThreeCheapestFree();
        Buy3CheapestFree instance = new Buy3CheapestFree(10, SOPbuyThreeCheapestFree);

        Object obj = new Buy3CheapestFree(30, SOPbuyThreeCheapestFree);

        boolean expResult = false;
        boolean result = instance.isOfferIdSame(obj);
        assertEquals(expResult, result);

    }

    /**
     * Test of isSameTypeOfOfferAs method, of class Buy3CheapestFree.
     */
    @Test
    public void testIsSameTypeOfOfferAs() {
        System.out.println("isSameTypeOfOfferAs");
       SpecialOfferProcessor SOPbuyThreeCheapestFree = new SOPBuyThreeCheapestFree();
        Buy3CheapestFree instance = new Buy3CheapestFree(10, SOPbuyThreeCheapestFree);
        Buy3CheapestFree instance2 = new Buy3CheapestFree(10, SOPbuyThreeCheapestFree);

        Object other = instance2;
        boolean expResult = true;
        boolean result = instance.isSameTypeOfOfferAs(other);
        
        assertEquals(expResult, result);
    }
    
        @Test
    public void testIsNotSameTypeOfOfferAs() {
        System.out.println("isSameTypeOfOfferAs");
       SpecialOfferProcessor SOPbuyThreeCheapestFree = new SOPBuyThreeCheapestFree();
        Buy3CheapestFree instance = new Buy3CheapestFree(10, SOPbuyThreeCheapestFree);
        Buy3CheapestFree instance2 = new Buy3CheapestFree(20, SOPbuyThreeCheapestFree);

        Object other = instance2;
        boolean expResult = false;
        boolean result = instance.isSameTypeOfOfferAs(other);
        
        assertEquals(expResult, result);
    }

}
