/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212.shapesrainfordholcomb;

/**
 *
 * @author shelby.rainford
 */
public class Runner {
    
    public static void main(String[] args) {
        Measurement m = new Measurement(2, "inches");
        Rectangle r = new Rectangle(2, 4, "inches");
        Square s = new Square(2, "inches");
        
        System.out.println(m);
        System.out.println(r);
        System.out.println(s);
    }
}
