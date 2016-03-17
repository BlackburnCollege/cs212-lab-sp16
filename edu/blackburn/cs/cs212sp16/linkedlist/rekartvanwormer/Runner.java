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
//Started: 2:00- finished 5.
public class Runner {
    // Here we create a new list and pass accounts into it.
    public static void main(String[] args) {
        LinkedList aList = new LinkedList();
        Account acc = Account.getRandom();
        aList.add(acc);
        aList.add(Account.getRandom());
        aList.add(Account.getRandom());
// Test code that prints out the list.
        System.out.println(aList.getFirst());
        for (int i = 1; i < aList.size(); i++) {
            System.out.println(aList.getFirst().getNextElement());
        }
        if (aList.contains(acc)) {
            System.out.println("List contains " + acc);
        }
            System.out.println("The position of acc is: " + aList.find(acc));
           // System.out.println("Getting acc:" + aList.get(1));
        }
    }

