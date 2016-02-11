/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212.bank.hillcramer;

/**
 *
 * @author joshua.gross
 */
public class Runner {

    public static void main(String[] args) {
        Money money = new Money("usd", 0);
        CheckingAccount a = new CheckingAccount(money);
        Money moreMoney = new Money("usd", 10);
        System.out.println("a's balance = " + a.getBalance());

        a.deposit(moreMoney);
        System.out.println("Deposit 10$ to a's account.");
        System.out.println("a's balance = " + a.getBalance());

        a.deposit(moreMoney);
        System.out.println("Deposit 10$ to a's account.");
        System.out.println("a's balance = " + a.getBalance());

        Money evenMoreMoney = new Money("usd", 5);

        a.withdraw(evenMoreMoney);
        System.out.println("Withdraw 5$ from a's account");
        System.out.println("a's balance = " + a.getBalance());

        a.withdraw(moreMoney);
        System.out.println("Withdraw 10$ from a's account");
        System.out.println("a's balance = " + a.getBalance());

        a.deposit(evenMoreMoney);
        System.out.println("Deposit 5$ to a's account");
        System.out.println("a's balance = " + a.getBalance());

        a.deposit(moreMoney);
        System.out.println("Deposit 10$ to a's account.");
        System.out.println("a's balance = " + a.getBalance());

        a.withdraw(evenMoreMoney);
        System.out.println("Withdraw 5$ from a's account");
        System.out.println("a's balance = " + a.getBalance());

        Money oneMillion = new Money("usd", 1000000);

        a.deposit(oneMillion);
        System.out.println("Deposit 1,000,000$ to a's account");
        System.out.println("a's balance = " + a.getBalance());

        a.withdraw(evenMoreMoney);
        System.out.println("Withdraw 5$ from a's account");
        System.out.println("a's balance = " + a.getBalance());

        a.withdraw(moreMoney);
        System.out.println("Withdraw 10$ from a's account");
        System.out.println("a's balance = " + a.getBalance());

    }
}
