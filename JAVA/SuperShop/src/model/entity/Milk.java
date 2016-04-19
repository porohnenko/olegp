package model.entity;

import model.entity.abs.Product;

/**
 *
 * @author olegp
 */
public class Milk extends Product {

    private double fat;
    private double volume;

    public Milk(double price, double fat, double volume) {
        super(price);
        this.fat = fat;
        this.volume = volume;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Milk {" + super.toString() + ", fat = " + fat + ", volume = " + volume + "}";
    }

}
