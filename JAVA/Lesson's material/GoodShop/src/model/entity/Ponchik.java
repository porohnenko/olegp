/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import model.entity.abs.Product;

/**
 *
 * @author user
 */
public class Ponchik extends Product{
    
    public Ponchik(double price) {
        super(price);
    }    
    
   

    @Override
    public String toString() {
        return "Ponchik{" + super.toString() + '}';
    }
    
    
}
