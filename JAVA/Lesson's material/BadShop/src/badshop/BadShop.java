/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package badshop;

import model.entity.Basket;
import model.entity.Bread;
import model.entity.Milk;
import model.entity.Orange;
import model.entity.Ponchik;
import model.logic.ShopAssistance;

/**
 *
 * @author user
 */
public class BadShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Milk m = new Milk(17000, 8.5, 1);
        Bread b = new Bread(13800, "white", true);
        Orange o = new Orange(18000, 2000, 20);
        
        Ponchik p = new Ponchik(2000);
        
        Basket basket = new Basket();
        
        basket.add(b);
        basket.add(p);
        
        basket.add(m);
        basket.add(m);
        basket.add(o);
        basket.add(o);
               
        double price = ShopAssistance.calculateTotalPrice(basket);
        System.out.println(basket);
        System.out.println("Total price: " + price);
        
    }
}
