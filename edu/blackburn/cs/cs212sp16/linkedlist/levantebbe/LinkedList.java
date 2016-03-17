/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.linkedlist.levantebbe;

/**
 *
 * @author dakota.tebbe
 */
public class LinkedList {

    private ListElement firstElement;
    private ListElement currentElement;

    public LinkedList() {
        this.firstElement = null;
        this.currentElement = null;
    }

    public void add(Account acc) {
        if (this.firstElement == null) {
            this.firstElement = new ListElement(acc);
        } 
        else if (this.firstElement.getNextElement() == null) {
            this.currentElement = new ListElement(acc);
            this.firstElement.setNextElement(currentElement);
        } 
        else {
            while (hasNext()) {
                getNext();
            }
            this.currentElement.setNextElement(new ListElement(acc));
        }
        this.currentElement = this.firstElement;
    }

    public boolean hasNext() {
        return (this.currentElement.getNextElement() != null);
    }

    public Account getNext() {
        if (!hasNext()) {
            this.currentElement = firstElement.getNextElement();
        } 
        else {
            this.currentElement = this.currentElement.getNextElement();
        }
        return this.currentElement.getAccount();
    }
    
    public Boolean contains(Account acc){
        
        
        return true;
    }
}
