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
public class Money {
    
    private String currency;
    private double amount;

    public Money(String currency, double amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }
    
    public String toString() {
        return this.currency + " " + this.amount;
    }
    
    public Money add(Money money1){
        double holdAmount = money1.getAmount() + this.getAmount();
        String holdCurrency = this.getCurrency();
        return new Money(holdCurrency, holdAmount);
    }
    
    public Money subtract(Money money1){
        double holdAmount = this.getAmount() - money1.getAmount();
        String holdCurrency = this.getCurrency();
        return new Money(holdCurrency, holdAmount);
    }
    
}
