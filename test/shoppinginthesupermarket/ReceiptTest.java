/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinginthesupermarket;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oracle
 */
public class ReceiptTest {
    
    public ReceiptTest() {
    }
       

    /**
     * Test of getContent method, of class Receipt.
     */
    @Test
    public void testGetContent() {
        System.out.println("getContent");
        Receipt instance = new Receipt();
        String expResult = "";
        String result = instance.getContent();
        
        assertEquals(expResult, result);

    }

    /**
     * Test of setContent method, of class Receipt.
     */
    @Test
    public void testSetContent() {
        System.out.println("setContent");
        String content = "content";
        Receipt instance = new Receipt();
        
        String expResult="content";
        instance.setContent(content);
        String result=instance.getContent();
        
        assertEquals(expResult, result);
        
    }
    
}
