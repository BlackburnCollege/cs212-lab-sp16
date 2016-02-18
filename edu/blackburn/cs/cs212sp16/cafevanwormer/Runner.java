/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.cafevanwormer;

/**
 *
 * @author dakota.vanwormer
 */
import edu.blackburn.cs.cs212sp16.coffeeshop.*;
public class Runner {
    public static void main(String[] args) {
        Customer customer = new Customer("Joshua");
        System.out.println(customer);
        Milliliter milliliter = new Milliliter(8.5);
        Creamer creamer = new Creamer(milliliter);
        System.out.println(milliliter);
        System.out.println(creamer);
    }
}
