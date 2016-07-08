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
    private SortBehavior sortable;

    public void setSortable(SortBehavior sortable) {
        this.sortable = sortable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }

    public void quack() {
        quackable.quack();
    }

    public void fly() {
        flyable.fly();
    }

    public void sort() {
        sortable.sort();
    }

    public void swim() {
        System.out.println("I'm swimming...");
    }

    public abstract void display();
}
