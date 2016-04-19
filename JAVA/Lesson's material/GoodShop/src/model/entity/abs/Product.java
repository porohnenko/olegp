/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity.abs;

/**
 *
 * @author user
 */
public class Product {
    private double price;

    public Product(double price) {
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
        return "price=" + price;
    }
    
    
}
