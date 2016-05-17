package model.entity;

import model.entity.abstractEntity.Duck;
import model.entity.flyableAlg.FlyNoWay;
import model.entity.quackAlg.QuackNaturally;

public class DuffyDuck extends Duck {

    public DuffyDuck() {
        setFlyable(new FlyNoWay());
        setQuackable(new QuackNaturally());
    }
    
    
    @Override
    public void display() {
        System.out.println("I'm Duffy Duck!!!");
    }
}
