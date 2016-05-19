/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 19, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.entity;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abstractEntity.Duck;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abstractEntity.Flyable;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.flyableEntity.FlyNoWay;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.quackAlg.QuackNaturally;

public class MallardDuck extends Duck implements Flyable {

    public MallardDuck() {
        setFlyable(new FlyNoWay());
        setQuackable(new QuackNaturally());
    }

    @Override
    public void display() {
        System.out.println("I'm mallrdduck!!!");
    }

    @Override
    public void fly() {
        System.out.println("Eeeeeeeee, I'm flying...");
    }
}
