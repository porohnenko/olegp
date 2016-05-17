package model.entity;

import model.entity.abstractEntity.Duck;

public class YellowDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I'm mallard YELLOW duck!!!");
    }
}
