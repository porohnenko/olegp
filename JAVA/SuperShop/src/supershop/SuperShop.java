package supershop;

import model.entity.Basket;
import model.entity.Bread;
import model.entity.Milk;
import model.entity.Orange;
import model.entity.Ponchik;
import model.logic.ShopAssistance;

/**
 *
 * @author olegp
 */
public class SuperShop {

    public static void main(String[] args) {
        Milk m = new Milk(10000, 3.5, 1);
        Bread b = new Bread(9000, "white", true);
        Orange o = new Orange(20000, 2000, 80);

        Ponchik p = new Ponchik(12000);

        Basket basket = new Basket();
        basket.add(b);
        basket.add(m);
        basket.add(m);
        basket.add(o);
        basket.add(o);
        basket.add(o);
        basket.add(p);

        double price =ShopAssistance.CalculateTotalPrice(basket);
        System.out.println(basket);
        System.out.println("Price: " + price);
    }

}
