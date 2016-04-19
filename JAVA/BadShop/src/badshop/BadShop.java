/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package badshop;

import model.entity.Basket;
import model.entity.Bread;
import model.entity.Milk;
import model.entity.Orange;
import model.entity.Ponchik;
import model.logic.shopAssistance;

/**
 *
 * @author olegp
 */

public class BadShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Milk m = new Milk(10000, 3.5, 1);
        Bread b = new Bread(9000, "white", true);
        Orange o = new Orange(0, 0, 0);

        Ponchik p = new Ponchik(12000);

        Basket basket = new Basket();
        basket.add(b);
        basket.add(m);
        basket.add(m);
        basket.add(o);
        basket.add(o);
        basket.add(p);

        double price = shopAssistance.calcTotalPrice(basket);
        System.out.println(basket);
        System.out.println("Price: " + price);
    }

}
