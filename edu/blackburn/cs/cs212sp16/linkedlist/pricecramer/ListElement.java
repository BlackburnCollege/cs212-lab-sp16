/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.linkedlist.pricecramer;

/**
 *
 * @author Olivia.Price
 */
public class ListElement {

    private Account Account;
    private ListElement nextElement;

    public ListElement(Account a) {
        this.Account = a;
    }

    public ListElement getNextElement() {
        return this.nextElement;
    }

    public void setNextElement(ListElement nextElement) {
        this.nextElement = nextElement;
    }
}
