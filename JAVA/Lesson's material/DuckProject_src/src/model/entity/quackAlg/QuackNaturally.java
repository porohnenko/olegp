
package model.entity.quackAlg;

import model.entity.abstractEntity.Quackable;

public class QuackNaturally implements Quackable {

    @Override
    public void quack() {
        System.out.println("krya-krya...");
    }
    
}
