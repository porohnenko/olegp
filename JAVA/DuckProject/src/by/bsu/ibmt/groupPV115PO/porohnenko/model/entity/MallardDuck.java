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
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.flyableEntity.SortByRange;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.quackAlg.QuackNaturally;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.quackAlg.Sort1;

public class MallardDuck extends Duck implements Flyable {

    public MallardDuck() {
        setFlyable(new FlyNoWay());
        setQuackable(new QuackNaturally());
        setSortable(new Sort1());
    }

    @Override
    public void display() {
        System.out.println("I'm mallrdduck!!!");
    }

    @Override
    public void fly() {
        System.out.println("Eeeeeeeee, I'm flying...");
    }

    @Override
    public void sort() {
        super.sort(); //To change body of generated methods, choose Tools | Templates.
    }

    

   
    
    
}
