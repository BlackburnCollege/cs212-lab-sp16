/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.blackburn.cs.cs212sp16.linkedlist.rekartvanwormer;
/**
 *
 * @author braydon.rekart/dakota.vanwormer
 */
public class LinkedList {
// Fields. First element is the first list object, current element is the current one.

    private ListElement firstElement;
    private ListElement currentElement;
    private int size = 0;

    // Constructor.
    public LinkedList() {

    }

    public Account getTest(int index) {
        return null;
    }
        // This returns the first element of the list.
    public ListElement getFirst() {
        return firstElement;
    }

    // This adds an account to the list.
    public void add(Account a) {
        ListElement listElement = new ListElement(a);
        if (this.firstElement == null) {
            firstElement = listElement;
            currentElement = listElement;
        } else {
            currentElement.setNextElement(listElement);
        }
        size++;
    }

    // This returns the size.
    public int size() {
        return size;
    }

    // This determines if the element has a next element.
    public boolean hasNext() {
        return (currentElement.getNextElement() != null);
    }

    // This returns the next element.
    public ListElement getNext() {
        return currentElement.getNextElement();
    }

    public int find(Account a) {
        for (int i = 1; i < size(); i++) {
            if (currentElement.getAccount() == a) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(Account a) {
        for (int i = 1; i < size(); i++) {
            if (currentElement.getAccount() == a) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "LinkedList{" + "firstElement=" + firstElement + ", currentElement=" + currentElement + ", size=" + size + '}';
    }

}
