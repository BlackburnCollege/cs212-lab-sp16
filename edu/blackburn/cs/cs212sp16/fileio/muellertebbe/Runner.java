/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.fileio.muellertebbe;

import java.io.*;

/**
 *
 * @author Jordan.Mueller
 */
public class Runner {

    

    public static void main(String[] args) {
        testDivideByZero();
        String filename = "cs212-lab-sp16/edu/blackburn/cs/cs212sp16/fileio/muellertebbe/lab06.txt";
        openFile(filename);
        openFile("lab06.txt");
    }

    public static int testDivideByZero() {
        // stuff before Exception throwing code
        int var = 1;
        System.out.println("Divide By Zero Checkpoint 1");
        try {
// Exception throwing code
            var = var / 0;
            System.out.println("Divide By Zero Checkpoint 2");
        } catch (Exception e) {
// what to do if and only if an exception is thrown
// for now, we'll just be printing out the exception

        }
// stuff that happens after the exception throwing code
        System.out.println("Divide By Zero Checkpoint 3");
        System.out.println("");
        return var;
    }
    public static void openFile(String filename){
        System.out.println("Opening File: " + filename);
        System.out.println("Open Checkpoint 1");
        try { 
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            System.out.println("Open Checkpoint 2");
            } catch (Exception e) {
                System.out.println(e);
        }
        System.out.println("Open Checkpoint 3");
        System.out.println("");
    }

}
