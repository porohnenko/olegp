/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jul 6, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.entity;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abstractEntity.AircraftHangar;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.sortableEntity.NoSorting;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abstractEntity.SortBehavior;

public class FirstHangar extends AircraftHangar implements SortBehavior {

    public FirstHangar() {
        setSortable(new NoSorting());
    }

}
