/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.fileio.pricecramer;
import java.io.*;
/**
 *
 * @author olivia.price
 */
public class Runner {
    public static void main(String[] args) {
        //not working filename
       openFile("lab06.txt");
       //working filename
       openFile("cs212-lab-sp16/edu/blackburn/cs/cs212sp16/fileio/pricecramer/lab06.txt");
        DivideByZero();
    }
    public static void DivideByZero(){
        System.out.println("Divide By Zero Checkpoint 1");
           //stuff beofre Exception-throwing code
        try{
            int a = 8/0;
            System.out.println("Divide By Zero Checkpoint 2");
        }catch(Exception e){
            System.out.println(e);
        }
         System.out.println("Divide By Zero Checkpoint 3");
         System.out.println("");
    }
    public static void openFile(String filename){
        System.out.println("Opening File: " + filename);
        System.out.println("Open/Read Checkpoint 1");
        try{
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            System.out.println("Open/Read Checkpoint 2");
            br.close();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Open/Read Checkpoint 4");
        System.out.println("");
    }
        public static void readFile(String filename){
        System.out.println("Opening File: " + filename);
        System.out.println("Open/Read Checkpoint 1");
        try{
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            System.out.println("Open/Read Checkpoint 2");
            br.close();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Open/Read Checkpoint 4");
        System.out.println("");
    }
}
