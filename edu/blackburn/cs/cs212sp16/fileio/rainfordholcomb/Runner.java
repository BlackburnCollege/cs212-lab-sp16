/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.fileio.rainfordholcomb;

/**
 *
 * @author ashley.holcomb
 */
public class Runner {
    public static void main(String[] args) {
        testDivideByZero();
    }
    public static void testDivideByZero(){
        System.out.println("Divide by zero Checkpoint 1");
        try {
            int test = 7/0;
            System.out.println("test = " + test);
            System.out.println("Divide by zero Checkpoint 2");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Divide by zero Checkpoint 3");
        System.out.println();
    }
    
}
