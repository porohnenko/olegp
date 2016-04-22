/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancetestproject.Shapes;


public class Scuare extends Shape{
    
    public Scuare(double a) {
        super(a);
    }
    
    public double getS(){
        return getA() * getA();
    }
    
    public double getP(){
        return getA() * 4;
    }    
    
    public void draw(){
        System.out.println("Scuare...");
    }
}
