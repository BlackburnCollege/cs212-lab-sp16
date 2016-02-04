/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212.bank.rekartlastname;

/**
 *
 * @author joshua.gross
 */
public abstract class Account {

    private Money balance;

    public Account(Money balance) {
        this.balance = balance;
    }

    public Money getBalance() {
        return this.balance;
    }

    protected void debit(Money m) {
        this.balance = this.balance.subtract(m);
    }

    protected void credit(Money m) {
        this.balance = this.balance.add(m);
    }

    public void deposit(Money m) {
        this.credit(m);
    }

    public void withdraw(Money m) {
        this.debit(m);
    }

    @Override
    public String toString() {
        return "balance = " + balance;
    }

}
