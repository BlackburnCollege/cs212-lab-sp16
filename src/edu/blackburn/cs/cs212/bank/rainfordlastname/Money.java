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

    public Money add(Money money) {
        double newBalance = this.getAmount() + money.getAmount();
        String newCurrency = money.getCurrency();
        return new Money(newCurrency, newBalance);
    }

    public Money subtract(Money money) {
        double newBalance = this.getAmount() - money.getAmount();
        String newCurrency = money.getCurrency();
        return new Money(newCurrency, newBalance);
    }

    @Override
    public String toString() {
        return this.currency + " " + this.amount;
    }

}
