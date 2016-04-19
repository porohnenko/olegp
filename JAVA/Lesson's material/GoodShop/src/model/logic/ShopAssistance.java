
package model.logic;

import model.entity.Basket;
import model.entity.Bread;
import model.entity.Milk;
import model.entity.Orange;
import model.entity.abs.Product;
//import model.entity.Ponchik;


public class ShopAssistance {
    public static double calculateTotalPrice(Basket basket){
        double sum = 0;
        
        for(Product p: basket.list) {
            sum += p.getPrice();
        }     
       
        return sum;
    }
}
