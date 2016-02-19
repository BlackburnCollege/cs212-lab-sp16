/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.cafemuellerrekart;
import edu.blackburn.cs.cs212sp16.coffeeshop.*;
/**
 *
 * @author braydon.rekart
 */
public class Runner {
    public static void main(String[] args) {
        Customer customer = new Customer("Ellen K.");
        System.out.println(customer);
        Measurement measurement = new Measurement(12, "Sugar");
        System.out.println(measurement);
        //Flavor flavor = new Flavor(12.0);
        
        
    }
}
