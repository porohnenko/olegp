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
import by.bsu.ibmt.groupPV115PO.porohnenko.model.logic.Sorter;
import java.util.Collections;
import java.util.Comparator;

public class Sorting1 implements Sortable {

    public Sorting1(AircraftHangar hangar, Comparator<Aircraft> comparator) {
        Collections.sort(hangar.getHangar(), this);
    }

    
    @Override
    public int compare(Aircraft o1, Aircraft o2) {
        return 0;
    }
}
