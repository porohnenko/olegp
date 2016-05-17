
package model.entity.flyableAlg;

import model.entity.abstractEntity.Flyable;


public class FlyNoWay implements Flyable {

    @Override
    public void fly() {
        System.out.println("I'm not flying...");
    }
    
}
