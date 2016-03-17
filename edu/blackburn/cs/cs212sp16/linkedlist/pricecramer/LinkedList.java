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
public class LinkedList {

    private ListElement firstElement;
    private ListElement currentElement;

    public LinkedList() {

    }

    public void add(Account a) {
        if (this.firstElement == null) {
            this.firstElement = new ListElement(a);
        } else {
            this.currentElement = new ListElement(a);
        }
    }

    public void delete(Account a) {

    }

    public void delete(int index) {

    }

    public int find(Account a) {
        return 0;
    }

    public boolean contains(Account a) {
        return true;
    }

    public void insertBefore(Account a, Account b) {

    }

    public void insertBefore(int index, Account a) {

    }

    public void insertAfter(Account a, Account b) {

    }

    public void insertAfter(int index, Account a) {

    }

    public void replace(Account a, Account b) {

    }

    public void replace(int index, Account a) {

    }

    public boolean hasNext() {
        if(this.currentElement.getNextElement() == null){
            return false;
        }
        return true;
    }

    public ListElement getNext() {
        return this.currentElement.getNextElement();
    }

    //public Account get(int index) {
      //  return;
    //}

    @Override
    public String toString() {
        return "";
    }
}
