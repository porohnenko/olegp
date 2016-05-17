package model.entity;

import model.entity.abstractEntity.Duck;
import model.entity.abstractEntity.Flyable;
import model.entity.flyableAlg.FlyNoWay;
import model.entity.quackAlg.QuackNaturally;

public class MallardDuck extends Duck implements Flyable {

    public MallardDuck() {
        setFlyable(new FlyNoWay());
        setQuackable(new QuackNaturally());
    }    
    
    @Override
    public void display() {
        System.out.println("I'm mallard duck!!!");
    }

    @Override
    public void fly() {
        System.out.println("Eeeeeeeeeeeeee, I'm flying...");
    }
}
