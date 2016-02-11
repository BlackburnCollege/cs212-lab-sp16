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
public abstract class Account {
    
    private Money balance;

    public Account(Money balance) {
        this.balance = balance;
    }
    
    private void setBalance(Money m) {
        balance = m;
    }
    
    public Money getBalance() {
        return this.balance;
    }
    
    protected void debit(Money m) {
        //????
    }
    
    protected void credit(Money m) {
        //Credit is basically a deposit that happens after a few days. (?)
    }
    
    public void deposit(Money m) {
        balance = balance.add(m);
    }
    
    public void withdraw(Money m) {
        balance = balance.subtract(m);
    }
    
}
