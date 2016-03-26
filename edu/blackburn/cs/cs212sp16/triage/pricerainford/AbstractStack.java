/*
 * Implement TriageStack
In the package edu.blackburn.cs.cs212sp16.er, there is our old friend ListElement and there are two
abstract classes: AbstractStack and AbstractQueue. Starting with TriageStack, you will need to implement
all of the abstract functions. It's just that easy! One note is that you will need to call the protected
decrement and increment methods whenever you remove or add a new patient (respectively). TriageStack
has a protected field to hold the topmost ListElement.

Once you have TriageStack implemented, use a loop and the debugger to add and remove patients to
TriageStack and monitor their aggregate health with the calling the depth(), health(), and priority()
methods. Calling the health() method on TriageStack will call the getHealth() method on each patient in
the stack and thus make them sicker. Slowly add more and more patients into the TriageStack object until
you are confident that it works correctly.o change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.T
 */
package edu.blackburn.cs.cs212sp16.triage.pricerainford;

import edu.blackburn.cs.cs212sp16.er.*;

/**
 *
 * @author water
 */
public abstract class AbstractStack {
    
    protected ListElement top;
    
    public AbstractStack() {
        super();
    }
    
    public final int depth() {
        return 0;
    }
    
    protected final void increment() {
        
    }
        
    protected final void decrement() {
        
    }
    
    /**
     * Should create a new ListElement, point that element's nextElement to the 
     * current top element of the stack and increment depth
     * @param add 
     */
    public abstract void push(Patient add);
    
    /**
     * Should return the content of the current top element of the stack and
     * decrement depth unless top == null, in which case return null and don't 
     * decrement.
     * @return 
     */
    public abstract Patient pop();
    
    public double health() {
        return 0.0;
    }
    
    public int priority() {
        return 0;
    }
    
}
