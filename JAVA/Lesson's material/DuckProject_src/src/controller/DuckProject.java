package controller;

import model.entity.DuffyDuck;
import model.entity.MallardDuck;
import model.entity.YellowDuck;
import model.entity.abstractEntity.Duck;
import model.entity.flyableAlg.FlyWithRocket;
import model.entity.flyableAlg.FlyWithWings;
import model.entity.quackAlg.Pisk;

public class DuckProject {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.quack();
        mallard.swim();
        mallard.fly();
        
        
        //...
        mallard.setQuackable(new Pisk());
        mallard.quack();
        
        Duck duffy = new DuffyDuck();
        duffy.quack();
        duffy.swim();
        duffy.fly();
        
        //...
        
        duffy.setFlyable(new FlyWithRocket());
        duffy.fly();
        
        duffy.setFlyable(new FlyWithWings());
        duffy.fly();
        

    }
}
