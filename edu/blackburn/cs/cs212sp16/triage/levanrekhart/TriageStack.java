/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.triage.levanrekhart;
import edu.blackburn.cs.cs212sp16.er.*;
/**
 *
 * @author arthur.levan
 */
public class TriageStack extends AbstractStack {

    @Override
    public void push(Patient ptnt) {
        increment();
    }

    @Override
    public Patient pop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
