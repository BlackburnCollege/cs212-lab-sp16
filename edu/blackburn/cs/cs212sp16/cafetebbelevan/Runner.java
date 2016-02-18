/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.cafetebbelevan;
import edu.blackburn.cs.cs212sp16.coffeeshop.*;
/**
 *
 * @author dakota.tebbe
 */
public class Runner {
    public static void main(String[] args) {
        Customer customer = new Customer("Loser");
        Packet pen = new Packet (15);
        Sugar cream = new Sugar(pen);
        Coffee ice = new Coffee(customer, true);
        ice.setMixer(cream);
        Measurement lucas = ice.getMixer().getAmount();
        System.out.println(pen==lucas);
        
    }
}
