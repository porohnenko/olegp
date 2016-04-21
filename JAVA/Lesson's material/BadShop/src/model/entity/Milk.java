/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

/**
 *
 * @author user
 */
public class Milk  {
    private double price;
    private double fat;
    private double volume;

    public Milk(double price, double fat, double volume) {
        this.price = price;
        this.fat = fat;
        this.volume = volume;
    }
        
    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double price() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Milk{" + "price=" + price + ", fat=" + fat + ", volume=" + volume + '}';
    }   
}
