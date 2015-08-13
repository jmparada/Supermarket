/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinginthesupermarket;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Pack200;
import org.junit.Test;
import static org.junit.Assert.*;

import shoppinginthesupermarket.specialofferprocessors.SOPBuySeveralXgetseveralYFree;
import shoppinginthesupermarket.specialofferprocessors.SpecialOfferProcessor;
import shoppinginthesupermarket.specialoffers.SeveralXgetseveralY;
import shoppinginthesupermarket.specialoffers.SpecialOffer;

/**
 *
 * @author oracle
 */
public class SupermarketTest {

    SpecialOffer several;
    SpecialOffer several2;

    public SupermarketTest() {

        SpecialOfferProcessor SOPseveralXGetY = new SOPBuySeveralXgetseveralYFree();
        several = new SeveralXgetseveralY(40, SOPseveralXGetY, "pizza", "ketchup", 3, 2);
        several2 = new SeveralXgetseveralY(50, SOPseveralXGetY, "pizza", "ketchup", 3, 2);
    }


    /**
     * Test of getSpecialOffers method, of class Supermarket.
     */
    @Test
    public void testGetSpecialOffers() {
        System.out.println("getSpecialOffers");
        Supermarket instance = new Supermarket();

        instance.addSpecialOffer(several);
        instance.addSpecialOffer(several2);

        assertTrue(instance.getSpecialOffers().size() == 2);
       

    }

    /**
     * Test of setSpecialOffers method, of class Supermarket.
     */
    @Test
    public void testSetSpecialOffers() {
        System.out.println("setSpecialOffers");

        List list = new ArrayList();

        list.add(several);
        list.add(several2);

        Supermarket instance = new Supermarket();
        instance.setSpecialOffers(list);

        assertTrue(instance.getSpecialOffers().size() == 2);
    }

    /**
     * Test of addSpecialOffer method, of class Supermarket.
     */
    @Test
    public void testAddSpecialOffer() {
        System.out.println("addSpecialOffer");

        Supermarket instance = new Supermarket();
        instance.addSpecialOffer(several);

        assertTrue(instance.getSpecialOffers().size() == 1);

    }


}
