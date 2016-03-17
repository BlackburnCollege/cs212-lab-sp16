/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.linkedlist.rekartlastname;

/**
 *
 * @author braydon.rekart
 */
public class ListElement {

    private Account account;
    private ListElement nextElement;

    public ListElement(Account a) {
        this.account = a;
    }

    public ListElement getNextElement() {
        return nextElement;
    }

    public void setNextElement(ListElement le) {
        this.nextElement = le;
    }
}
