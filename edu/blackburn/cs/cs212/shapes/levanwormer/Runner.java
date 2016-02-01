/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212.shapes.levanwormer;

/**
 *
 * @author arthur.levan
 */
public class Runner {
    public static void main(String[] args) {
        Measurement base = new Measurement("In." , 1.0);
        Measurement height = new Measurement("In." , 2.0);
        Rectangle r = new Rectangle(base, height);
        Square s = new Square(base);

    }
}
