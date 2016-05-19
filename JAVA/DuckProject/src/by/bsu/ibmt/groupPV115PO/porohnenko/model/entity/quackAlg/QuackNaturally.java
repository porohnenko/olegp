/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 19, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.quackAlg;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abstractEntity.Quackable;

public class QuackNaturally implements Quackable {

    @Override
    public void quack() {
        System.out.println("Krya-krya...");
    }
}
