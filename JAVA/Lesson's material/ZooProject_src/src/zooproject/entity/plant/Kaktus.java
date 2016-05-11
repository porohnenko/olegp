/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zooproject.entity.plant;

import zooproject.abstraction.Plant;

/**
 *
 * @author user
 */
public class Kaktus extends Plant {

    @Override
    public void eat() {
        System.out.println("kaktus is eating...");;
    }
    
}
