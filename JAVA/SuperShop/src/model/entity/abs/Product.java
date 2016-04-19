package model.entity.abs;

/**
 *
 * @author olegp
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
        return "Product {" + "price = " + price + '}';
    }

}
