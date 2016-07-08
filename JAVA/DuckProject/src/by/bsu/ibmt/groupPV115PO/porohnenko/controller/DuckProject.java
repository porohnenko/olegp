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
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.flyableEntity.FlyNoWay;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.flyableEntity.FlyWithRocket;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.flyableEntity.FlyWithWings;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.flyableEntity.SortByRange;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.quackAlg.Pisk;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.quackAlg.Sort1;
import java.util.logging.Logger;

public class DuckProject {

    private static Logger LOG = null;

    public static void main(String[] args) {

        //LOG = Logger.getLogger(DuckProject.class);
        Duck mallard = new MallardDuck();
        mallard.quack();
        mallard.swim();
        mallard.fly();
        mallard.sort();

        mallard.setQuackable(new Pisk());
        mallard.quack();

        mallard.setSortable(new SortByRange());
        mallard.sort();

        DuffyDuck duffy = new DuffyDuck();
        duffy.quack();
        duffy.swim();
        duffy.fly();

        duffy.setFlyable(new FlyWithRocket());
        duffy.fly();

        duffy.setFlyable(new FlyWithWings());
        duffy.fly();

        duffy.setFlyable(new FlyNoWay());
        duffy.fly();
    }
}
