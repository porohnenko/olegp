/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 19, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.flyableEntity;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abstractEntity.Flyable;

public class FlyNoWay implements Flyable {

    @Override
    public void fly() {
        System.out.println("I'm not flying...");
    }
}
