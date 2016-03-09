/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.fileio.rainfordholcomb;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ashley.holcomb
 */
public class Runner {

    public static void main(String[] args) {
        testDivideByZero();
        openFile("cs212-lab-sp16/edu/blackburn/cs/cs212sp16/fileio/rainfordholcomb/lab06.txt");
        //openFile("edu/blackburn/cs/cs212sp16/fileio/rainfordholcomb/lab06.txt");
        readFile("cs212-lab-sp16/edu/blackburn/cs/cs212sp16/fileio/rainfordholcomb/lab06.txt");
    }

    public static void testDivideByZero() {
        System.out.println("Divide by zero Checkpoint 1");
        try {
            int test = 7 / 0;
            System.out.println("test = " + test);
            System.out.println("Divide by zero Checkpoint 2");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Divide by zero Checkpoint 3");
        System.out.println();
    }

    public static void openFile(String filename) {
        System.out.println("Opening File: " + filename);
        System.out.println("Open/Read Checkpoint 1");
        
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            System.out.println("Open/Read Checkpoint 2");
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Open/Read Checkpoint 4");
        System.out.println();
        
    }
    
    public static void readFile(String filename){
        System.out.println("Opening File: " + filename);
        System.out.println("Read Checkpoint 1");
        
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            System.out.println("Read Checkpoint 2");
            String tmp = "Reading the file:";
            do {
                System.out.println(tmp);
                tmp = br.readLine();
            } while(tmp != null);
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("No such file.");
        } catch (IOException ex) {
            Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Read Checkpoint 4");
        System.out.println();
    }

}
