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
public class Measurement {
    
    private int value;
    
    public Measurement(int value) {
        this.value = value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
}
