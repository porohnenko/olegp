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
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abs.AircraftHangar;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abs.Sortable;
import java.util.Collections;

public class Sorting1 implements Sortable {

    private AircraftHangar hangar;
    public String title;

    @Override
    public int compare(Aircraft o1, Aircraft o2) {
        return 0;
    }

    @Override
    public void sort() {
    Collections.sort(hangar.getHangar(), this);
    }

    public String getTitle() {
        return title;
    }

}
