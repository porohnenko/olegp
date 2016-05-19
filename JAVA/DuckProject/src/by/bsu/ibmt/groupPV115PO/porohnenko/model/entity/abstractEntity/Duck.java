/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 19, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abstractEntity;

public abstract class Duck {

    private Flyable flyable;
    private Quackable quackable;

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }

    public void quack() {
        quackable.quack();
    }

    public void swim() {
        System.out.println("I'm swimming...");
    }
    public abstract void display();
}
