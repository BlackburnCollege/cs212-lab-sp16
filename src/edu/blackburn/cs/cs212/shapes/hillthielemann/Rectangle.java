/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212.shapes.hillthielemann;

/**
 *
 * @author hunter.hill
 */
public class Rectangle {
    private int length;
    private int width;
    
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
        System.out.println("New Rectangle: "+this.length+" by "+this.width);
        
    }
    
    public int getArea(){
        
        return (this.length*this.width);
    }
    public int getPerimeter(){
        return (this.length+this.width)*2;
    }
    
    public int getLength(){
        return this.length;
    }
   
}
