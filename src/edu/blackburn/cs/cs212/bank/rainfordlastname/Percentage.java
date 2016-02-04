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
public class Percentage {
    
    private double percent;
    
    public Percentage(double percent) {
        this.percent = (percent/100); 
    }

    @Override
    public String toString() {
        return (this.percent * 100) + "%";
    }
    
    
    
}
