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
public class Bread extends Product{
    private double price;
    private String color;
    private boolean fresh;

    public Bread(double price, String color, boolean fresh) {
        this.price = price;
        this.color = color;
        this.fresh = fresh;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFresh() {
        return fresh;
    }

    public void setFresh(boolean fresh) {
        this.fresh = fresh;
    }

   
    
    
}
