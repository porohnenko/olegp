/**
 * Lab work №8 Basics OOP, principles GRASP, SOLID. Pattern MVS
 * Theme: class FleetSortingByRangeASC
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 18, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.comparator;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.Aircraft;

public class SortByRange extends Sorting {

    @Override
    public int compare(Aircraft o1, Aircraft o2) {
        return o1.getFlyingRange() - o2.getFlyingRange();
    }

    @Override
    public String toString() {
        return "sorted by flying range";
    }
}
