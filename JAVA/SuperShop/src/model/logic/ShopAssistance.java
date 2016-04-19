package model.logic;

import model.entity.Basket;
import model.entity.abs.Product;

/**
 *
 * @author olegp
 */
public class ShopAssistance {

    public static double CalculateTotalPrice(Basket basket) {
        double sum = 0;

        for (Product p : basket.list) {
            sum += p.getPrice();
        }
        return sum;
    }
}
