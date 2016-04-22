/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancetestproject.Shapes;

/**
 *
 * @author user
 */
public class Rectangle extends Shape  {
    private double b;
    
    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }
    
    public void draw(){
        System.out.println("Rectangle...");
    }
    
     public double getS(){
        return getA() * b;
    }
    
    public double getP(){
        return (getA() + b) * 2;
    }    
    
    public void superDraw(){
        System.out.println("superDraw fo rectangle...");
    }
    
}
