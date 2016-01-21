package edu.blackburn.cs.cs212.lab01.rekartlevan.bank;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author joshua.gross
 */
public class Runner {
    public static void main(String[] args) {
        Money m = new Money("USD", 10);
        System.out.println("currency = " + m.getCurrency());
        System.out.println("value = " + m.getValue());
    }
}
