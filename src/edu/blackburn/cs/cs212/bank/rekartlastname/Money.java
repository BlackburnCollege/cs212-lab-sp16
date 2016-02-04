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
public class Money {

    private String currency;
    private final double amount;

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
        return this.amount + this.currency;
    }

    public Money add(Money m) {
        double tempAmount = this.getAmount() + m.getAmount();
        return new Money(m.getCurrency(), tempAmount);
    }

    public Money subtract(Money m) {
        double tempAmount = this.getAmount() - m.getAmount();
        return new Money(m.getCurrency(), tempAmount);
    }
}
