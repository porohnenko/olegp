/**
 * Lab work №
 * Theme: DuckProject
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 19, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.controller;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.DuffyDuck;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.MallardDuck;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abstractEntity.Duck;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.flyableEntity.FlyWithRocket;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.flyableEntity.FlyWithWings;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.quackAlg.Pisk;

public class DuckProject {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.quack();
        mallard.swim();
        mallard.fly();

        mallard.setQuackable(new Pisk());
        mallard.quack();

        DuffyDuck duffy = new DuffyDuck();
        duffy.quack();
        duffy.swim();
        duffy.fly();

        duffy.setFlyable(new FlyWithRocket());
        duffy.fly();

        duffy.setFlyable(new FlyWithWings());
        duffy.fly();
    }
}
