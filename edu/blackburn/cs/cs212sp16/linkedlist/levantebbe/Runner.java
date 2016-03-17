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
public class Runner {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        
        for(int i = 0; i<5; i++){
            l.add(Account.getRandom());
        }
        for(int i = 0; i<5; i++){
            System.out.println(l.getNext());
        }
    }
}
