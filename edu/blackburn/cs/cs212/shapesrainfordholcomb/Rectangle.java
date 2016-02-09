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
public class Rectangle {
    private Measurement width;
    private Measurement height;
    //private Measurement units;
    
    public Rectangle(double width, double height, String units) {
        this.width = new Measurement(width, units);
        this.height = new Measurement(height, units);
    }
    
    public Measurement getArea() {
        Measurement area = new Measurement(width.getValue() * height.getValue(), 
                width.getUnits() + " squared");
        return area;
    } 
    
    public Measurement getPerimeter() {
        Measurement perimeter = new Measurement(2 * width.getValue() 
                + 2 * height.getValue(), width.getUnits());
        return perimeter;
    }
}
