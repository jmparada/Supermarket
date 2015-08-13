/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinginthesupermarket;

import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import shoppinginthesupermarket.specialofferprocessors.SOPBuyTwoForSpecialPrice;
import shoppinginthesupermarket.specialoffers.Buy2ForSpecialPrice;
import shoppinginthesupermarket.specialoffers.SpecialOffer;

/**
 *
 * @author oracle
 */
public class ItemTest {

    public ItemTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Item.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Item instance = new Item("crisps", BigDecimal.TEN);

        String expResult = "crisps";
        String result = instance.getId();
        assertEquals(expResult, result);

    }

    /**
     * Test of setId method, of class Item.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "idToTest";
        Item instance = new Item("randomId", BigDecimal.ZERO);
        instance.setId(id);

        String expResult = "idToTest";
        String result = instance.getId();
        assertEquals(expResult, result);

    }

    /**
     * Test of getSpecialOffer method, of class Item.
     */
    @Test
    public void testGetSpecialOffer() {
        System.out.println("getSpecialOffer");

        SpecialOffer so = new Buy2ForSpecialPrice(3, new SOPBuyTwoForSpecialPrice(), BigDecimal.TEN);
        Item instance = new Item("chips", BigDecimal.TEN, so);

        SpecialOffer expResult = so;
        SpecialOffer result = instance.getSpecialOffer();

        assertEquals(expResult, result);

    }

    /**
     * Test of setSpecialOffer method, of class Item.
     */
    @Test
    public void testSetSpecialOffer() {
        System.out.println("setSpecialOffer");
        SpecialOffer specialOffer = new Buy2ForSpecialPrice(3, new SOPBuyTwoForSpecialPrice(), BigDecimal.TEN);
        Item instance = new Item("chips", BigDecimal.TEN);

        instance.setSpecialOffer(specialOffer);

        assertEquals(specialOffer, instance.getSpecialOffer());
    }

    /**
     * Test of getPrice method, of class Item.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Item instance = new Item("chips", BigDecimal.TEN);
        BigDecimal expResult = BigDecimal.TEN;
        BigDecimal result = instance.getPrice();

        assertEquals(expResult, result);

    }

    /**
     * Test of setPrice method, of class Item.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        Item instance = new Item("chips", BigDecimal.ONE);

        BigDecimal price = BigDecimal.TEN;
        instance.setPrice(price);

        BigDecimal expResult = price;
        BigDecimal result = instance.getPrice();
        instance.setPrice(price);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of hasSpecialOffer method, of class Item.
     */
    @Test
    public void testHasSpecialOffer() {
        System.out.println("hasSpecialOffer");
        
        SpecialOffer specialOffer = new Buy2ForSpecialPrice(3, new SOPBuyTwoForSpecialPrice(), BigDecimal.TEN);
        Item instance = new Item("chips", BigDecimal.TEN, specialOffer);
  
        boolean expResult = true;
        boolean result = instance.hasSpecialOffer();
        assertEquals(expResult, result);
        
        Item instance2 = new Item("chips", BigDecimal.TEN, specialOffer);
        

    }
    
    /**
     * Test of hasSpecialOffer method, of class Item result Null.
     */
    @Test
    public void testHasSpecialOfferNull() {
        System.out.println("hasSpecialOffer");
        

        Item instance = new Item("chips", BigDecimal.TEN);
  
        boolean expResult = false;
        boolean result = instance.hasSpecialOffer();
        assertEquals(expResult, result);
       
        

    }

}
