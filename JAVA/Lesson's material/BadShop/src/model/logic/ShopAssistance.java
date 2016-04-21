
package model.logic;

import model.entity.Basket;
import model.entity.Bread;
import model.entity.Milk;
import model.entity.Orange;
import model.entity.Ponchik;


public class ShopAssistance {
    public static double calculateTotalPrice(Basket basket){
        double sum = 0;
        
        for(Milk m : basket.listM) {
            sum += m.price();
        }
        
        for(Orange o: basket.listO) {
            sum += o.getPrice();
        }
        
        for(Bread b : basket.listB) {
            sum += b.getPrice();
        }      
        
        for(Ponchik p : basket.listP) {
            sum += p.getPrice();
        }
        
        return sum;
    }
}
