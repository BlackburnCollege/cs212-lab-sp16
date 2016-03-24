/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.triage.levanrekhart;
import edu.blackburn.cs.cs212sp16.er.*;
import static edu.blackburn.cs.cs212sp16.er.Patient.newPatient;

/**
 *
 * @author arthur.levan
 */
public class Runner {
    public static void main(String[] args) {
        Patient a = Patient.newPatient();
        Patient b = Patient.newPatient();
        Patient c = Patient.newPatient();
        TriageStack stack = new TriageStack();
        double hp = 0;
      int count = 0;
      stack.push(a);
      stack.push(b);
      stack.push(c);
        System.out.println(c);
        System.out.println(stack.pop());
        do {
            hp  = a.getHealth();
            System.out.println(hp);
            count++;
        } while(hp != 0);
        System.out.println("Ticked: " + count + " times.");
        System.out.println(a.getPriority());
        
    }
}
