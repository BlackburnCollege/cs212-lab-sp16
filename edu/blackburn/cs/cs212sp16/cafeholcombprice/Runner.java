/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.cafeholcombprice;

import edu.blackburn.cs.cs212sp16.coffeeshop.*;
/**
 *
 * @author ashley.holcomb
 */
public class Runner {
    public static void main(String[] args) {
        Flavor frenchVanilla = new Flavor(new Milliliter(10.0), "French Vanilla");
        System.out.println(frenchVanilla);
        Customer c1 = new Customer("Bob");
        System.out.println(c1);
    }
}
