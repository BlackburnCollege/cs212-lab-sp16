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
public class Rectangle {
    
    private int length;
    private int width;
    
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        System.out.println("New Rectangle: " + length + " by " + width);
    }
    
    public Measurement getArea() {
        Measurement area = new Measurement(length * width);
        return area;
    }
    
    public Measurement getPerimeter() {
        Measurement perimeter = new Measurement ((length * 2) + (width * 2));
        return perimeter;
    }
    
}
