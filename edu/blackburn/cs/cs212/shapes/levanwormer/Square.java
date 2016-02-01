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
public class Square extends Rectangle{
    
    
    public Square(Measurement side){
         super(side, side);
        
        System.out.println("New Square: " + side.getLength() + " " + side.getUnit());
    }
}
