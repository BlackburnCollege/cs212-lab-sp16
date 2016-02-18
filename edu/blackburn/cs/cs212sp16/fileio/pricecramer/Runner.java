/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.fileio.pricecramer;

/**
 *
 * @author olivia.price
 */
public class Runner {
    public static void main(String[] args) {
       
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
}
