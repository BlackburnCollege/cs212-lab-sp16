/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212.bank.rainfordlastname;

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
        this.balance = m;
    }
    
    public Money getBalance() {
        return balance;
    }
    
    protected void debit(Money m) {
        
    }
    
    protected void credit(Money m) {
        
    }
    
    public void deposit(Money m) {
        this.balance = this.balance.add(m);
    }
    
    public void withdraw(Money m) {
        this.balance = this.balance.subtract(m);
    }

    @Override
    public String toString() {
        return balance.toString();
    }
    
    
}
