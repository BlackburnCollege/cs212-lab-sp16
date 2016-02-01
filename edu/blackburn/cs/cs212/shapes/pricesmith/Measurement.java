package edu.blackburn.cs.cs212.shapes.pricesmith;

/**
 * this is a test
 * @author olivia.price
 */
public class Measurement {
    private int length;
    private int width;
    
    public Measurement(int length, int width){
        this.length = length;
        this.width = width;
    }
    public int getArea(){
        return (this.length * this.width);
    }
    public int getPerimeter(){
        return ((this.length * 2) + (this.width * 2));
    }
    
}
