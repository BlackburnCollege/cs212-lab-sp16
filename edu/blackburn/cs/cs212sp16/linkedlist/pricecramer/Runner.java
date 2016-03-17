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
public class Runner {
    public static void main(String[] args) {
        
        LinkedList linkedList = new LinkedList();
        for(int i = 0; i < 10; i++){
            linkedList.add(Account.getRandom());
            System.out.println(linkedList);
        }
        
    }
}
