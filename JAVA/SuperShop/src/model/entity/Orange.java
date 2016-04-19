/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import model.entity.abs.Product;

/**
 *
 * @author olegp
 */
public class Orange extends Product {

    super(price);
    private int vitaminC;
    private double daimeter;

    public Orange(double price, int vitaminC, double daimeter) {
        
        this.vitaminC = vitaminC;
        this.daimeter = daimeter;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(int vitaminC) {
        this.vitaminC = vitaminC;
    }

    public double getDaimeter() {
        return daimeter;
    }

    public void setDaimeter(double daimeter) {
        this.daimeter = daimeter;
    }

}
