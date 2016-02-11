/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212.bank.muellervanwormer;

/**
 *
 * @author joshua.gross
 */
public class Runner {
    public static void main(String[] args) {
        CheckingAccount a = new CheckingAccount(new Money("donuts ", 12));
        System.out.println("a's balance = " + a.getBalance());
        a.deposit(new Money("donuts", 9.99));
        System.out.println("new balance = " + a.getBalance());
        a.withdraw(new Money("donuts", 100));
        System.out.println("new balance = " + a.getBalance());
    }
}

