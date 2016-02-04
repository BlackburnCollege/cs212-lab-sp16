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
public class CheckingAccount extends Account {
    
    public CheckingAccount(Money balance) {
        super(balance);
    }

    @Override
    public Money getBalance() {
        return new Money("Euros ", 250);
    }
    
}
