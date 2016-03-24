/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.triage.cramerholcomb;

import edu.blackburn.cs.cs212sp16.er.*;

/**
 *
 * @author ashley.holcomb
 */
public class Runner {

    public static void main(String[] args) {
        Patient p = Patient.newPatient();
        Patient[] patients = new Patient[5];

        for (int i = 0; i < 4; i++) {
            patients[i] = Patient.newPatient();
            System.out.println("Patient " + (i + 1) + " Health: "
                    + patients[i].getHealth());
            System.out.println("Patient " + (i + 1) + " Priority: "
                    + patients[i].getPriority());
        }

        for (int i = 0; i < 4; i++) {
            while (patients[i].getHealth() != 0) {
                System.out.println("Patient " + (i + 1) + " Health: "
                        + patients[i].getHealth());
            }
            System.out.println("Patient health: " + patients[i].getHealth());
        }
    }
}
