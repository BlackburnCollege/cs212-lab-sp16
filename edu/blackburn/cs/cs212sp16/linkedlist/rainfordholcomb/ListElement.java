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
public class ListElement {

    private Account account; //holds one account
    private ListElement nextElement;
    
    public ListElement(Account a){
        this.account = a;
    }
    
    public ListElement getNextElement(){
        return new ListElement(Account.getRandom());
    }
    
    public void setNextElement(ListElement le){
        this.nextElement = le;
    }
}
