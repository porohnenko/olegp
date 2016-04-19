package model.entity;

import model.entity.abs.Product;

/**
 *
 * @author olegp
 */
public class Orange extends Product {

    private int vitaminC;
    private double diameter;

    public Orange(double price, int vitaminC, double diameter) {
        super(price);
        this.vitaminC = vitaminC;
        this.diameter = diameter;
    }

    public int getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(int vitaminC) {
        this.vitaminC = vitaminC;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Orange {" + super.toString() + ", vitamimC = " + vitaminC + ", diameter = " + diameter;
    }
}
