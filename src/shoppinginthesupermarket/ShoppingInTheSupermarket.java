/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinginthesupermarket;

import java.math.BigDecimal;
import shoppinginthesupermarket.specialofferprocessors.SOPBuyTwoForSpecialPrice;
import shoppinginthesupermarket.specialofferprocessors.SOPBuyThreeCheapestFree;
import shoppinginthesupermarket.specialofferprocessors.SOPBuyThreePayTwo;
import shoppinginthesupermarket.specialofferprocessors.SOPBuySeveralXgetseveralYFree;
import shoppinginthesupermarket.specialofferprocessors.SpecialOfferProcessor;
import shoppinginthesupermarket.specialoffers.Buy2ForSpecialPrice;
import shoppinginthesupermarket.specialoffers.Buy3CheapestFree;
import shoppinginthesupermarket.specialoffers.Buy3Pay2;
import shoppinginthesupermarket.specialoffers.SeveralXgetseveralY;
import shoppinginthesupermarket.specialoffers.SpecialOffer;

/**
 *
 * @author oracle
 */
public class ShoppingInTheSupermarket {

    public static void main(String[] args) {

        
        //*************** Special Offer Processors**************************
        
        SpecialOfferProcessor SOPbuy2Special = new SOPBuyTwoForSpecialPrice();
        SpecialOfferProcessor SOPBuy3CheapestFree = new SOPBuyThreeCheapestFree();
        SpecialOfferProcessor SOPBuy3Pay2 = new SOPBuyThreePayTwo();
        SpecialOfferProcessor SOPseveralXGetY = new SOPBuySeveralXgetseveralYFree();
        
        //********************************************************************
        

        //**************** Special Offers ****************************************
        SpecialOffer threePay2 = new Buy3Pay2(30, SOPBuy3Pay2);
        SpecialOffer threePay2_2 = new Buy3Pay2(31, SOPBuy3Pay2);

        SpecialOffer several = new SeveralXgetseveralY(40, SOPseveralXGetY, "pizza", "ketchup", 3, 2);
        SpecialOffer several2 = new SeveralXgetseveralY(41, SOPseveralXGetY, "potatoes", "greenBeans", 1, 2);

        SpecialOffer twoSpecialPrice = new Buy2ForSpecialPrice(10, SOPbuy2Special, new BigDecimal("20"));
        SpecialOffer twoSpecialPrice2ndOffer = new Buy2ForSpecialPrice(11, SOPbuy2Special, new BigDecimal("30"));

        SpecialOffer threeCheapestFree = new Buy3CheapestFree(20, SOPBuy3CheapestFree);
        SpecialOffer threeCheapestFree2ndOffer = new Buy3CheapestFree(21, SOPBuy3CheapestFree);

        //********************************************************************
        
        
        
        Supermarket supermarket = new Supermarket();
        
        
        //*************** Load special offers in the supermarket **************
        
        
        supermarket.addSpecialOffer(threePay2);
        supermarket.addSpecialOffer(threePay2_2);

        supermarket.addSpecialOffer(several);
        supermarket.addSpecialOffer(several2);

        supermarket.addSpecialOffer(twoSpecialPrice);
        supermarket.addSpecialOffer(twoSpecialPrice2ndOffer);
        
        supermarket.addSpecialOffer(threeCheapestFree);
        supermarket.addSpecialOffer(threeCheapestFree2ndOffer);
        
        //***********************************************************************
        
        
        


        //*********** Potential items to load in the trolley **********************

        Item pizza = new Item("pizza", new BigDecimal("3.50"), several);
        Item ketchup = new Item("ketchup", new BigDecimal("2"), several);

        Item potatoes = new Item("potatoes", new BigDecimal("2.5"), several2);
        Item greenBeans = new Item("greenBeans", new BigDecimal("1.5"), several2);

        Item pear = new Item("pear", new BigDecimal("0.3"));

        
        Item sirloin = new Item("sirloin", new BigDecimal("3.42"), threePay2);
        Item lettuce = new Item("lettuce", new BigDecimal("0.50"), threePay2);
        Item onion = new Item("onion", new BigDecimal("0.25"), threePay2);



        Item tuna = new Item("tuna", new BigDecimal("2"), threePay2);
        Item sardines = new Item("sardines", new BigDecimal("1"), threePay2);
        Item cod = new Item("cod", new BigDecimal("3.25"), threePay2);
        Item haddok = new Item("haddok", new BigDecimal("3"), threePay2);
        Item ham = new Item("ham", new BigDecimal("1.50"), threePay2);

        Item foitgras = new Item("foitgras", new BigDecimal("3"), threePay2);
        Item mayo = new Item("mayo", new BigDecimal("1.5"), threePay2);
        Item chicken = new Item("chicken", new BigDecimal("4"), threePay2);
        Item bread = new Item("bread", new BigDecimal("0.80"), threePay2);
        Item cereals = new Item("cereals", new BigDecimal("1.5"), threePay2);
        
        Item pistaccio = new Item("pistaccio", new BigDecimal("3.5"), threeCheapestFree);
        Item beans = new Item("beans", new BigDecimal("1"), threeCheapestFree);
        
        Item yogurt = new Item("yogurt", new BigDecimal("0.8"), twoSpecialPrice);
        Item apricots = new Item("apricots", new BigDecimal("2"), twoSpecialPrice);
        Item tomato = new Item("tomato", new BigDecimal("1.2"), twoSpecialPrice2ndOffer);
        Item guerkins = new Item("guerkins", new BigDecimal("0.7"), twoSpecialPrice2ndOffer);
        
        Item olives = new Item("olives", new BigDecimal("0.9"), threePay2);
        Item cucumber = new Item("cucumber", new BigDecimal("0.5"), threePay2);
        Item carrot = new Item("carrot", new BigDecimal("0.2"), threePay2);

        Item appleJuice = new Item("appleJuice", new BigDecimal("1"), threePay2_2);
        Item oranges = new Item("oranges", new BigDecimal("2"), threePay2_2);
        Item banana = new Item("banana", new BigDecimal("1"), threePay2_2);
        
        Item noodles = new Item("noodles", new BigDecimal("1.3"), threeCheapestFree);
        Item rice = new Item("rice", new BigDecimal("0.8"), threeCheapestFree);

        Item cheese = new Item("cheese", new BigDecimal("3.5"), threeCheapestFree2ndOffer);
        Item oil = new Item("olive oil", new BigDecimal("4"), threeCheapestFree2ndOffer);
        Item chickpeas = new Item("chick peas", new BigDecimal("1"), threeCheapestFree2ndOffer);
        
        //*************************************************************************************
        
        
        Trolley trolley = new Trolley(null);
        
        
        //****************** Items to load in the trolley *************************************
        
        trolley.addItem(greenBeans);
        trolley.addItem(greenBeans);
        trolley.addItem(pizza);
        trolley.addItem(pizza);
        trolley.addItem(ketchup);

        trolley.addItem(ketchup);
        trolley.addItem(pizza);
        trolley.addItem(pear);
        
        trolley.addItem(ketchup);
        trolley.addItem(potatoes);
        trolley.addItem(potatoes);
        trolley.addItem(greenBeans);
        //***************************************************************************************

        supermarket.checkOut(trolley);
    }

}
