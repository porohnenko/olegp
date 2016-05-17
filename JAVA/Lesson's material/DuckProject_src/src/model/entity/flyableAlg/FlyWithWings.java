package model.entity.flyableAlg;

import model.entity.abstractEntity.Flyable;

public class FlyWithWings implements Flyable {

    @Override
    public void fly() {
        System.out.println("I'm flying with wings...");
    }
    
}
