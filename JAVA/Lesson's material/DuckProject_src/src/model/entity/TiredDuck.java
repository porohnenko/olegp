package model.entity;

import model.entity.abstractEntity.Duck;
import model.entity.abstractEntity.Flyable;

public class TiredDuck extends Duck implements Flyable {

    @Override
    public void fly() {
        System.out.println("Eeeeeeeeeeeeee, I'm flying...");
    }

    @Override
    public void display() {
        System.out.println("I'm tired duck!!!");
    }
}
