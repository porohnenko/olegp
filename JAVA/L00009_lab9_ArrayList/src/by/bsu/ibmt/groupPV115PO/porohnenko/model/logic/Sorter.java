/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jun 18, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.logic;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.AircraftHangar;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abs.Aircraft;
import java.util.Collections;
import java.util.Comparator;

public class Sorter {

    public static void sort(AircraftHangar hangar, Comparator<Aircraft> comparator) {
        Collections.sort(hangar.getHangar(), comparator);
    }
}
