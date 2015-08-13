/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinginthesupermarket;

import java.math.BigDecimal;

/**
 *
 * @author oracle
 */
class CheckoutPrinter {

    Receipt receipt;

    public CheckoutPrinter() {
        receipt = new Receipt();
    }

    public void addWelcome() {

        receipt.setContent(receipt.getContent() + " \tWelcome to the Supermarket:\n");
        receipt.setContent(receipt.getContent() + " \t*****************************\n");
        receipt.setContent(receipt.getContent() + " \tMerchant ID:          2225444\n");
        receipt.setContent(receipt.getContent() + " \tTerminal ID:       5489254353\n");
        receipt.setContent(receipt.getContent() + " \t--------------------------------------\n");
        receipt.setContent(receipt.getContent() + " \tITEMS:                                \n");

    }

    public void addItemLine(String id, BigDecimal price) {
        price.setScale(2, BigDecimal.ROUND_HALF_UP);
        receipt.setContent(receipt.getContent() + "\t " + id + ": " + price + " \n");
    }

    public void addTotalWithoutDiscounts(BigDecimal totalWithoutDiscounts) {
        totalWithoutDiscounts.setScale(2, BigDecimal.ROUND_HALF_UP);
        receipt.setContent(receipt.getContent() + " \t--------------------------------------\n");
        receipt.setContent(receipt.getContent() + " \tTotal: " + totalWithoutDiscounts + "\n");
    }

    public void addDiscounts(BigDecimal totaldiscounts) {
        totaldiscounts.setScale(2, BigDecimal.ROUND_HALF_UP);
        receipt.setContent(receipt.getContent() + " \tTotal discounts: " + totaldiscounts + "\n");
    }

    public void addTotalWithDiscounts(BigDecimal total) {
        total.setScale(2, BigDecimal.ROUND_HALF_UP);
        receipt.setContent(receipt.getContent() + " \t--------------------------------------\n");
        receipt.setContent(receipt.getContent() + " \tTotal with discounts: " + total + "\n");
    }

    public void addFarewell() {
        receipt.setContent(receipt.getContent() + " \t*****************************\n");
        receipt.setContent(receipt.getContent() + "\t      Thanks for shopping!\n");
        receipt.setContent(receipt.getContent() + " \t*****************************\n");
    }

    public Receipt getReceipt() {

        addFarewell();
        return receipt;
    }

}
