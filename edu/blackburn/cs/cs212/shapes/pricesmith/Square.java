package edu.blackburn.cs.cs212.shapes.pricesmith;

/**
 *
 * @author olivia.price
 */
public class Square extends Rectangle{
   private int side;
    
    public Square(int length, int width){
        super(length, width);
        System.out.println("New Square: " + length 
                + " by " + width);
    }
    
}
