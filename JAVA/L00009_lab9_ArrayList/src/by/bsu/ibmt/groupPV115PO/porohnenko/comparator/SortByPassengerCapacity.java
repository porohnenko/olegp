/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jun 18, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.comparator;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.Aircraft;

public class SortByPassengerCapacity extends Sorting {

    @Override
    public int compare(Aircraft o1, Aircraft o2) {
        return o1.getPassengerCapacity() - o2.getPassengerCapacity();
    }

    @Override
    public String toString() {
        return "sorted by passenger capacity";
    }
}
