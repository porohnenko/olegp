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

public class FlyWithRocket implements Flyable {

    @Override
    public void fly() {
        System.out.println("Yeeeeeeeeeaaaaaaaaa, I'm flying!!!");
    }
}
