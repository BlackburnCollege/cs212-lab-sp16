/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.fileio.rekartlevan;

import java.io.*;

/**
 *
 * @author braydon.rekart
 */
public class Runner {

    public static void main(String[] args) {
        testDivideByZero();
        String toRead = "cs212-lab-sp16/edu/blackburn/cs/cs212sp16/fileio/rekartlevan/lab06.txt";
        openFile(toRead);
        openFile("incorrectfile.txt");
        readFile(toRead);

    }

    public static void testDivideByZero() {
        System.out.println("Divide By Zero Checkpoint 1");
        try {
            int breakTheUniverse = 54563 / 0;
            System.out.println("Divide By Zero Checkpoint 2");
        } catch (Exception e) {

        }
        System.out.println("Divide By Zero Checkpoint 3");
        System.out.println();
    }

    public static void openFile(String filename) {

        System.out.println("Opening File: " + filename);
        System.out.println("Open/Read Checkpoint 1");
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println("Open/Read Checkpoint 2");

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Open/Read Checkpoint 3");
        System.out.println();
    }

    public static void readFile(String filename) {

        System.out.println("Reading File: " + filename);
        System.out.println("Read Checkpoint 1");
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println("Read Checkpoint 2");
            String tmp = "here's your file";
            do {
                System.out.println(tmp);
                tmp = bufferedReader.readLine();
            } while (tmp != null);
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("No such file.");
            
        } catch (IOException io) {
            System.out.println("IO exception found");
            System.out.println("Read Checkpoint 4");
        }
        
        System.out.println("Read Checkpoint 3");
        System.out.println();
    }
}
