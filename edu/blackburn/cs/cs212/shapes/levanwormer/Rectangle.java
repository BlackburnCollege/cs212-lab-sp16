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
public class Rectangle {
    private Measurement height;
    private Measurement base;
    
    public Rectangle(Measurement base, Measurement height){
        this.height = height;
        this.base = base;
        System.out.println("New Rectangle: " + base.getLength() + " "
                + base.getUnit() + " by " + height.getLength() + " " + height.getUnit());
    }
    
}
