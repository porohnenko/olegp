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
public class Bread extends Product {
    private String color;
    private boolean fresh;

    public Bread(double price, String color, boolean fresh) {
        super(price);
        this.color = color;
        this.fresh = fresh;
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

    @Override
    public String toString() {
        return "Bread{" + super.toString() + ", color=" + color + ", fresh=" + fresh + '}';
    }
    
    
}
