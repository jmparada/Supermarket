/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinginthesupermarket.specialoffers;

import org.junit.Test;
import static org.junit.Assert.*;
import shoppinginthesupermarket.specialofferprocessors.SOPBuySeveralXgetseveralYFree;
import shoppinginthesupermarket.specialofferprocessors.SpecialOfferProcessor;

/**
 *
 * @author oracle
 */
public class SeveralXgetseveralYTest {

    public SeveralXgetseveralYTest() {
    }

    /**
     * Test of setOfferId method, of class SeveralXgetseveralY.
     */
    @Test
    public void testSetOfferId() {
        System.out.println("setOfferId");
        SpecialOfferProcessor SOPseveralXGetY = new SOPBuySeveralXgetseveralYFree();
        SeveralXgetseveralY instance = new SeveralXgetseveralY(30, SOPseveralXGetY, "pizza", "ketchup", 3, 2);

        int expectedVal = 40;
        instance.setOfferId(expectedVal);
        int val = instance.offerId;

        assertEquals(expectedVal, val);

    }

    /**
     * Test of setIdItemX method, of class SeveralXgetseveralY.
     */
    @Test
    public void testSetIdItemX() {
        System.out.println("setIdItemX");
        SpecialOfferProcessor SOPseveralXGetY = new SOPBuySeveralXgetseveralYFree();
        SeveralXgetseveralY instance = new SeveralXgetseveralY(40, SOPseveralXGetY, "pizza", "ketchup", 3, 2);

        String expectedVal = "tomato";
        instance.setIdItemX(expectedVal);
        String val = instance.getIdItemX();

        assertEquals(expectedVal, val);
    }

    /**
     * Test of setIdItemY method, of class SeveralXgetseveralY.
     */
    @Test
    public void testSetIdItemY() {
        System.out.println("setIdItemY");
        SpecialOfferProcessor SOPseveralXGetY = new SOPBuySeveralXgetseveralYFree();
        SeveralXgetseveralY instance = new SeveralXgetseveralY(40, SOPseveralXGetY, "pizza", "ketchup", 3, 2);

        String expectedVal = "tomato";
        instance.setIdItemY(expectedVal);
        String val = instance.getIdItemY();

        assertEquals(expectedVal, val);
    }

    /**
     * Test of setNumberOfItemsX method, of class SeveralXgetseveralY.
     */
    @Test
    public void testSetNumberOfItemsX() {
        System.out.println("setNumberOfItemsX");
        SpecialOfferProcessor SOPseveralXGetY = new SOPBuySeveralXgetseveralYFree();
        SeveralXgetseveralY instance = new SeveralXgetseveralY(40, SOPseveralXGetY, "pizza", "ketchup", 3, 2);

        int expectedVal = 7;
        instance.setNumberOfItemsX(expectedVal);
        int val = instance.getNumberOfItemsX();

        assertEquals(expectedVal, val);
    }

    /**
     * Test of setNumberOfItemsY method, of class SeveralXgetseveralY.
     */
    @Test
    public void testSetNumberOfItemsY() {
        System.out.println("setNumberOfItemsY");
        SpecialOfferProcessor SOPseveralXGetY = new SOPBuySeveralXgetseveralYFree();
        SeveralXgetseveralY instance = new SeveralXgetseveralY(40, SOPseveralXGetY, "pizza", "ketchup", 3, 2);

        int expectedVal = 7;
        instance.setNumberOfItemsY(expectedVal);
        int val = instance.getNumberOfItemsY();

        assertEquals(expectedVal, val);
    }

    /**
     * Test of getOfferId method, of class SeveralXgetseveralY.
     */
    @Test
    public void testGetOfferId() {
        System.out.println("getOfferId");
        SpecialOfferProcessor SOPseveralXGetY = new SOPBuySeveralXgetseveralYFree();
        SeveralXgetseveralY instance = new SeveralXgetseveralY(30, SOPseveralXGetY, "pizza", "ketchup", 3, 2);

        int expectedVal = 40;
        instance.setOfferId(expectedVal);
        int val = instance.getOfferId();

        assertEquals(expectedVal, val);
    }

