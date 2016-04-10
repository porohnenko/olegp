/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancetestproject.Shapes;

/**
 *
 * @author olegp
 */
public class Square {

    private double a;

    public Square() {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getS() {
        return a * a;
    }
 
    public abstract double getP();

    public abstract void draw();
}
