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
import shoppinginthesupermarket.specialofferprocessors.SpecialOfferProcessor;
import shoppinginthesupermarket.specialoffers.SeveralXgetseveralY;
import shoppinginthesupermarket.specialoffers.SpecialOffer;

/**
 *
 * @author oracle
 */
public class TrolleyTest {

    Item pizza;
    Item ketchup;

    public TrolleyTest() {
        
        SpecialOfferProcessor SOPseveralXGetY = new SOPBuySeveralXgetseveralYFree();
        SpecialOffer several = new SeveralXgetseveralY(40, SOPseveralXGetY, "pizza", "ketchup", 3, 2);
        pizza = new Item("pizza", new BigDecimal("3.50"), several);
        ketchup = new Item("ketchup", new BigDecimal("2"), several);
    }

    /**
     * Test of getItemsToBuy method, of class Trolley.
     */
    @Test
    public void testGetItemsToBuy() {
        System.out.println("getItemsToBuy");
        Trolley instance = new Trolley(null);
        instance.addItem(pizza);
        instance.addItem(ketchup);
        List<Item> result = instance.getItemsToBuy();
        assertTrue(result.size()==2);

    }

    /**
     * Test of setItemsToBuy method, of class Trolley.
     */
    @Test
    public void testSetItemsToBuy() {
        System.out.println("setItemsToBuy");
        List<Item> itemsToBuy = new ArrayList<>();
        itemsToBuy.add(pizza);
        itemsToBuy.add(ketchup);
        
        Trolley instance = new Trolley(null);
        instance.setItemsToBuy(itemsToBuy);
        
         assertTrue(instance.getItemsToBuy().size()==2);

    }
    
     /**
     * Test of Trolley constructor list not null method, of class Trolley.
     */
    @Test
    public void testTrolleyConstructorItemsNotNull() {
        System.out.println("testTrolleyConstructorItemsNotNull");
        List<Item> itemsToBuy = new ArrayList<>();
        itemsToBuy.add(pizza);
        itemsToBuy.add(ketchup);
        
        Trolley instance = new Trolley(itemsToBuy);
        
         assertTrue(instance.getItemsToBuy().size()==2);

    }

    /**
     * Test of addItem method, of class Trolley.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
         Trolley instance = new Trolley(null);
        instance.addItem(pizza);
        
        List<Item> result = instance.getItemsToBuy();
        assertTrue(result.size()==1);
    }

    /**
     * Test of removeItem method, of class Trolley.
     */
    @Test
    public void testRemoveItem() {
        System.out.println("removeItem");
        Trolley instance = new Trolley(null);
        instance.addItem(pizza);
        instance.removeItem(pizza);
        
        List<Item> result = instance.getItemsToBuy();
        assertTrue(result.size()==0);
    }

}
