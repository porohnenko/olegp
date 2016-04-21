package model.entity;

import model.entity.abs.Product;

/**
 *
 * @author olegp
 */
public class Ponchik extends Product {

    public Ponchik(double price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Ponchik {" + super.toString() + "}";
    }
}
