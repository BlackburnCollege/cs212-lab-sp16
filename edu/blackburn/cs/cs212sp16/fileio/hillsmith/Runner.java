/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.fileio.hillsmith;

/**
 *
 * @author Hunter.Hill
 */
public class Runner {

    public static void main(String[] args) {
        testDivideByZero();
    }
    public static void testDivideByZero() {
        System.out.println("Divie by Zero checkpoint 1");
        try {
            int i = 100/0;
            System.out.println("Divide by Zero checkpoint 2");
        } catch (Exception e) {
            System.out.println("This doesn't work");
            System.out.println(e);
        }
        System.out.println("Divide by zero checkpoint 3");
        System.out.println("");
    }
}
