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
public abstract class Account {
    
    private Money balance;
    private double money;

    public Account(Money balance) {
        this.balance = balance;
    }
    
    private void setBalance(Money m) {
        this.balance = m;
    }
    
    public Money getBalance() {
        //return new Money("francs", 2500000);
        return balance;
    }
    
    protected void debit(Money m) {
        
    }
    
    protected void credit(Money m) {
        
    }
    
    public void deposit(Money m) {
        this.balance = balance.add(m);
    }
    
    public void withdraw(Money m) {
        this.balance = balance.sub(m);
    }
    
}
