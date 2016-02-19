/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.fileio.rekartlastname;

import java.io.*;

/**
 *
 * @author braydon.rekart
 */
public class Runner {

    public static void main(String[] args) {
        testDivideByZero();
    }

    public static void testDivideByZero() {
        System.out.println("Divide By Zero Checkpoint 1");
        try {
            int breakTheUniverse = 54563 / 0;
            System.out.println("Divide By Zero Checkpoint 2");
        } catch (Exception e) {
            System.out.println("Divide By Zero Checkpoint 2");
        }
        System.out.println();
    }

    public static void openFile(String filename) {

        System.out.println("Opening File: " + filename);
        System.out.println("Open/Read Checkpoint 1");
        try {
            FileReader fileReader = new FileReader
        ("blackburn-cs212-sp16/edu/blackburn/cs/cs212-lab-sp16/lab06.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
