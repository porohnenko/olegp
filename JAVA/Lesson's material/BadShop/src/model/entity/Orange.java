/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

/**
 *
 * @author user
 */
public class Orange {
    private double price;
    private int vitamimC;
    private double diametr;

    public Orange(double price, int vitamimC, double diametr) {
        this.price = price;
        this.vitamimC = vitamimC;
        this.diametr = diametr;
    }
   
    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVitamimC() {
        return vitamimC;
    }

    public void setVitamimC(int vitamimC) {
        this.vitamimC = vitamimC;
    }

    @Override
    public String toString() {
        return "Orange{" + "price=" + price + ", vitamimC=" + vitamimC + ", diametr=" + diametr + '}';
    }
    
    
}
