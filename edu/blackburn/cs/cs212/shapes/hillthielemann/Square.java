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
public class Square extends Rectangle{
    
    public Square(int length){
        
        super(length,length);
        System.out.println("New Square: "+ getLength() +"");
    }
    
    
}
