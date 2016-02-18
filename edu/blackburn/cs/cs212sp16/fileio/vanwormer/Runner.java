/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.fileio.vanwormer;

/**
 *
 * @author admin.dakota
 */
public class Runner {
    
    public static void testDivideByZero() {
        System.out.println("Divide By Zero Checkpoint 1");
        // stuff before Exception throwing code
        try {
        // Exception throwing code
            int error = 5/0;
            System.out.println("Divide By Zerio Checkpoint 2");
        } catch (Exception e) {
        // what to do if and only if an exception is thrown
        // for now, we'll just be printing out the exception
        }
        // stuff that happens after the exception throwing code
        System.out.println("Divide By Zerio Checkpoint 3");
        System.out.println();
    } 
    public static void main(String[] args) {
        testDivideByZero();
    }
}
