/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinginthesupermarket.specialoffers;


import org.junit.Test;
import static org.junit.Assert.*;
import shoppinginthesupermarket.specialofferprocessors.SOPBuyThreeCheapestFree;
import shoppinginthesupermarket.specialofferprocessors.SOPBuyThreePayTwo;
import shoppinginthesupermarket.specialofferprocessors.SpecialOfferProcessor;

/**
 *
 * @author oracle
 */
public class Buy3Pay2Test {
    
    public Buy3Pay2Test() {
    }
    

    /**
     * Test of getOfferId method, of class Buy3Pay2.
     */
    @Test
    public void testGetOfferId() {
        System.out.println("getOfferId");
        SpecialOfferProcessor SOPbuyThreePayTwo = new SOPBuyThreePayTwo();
        SpecialOffer instance = new Buy3Pay2(10, SOPbuyThreePayTwo);

        int expResult = 10;
        int result = instance.getOfferId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOfferId method, of class Buy3Pay2.
     */
    @Test
    public void testSetOfferId() {
        System.out.println("setOfferId");
        SpecialOfferProcessor SOPbuyThreePayTwo = new SOPBuyThreePayTwo();
        Buy3Pay2 instance = new Buy3Pay2(10, SOPbuyThreePayTwo);

        instance.setOfferId(20);
        int expResult = 20;
        int result = instance.getOfferId();
        assertEquals(expResult, result);
    }

    /**
     * Test of isOfferIdSame method, of class Buy3Pay2.
     */
    @Test
    public void testIsOfferIdSame() {
        System.out.println("isOfferIdSame");
        SpecialOfferProcessor SOPbuyThreePayTwo = new SOPBuyThreePayTwo();
        Buy3Pay2 instance = new Buy3Pay2(10, SOPbuyThreePayTwo);

        Object obj = new Buy3Pay2(10, SOPbuyThreePayTwo);

        boolean expResult = true;
        boolean result = instance.isOfferIdSame(obj);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testIsNotOfferIdSame() {
        System.out.println("isOfferIdSame");
        SpecialOfferProcessor SOPbuyThreePayTwo = new SOPBuyThreePayTwo();
        Buy3Pay2 instance = new Buy3Pay2(10, SOPbuyThreePayTwo);

        Object obj = new Buy3Pay2(20, SOPbuyThreePayTwo);

        boolean expResult = false;
        boolean result = instance.isOfferIdSame(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of isSameTypeOfOfferAs method, of class Buy3Pay2.
     */
    @Test
    public void testIsSameTypeOfOfferAs() {
        System.out.println("isSameTypeOfOfferAs");
               SpecialOfferProcessor SOPbuyThreePayTwo = new SOPBuyThreePayTwo();
        Buy3Pay2 instance = new Buy3Pay2(10, SOPbuyThreePayTwo);
        SpecialOfferProcessor SOPbuyThreeCheapestFree = new SOPBuyThreeCheapestFree();
        
        Buy3CheapestFree instance2 = new Buy3CheapestFree(20, SOPbuyThreeCheapestFree);

        Object other = instance2;
        boolean expResult = false;
        boolean result = instance.isSameTypeOfOfferAs(other);
        
        assertEquals(expResult, result);
    }
    
        @Test
    public void testIsNotSameTypeOfOfferAs() {
        System.out.println("isSameTypeOfOfferAs");
               SpecialOfferProcessor SOPbuyThreePayTwo = new SOPBuyThreePayTwo();
        Buy3Pay2 instance = new Buy3Pay2(10, SOPbuyThreePayTwo);
        Buy3Pay2 instance2 = new Buy3Pay2(20, SOPbuyThreePayTwo);

        Object other = instance2;
        boolean expResult = false;
        boolean result = instance.isSameTypeOfOfferAs(other);
        
        assertEquals(expResult, result);
    }
    
}
