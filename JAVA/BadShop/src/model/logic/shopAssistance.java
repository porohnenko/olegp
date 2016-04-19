/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.logic;

import model.entity.Basket;
import model.entity.Bread;
import model.entity.Milk;
import model.entity.Orange;
import model.entity.Ponchik;

/**
 *
 * @author olegp
 */
public class shopAssistance {

    public static double calcTotalPrice(Basket basket) {
        double sum = 0;
        for (Milk m : basket.listM) {
            sum += m.getPrice();
        }
        for (Orange o : basket.listO) {
            sum += o.getPrice();
        }
        for (Bread b : basket.listB) {
            sum += b.getPrice();
        }
        for (Ponchik  p : basket.listP) {
            sum += p.getPrice();
        }
        return sum;
    }
}
