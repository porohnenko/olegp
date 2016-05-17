
package model.entity.flyableAlg;

import model.entity.abstractEntity.Flyable;

public class FlyWithRocket implements Flyable {

    @Override
    public void fly() {
        System.out.println("Yeaaaaaaaaa, I'm flying!!!");
    }
    
}
