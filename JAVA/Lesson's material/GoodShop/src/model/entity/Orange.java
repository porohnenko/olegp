/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import model.entity.abs.Product;

/**
 *
 * @author user
 */
public class Orange extends Product {
    private int vitamimC;
    private double diametr;

    public Orange(double price, int vitamimC, double diametr) {
        super(price);
        this.vitamimC = vitamimC;
        this.diametr = diametr;
    }
   
    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public int getVitamimC() {
        return vitamimC;
    }

    public void setVitamimC(int vitamimC) {
        this.vitamimC = vitamimC;
    }

    @Override
    public String toString() {
        return "Orange{" +super.toString()+ ", vitamimC=" + vitamimC + ", diametr=" + diametr + '}';
    }
    
    
}
