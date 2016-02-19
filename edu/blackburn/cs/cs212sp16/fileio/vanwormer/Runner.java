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
import java.io.*;
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
    
    public static void openFile(String filename) {
        System.out.println("Opening File: " + filename);
        System.out.println("Open Checkpoint 1");
        try {
        // Exception throwing code
            FileReader fileReader = new FileReader(filename);
            BufferedReader buffRead = new BufferedReader(fileReader);
            System.out.println("Open Checkpoint 2");
        } catch (Exception e) {
        // what to do if and only if an exception is thrown
        // for now, we'll just be printing out the exception
        System.out.println("Exception found");
        }
        // stuff that happens after the exception throwing code
        System.out.println("Open Checkpoint 3");
        System.out.println();
    }
    
    public static void readFile(String filename) {
        String tmp = "Here's your file";
        System.out.println("Opening File: " + filename);
        System.out.println("Read Checkpoint 1");
        try {
        // Exception throwing code
            FileReader fileReader = new FileReader(filename);
            BufferedReader buffRead = new BufferedReader(fileReader);
            do {
                System.out.println(tmp);
                tmp = buffRead.readLine();
            } while(tmp != null);
            System.out.println("Read Checkpoint 2");
        } catch (IOException ex) {
        // what to do if and only if an exception is thrown
        // for now, we'll just be printing out the exception
        System.out.println("No such file");
        }
        // stuff that happens after the exception throwing code
        System.out.println("Read Checkpoint 3");
        System.out.println();
    }
    
    public static void main(String[] args) {
        testDivideByZero();
        openFile("lab06.txt");
        readFile("lab06.txt");
    }
}
