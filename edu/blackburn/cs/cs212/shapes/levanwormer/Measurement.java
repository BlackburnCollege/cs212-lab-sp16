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
public class Measurement {

    private String unit;
    private double length;

    public Measurement(String unit, double length) {
        this.unit = unit;
        this.length = length;
    }

    public String getUnit() {
        return this.unit;
    }

    public double getLength() {
        return this.length;
    }
}
