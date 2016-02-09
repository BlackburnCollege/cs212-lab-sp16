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
public class Measurement {
    private double value;
    private String units;
    
    public Measurement(double value, String units) {
        setValue(value);
        setUnits(units);
    }
    
    public double getValue() {
        return value;
    }
    
    public String getUnits() {
        return units;
    }
    
    private void setValue(double value) {
        this.value = value;
    }
    
    private void setUnits(String units) {
                this.units = units;
    }
}
