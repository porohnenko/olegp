/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

/**
 *
 * @author user
 */
public class Ponchik {
    private double price;

    public Ponchik() {
    }

    public Ponchik(double price) {
        this.price = price;
    }    
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ponchik{" + "price=" + price + '}';
    }
    
    
}
