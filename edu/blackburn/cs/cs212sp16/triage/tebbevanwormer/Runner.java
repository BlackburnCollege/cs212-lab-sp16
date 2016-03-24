/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.triage.tebbevanwormer;
import edu.blackburn.cs.cs212sp16.er.*;
/**
 *
 * @author dakota.tebbe
 */
public class Runner {
    public static void main(String[] args) {
        Patient dakota;
        dakota = Patient.newPatient();
        double health=0;
        int counter=0;
        do{
            counter++;
            health=dakota.getHealth();
            System.out.println(health);
        }while(health>0);
        System.out.println(dakota.getPriority());
        System.out.println(counter);
    }
}
