/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancetestproject.Shapes;

/**
 *
 * @author user
 */
public abstract class Shape {
    private double a;

    public Shape(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    
    public abstract double getS();
    
    public abstract double getP();   
    
    public abstract void draw();
}
