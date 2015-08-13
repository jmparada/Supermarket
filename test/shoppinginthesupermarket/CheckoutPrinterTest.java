/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinginthesupermarket;

import java.math.BigDecimal;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oracle
 */
public class CheckoutPrinterTest {

    Receipt receipt;

    public CheckoutPrinterTest() {
    }

    public void addWelcome() {

        receipt.setContent(receipt.getContent() + " \tWelcome to the Supermarket:\n");
        receipt.setContent(receipt.getContent() + " \t*****************************\n");
        receipt.setContent(receipt.getContent() + " \tMerchant ID:          2225444\n");
        receipt.setContent(receipt.getContent() + " \tTerminal ID:       5489254353\n");
        receipt.setContent(receipt.getContent() + " \t--------------------------------------\n");
        receipt.setContent(receipt.getContent() + " \tITEMS:                                \n");

    }

    public void addFarewell() {
        receipt.setContent(receipt.getContent() + " \t*****************************\n");
        receipt.setContent(receipt.getContent() + "\t      Thanks for shopping!\n");
        receipt.setContent(receipt.getContent() + " \t*****************************\n");
    }

    /**
     * Test of addWelcome method, of class CheckoutPrinter.
     */
    @Test
    public void testAddWelcome() {

        System.out.println("addWelcome");
        CheckoutPrinter instance = new CheckoutPrinter();
        instance.addWelcome();
        
        receipt=new Receipt();
        addWelcome();

        Receipt result = instance.receipt;
        Receipt expResult = receipt;

        assertEquals(receipt.content, result.content);

    }

    /**
     * Test of addItemLine method, of class CheckoutPrinter.
     */
    @Test
    public void testAddItemLine() {
        System.out.println("addItemLine");
        String id = "trial";
        BigDecimal price = BigDecimal.TEN;
        receipt = new Receipt();

        CheckoutPrinter instance = new CheckoutPrinter();
        instance.addItemLine(id, price);

        price.setScale(2, BigDecimal.ROUND_HALF_UP);
        receipt.setContent(receipt.getContent() + "\t " + id + ": " + price + " \n");

        assertEquals(receipt.content, instance.receipt.content);

    }

    /**
     * Test of addTotalWithoutDiscounts method, of class CheckoutPrinter.
     */
    @Test
    public void testAddTotalWithoutDiscounts() {
        System.out.println("addTotalWithoutDiscounts");

        receipt = new Receipt();
        
        BigDecimal totalWithoutDiscounts = BigDecimal.TEN;
        totalWithoutDiscounts.setScale(2, BigDecimal.ROUND_HALF_UP);
        receipt.setContent(receipt.getContent() + " \t--------------------------------------\n");
        receipt.setContent(receipt.getContent() + " \tTotal: " + totalWithoutDiscounts + "\n");

        CheckoutPrinter instance = new CheckoutPrinter();
        instance.addTotalWithoutDiscounts(totalWithoutDiscounts);

        assertEquals(receipt.content, instance.receipt.content);

    }

    /**
     * Test of addDiscounts method, of class CheckoutPrinter.
     */
    @Test
    public void testAddDiscounts() {
        System.out.println("addDiscounts");

        receipt = new Receipt();
        BigDecimal totalDiscounts = BigDecimal.TEN;
        totalDiscounts.setScale(2, BigDecimal.ROUND_HALF_UP);
        receipt.setContent(receipt.getContent() + " \tTotal discounts: " + totalDiscounts + "\n");

        CheckoutPrinter instance = new CheckoutPrinter();
        instance.addDiscounts(totalDiscounts);

        assertEquals(receipt.content, instance.receipt.content);
    }

    /**
     * Test of addTotalWithDiscounts method, of class CheckoutPrinter.
     */
    @Test
    public void testAddTotalWithDiscounts() {
        System.out.println("addTotalWithDiscounts");

        receipt = new Receipt();
        BigDecimal total = BigDecimal.TEN;
        total.setScale(2, BigDecimal.ROUND_HALF_UP);
        receipt.setContent(receipt.getContent() + " \t--------------------------------------\n");
        receipt.setContent(receipt.getContent() + " \tTotal with discounts: " + total + "\n");

        CheckoutPrinter instance = new CheckoutPrinter();
        instance.addTotalWithDiscounts(total);

        assertEquals(receipt.content, instance.receipt.content);
    }

    /**
     * Test of addFarewell method, of class CheckoutPrinter.
     */
    @Test
    public void testAddFarewell() {
        System.out.println("addFarewell");

        receipt = new Receipt();
        addFarewell();

        CheckoutPrinter instance = new CheckoutPrinter();
        instance.addFarewell();

        assertEquals(receipt.content, instance.receipt.content);
    }

    /**
     * Test of getReceipt method, of class CheckoutPrinter.
     */
    @Test
    public void testGetReceipt() {
        System.out.println("getReceipt");
        receipt = new Receipt();
        addFarewell();

        CheckoutPrinter instance = new CheckoutPrinter();
       
        Receipt result = instance.getReceipt();
        assertEquals(receipt.content, result.content);

    }

}
