/**
 * Lab work №8 Basics OOP, principles GRASP, SOLID. Pattern MVS
 * Theme: class FleetSortingByRangeASC
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 18, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.sortableEntity;

//import by.bsu.ibmt.groupPV115PO.porohnenko.controller.AustrianAirlines;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.comparator.CompareByRange;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abstractEntity.AircraftHangar;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abstractEntity.SortBehavior;
//import by.bsu.ibmt.groupPV115PO.porohnenko.model.logic.Sorter;
import java.util.Collections;

public class SortByRange implements SortBehavior {
       
    @Override
    public void sort(AircraftHangar hangar) {
        //Sorter.sort(hangar, new CompareByRange());
        Collections.sort(hangar.getHangar(), new CompareByRange());
        System.out.println("SortByRange");
    }
    
}
