package edu.blackburn.cs.cs212.lab01.tebbevanwormer.bank;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joshua.gross
 */
// All money math occurs here.
public class Money {

    private String currency;
    private double value;

    public Money(String currency, double value) {
        setCurrency(currency);
        setValue(value);
    }

    private void setCurrency(String currency) {
        this.currency = currency;
    }
// v bug v
    public String getCurrency() {
        return this.currency;
    }

    public double getValue() {
        return this.value;
    }

    private void setValue(double value) {
        this.value = value;
    }

}
