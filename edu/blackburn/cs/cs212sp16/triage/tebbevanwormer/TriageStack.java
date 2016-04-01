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
public class TriageStack extends AbstractStack{
    @Override
    public Patient pop(){
        return Patient.newPatient();
    }
    @Override
    public void push(Patient add){
         ListElement newElement= new ListElement(add);
         newElement.setNext(newElement);
    }
}
