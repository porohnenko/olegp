/**
 * Lab work №8 Basics OOP, principles GRASP, SOLID. Pattern MVS
 * Theme: class FleetSortingByRangeASC
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 18, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.flyableEntity;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abstractEntity.SortBehavior;

public class SortByRange implements SortBehavior {

    @Override
    public void sort() {
        System.out.println("SortByRange...");
    }
}
