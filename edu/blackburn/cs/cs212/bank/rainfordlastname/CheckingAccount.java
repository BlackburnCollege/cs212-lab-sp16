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
public class CheckingAccount extends Account {
    
    private Money money;
    
    
    public CheckingAccount(Money balance) {
        super(balance);
    }
    
//    public Money withDraw(Money money) {
//        return getBalance() - money.getAmount();
//    }
    
}
