/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.triage.pricerainford;

import edu.blackburn.cs.cs212sp16.er.*;
import java.util.*;

/**
 *
 * @author water
 */
public class Runner {

    /**
     * In the package edu.blackburn.cs.cs212sp16.er, there is our old friend
     * ListElement and there are two abstract classes: AbstractStack and
     * AbstractQueue. Starting with AbstractTriage, you will need to implement
     * all of the abstract functions. It's just that easy! One note is that you
     * will need to call the protected decrement and increment methods whenever
     * you remove or add a new patient (respectively). Once you have TriageStack
     * implemented, use a loop and the debugger to add and remove patients to
     * TriageStack and monitor their health on the whole by calling the depth()
     * method and the getStackHealth() method. Calling the getStackHealth()
     * method on TriageStack will call the getHealth() method on each patient in
     * the stack and thus make them sicker. Slowly add more and more patients
     * into the TriageStack object until you are confident that it works
     * correctly.
     */
    public static void main(String[] args) {

        Patient[] patient = new Patient[3];

        for (int i = 0; i < patient.length; i++) {
            patient[i] = Patient.newPatient();
        }
        while (patient[0].getHealth() != 0) {
            for (int i = 0; i < patient.length; i++) {
                System.out.println("Patient " + (i + 1) + " priority is: "
                        + patient[i].getPriority() + "\nPatient " + (i + 1)
                        + " health is: " + patient[i].getHealth());
                System.out.println();
            }
        }
        
        AbstractStack triageStack = new AbstractStack();
        
        
    }
}