    /**
     * Test of getIdItemX method, of class SeveralXgetseveralY.
     */
    @Test
    public void testGetIdItemX() {
        System.out.println("getIdItemX");
        SpecialOfferProcessor SOPseveralXGetY = new SOPBuySeveralXgetseveralYFree();
        SeveralXgetseveralY instance = new SeveralXgetseveralY(40, SOPseveralXGetY, "pizza", "ketchup", 3, 2);

        String expectedVal = "tomato";
        instance.setIdItemX(expectedVal);
        String val = instance.getIdItemX();

        assertEquals(expectedVal, val);
    }

    /**
     * Test of getIdItemY method, of class SeveralXgetseveralY.
     */
    @Test
    public void testGetIdItemY() {
        System.out.println("getIdItemY");
        SpecialOfferProcessor SOPseveralXGetY = new SOPBuySeveralXgetseveralYFree();
        SeveralXgetseveralY instance = new SeveralXgetseveralY(40, SOPseveralXGetY, "pizza", "ketchup", 3, 2);

        String expectedVal = "tomato";
        instance.setIdItemY(expectedVal);
        String val = instance.getIdItemY();

        assertEquals(expectedVal, val);
    }

    /**
     * Test of getNumberOfItemsX method, of class SeveralXgetseveralY.
     */
    @Test
    public void testGetNumberOfItemsX() {
        System.out.println("getNumberOfItemsX");
        SpecialOfferProcessor SOPseveralXGetY = new SOPBuySeveralXgetseveralYFree();
        SeveralXgetseveralY instance = new SeveralXgetseveralY(40, SOPseveralXGetY, "pizza", "ketchup", 3, 2);

        int expectedVal = 7;
        instance.setNumberOfItemsX(expectedVal);
        int val = instance.getNumberOfItemsX();

        assertEquals(expectedVal, val);
    }

    /**
     * Test of getNumberOfItemsY method, of class SeveralXgetseveralY.
     */
    @Test
    public void testGetNumberOfItemsY() {
        System.out.println("getNumberOfItemsY");
        SpecialOfferProcessor SOPseveralXGetY = new SOPBuySeveralXgetseveralYFree();
        SeveralXgetseveralY instance = new SeveralXgetseveralY(40, SOPseveralXGetY, "pizza", "ketchup", 3, 2);

        int expectedVal = 7;
        instance.setNumberOfItemsY(expectedVal);
        int val = instance.getNumberOfItemsY();

        assertEquals(expectedVal, val);
    }

    /**
     * Test of isOfferIdSame method, of class SeveralXgetseveralY.
     */
    @Test
    public void testIsOfferIdSame() {
        System.out.println("isOfferIdSame");
        SpecialOfferProcessor SOPseveralXGetY = new SOPBuySeveralXgetseveralYFree();
        SeveralXgetseveralY instance = new SeveralXgetseveralY(40, SOPseveralXGetY, "pizza", "ketchup", 3, 2);
        Object instance2 = new SeveralXgetseveralY(40, SOPseveralXGetY, "tomato", "banana", 3, 2);
        
       
        boolean expResult = true;
        boolean result = instance.isOfferIdSame(instance2);
        assertEquals(expResult, result);


    }
    
        /**
     * Test of isOfferIdSame method, of class SeveralXgetseveralY.
     */
    @Test
    public void testIsOfferIdNotSame() {
        System.out.println("isOfferIdSame");
        SpecialOfferProcessor SOPseveralXGetY = new SOPBuySeveralXgetseveralYFree();
        SeveralXgetseveralY instance = new SeveralXgetseveralY(40, SOPseveralXGetY, "pizza", "ketchup", 3, 2);
        Object instance2 = new SeveralXgetseveralY(60, SOPseveralXGetY, "tomato", "banana", 3, 2);
        
       
        boolean expResult = false;
        boolean result = instance.isOfferIdSame(instance2);
        assertEquals(expResult, result);


    }

}
