/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212.shapes.mueller;

/**
 *
 * @author Jordan.Mueller
 */
public class Square {
    
    private int length;
    
    public Square(int length) {
        this.length = length;
        System.out.println("New Square: " + length);
    }
    
    public Measurement getArea() {
        Measurement area = new Measurement(this.length * this.length);
        return area;
    }
    
    public Measurement getPerimeter() {
        Measurement perimeter = new Measurement(this.length * 4);
        return perimeter;
    }
    
}
