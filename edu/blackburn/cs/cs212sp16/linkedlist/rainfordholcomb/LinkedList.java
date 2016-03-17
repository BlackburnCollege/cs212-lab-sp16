/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.linkedlist.rainfordholcomb;

/**
 *
 * @author ashley.holcomb
 */
public class LinkedList {

    private ListElement firstElement;
    private ListElement currentElement;

    public LinkedList() {
        //test
        Account a = Account.getRandom();
        this.add(a);
    }

    public void add(Account a) {
        if (firstElement == null) {
            this.firstElement = new ListElement(a);
            this.firstElement.setNextElement(currentElement);
        } else {
            this.currentElement.setNextElement(new ListElement(a));
        }
    }

    public void delete(Account a) {

    }

    public void delete(int index) {

    }

    public int find(Account a) {
        return -1;
    }

    public boolean contains(Account a) {
        return true;
    }

    public void insertBefore(int index, Account a) {

    }

    public void insertBefore(Account a, Account b) {

    }

    public void insertAfter(int index, Account a) {

    }

    public void insertAfter(Account a, Account b) {

    }

    public void replace(int index, Account a) {

    }

    public void replace(Account a, Account b) {

    }

    public boolean hasNext() {
        return true;
    }

    public Account getNext() {
        return Account.getRandom();
    }

    public Account get(int index) {
        return Account.getRandom();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
