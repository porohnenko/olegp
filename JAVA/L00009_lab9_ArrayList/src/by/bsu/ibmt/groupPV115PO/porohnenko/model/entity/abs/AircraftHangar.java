/**
 * Lab work №8 Basics OOP, principles GRASP, SOLID. Pattern MVS
 * Theme: class AircraftHangar
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 16, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abs;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.Aircraft;
import java.util.ArrayList;
import java.util.List;

public class AircraftHangar {

    private List<Aircraft> hangar = new ArrayList<Aircraft>();

    public void add(Aircraft aircraft) {
        hangar.add(aircraft);
    }

    public List<Aircraft> getHangar() {
        return hangar;
    }

    public String getAircraft(int index) {
        return hangar.get(index).getModel();
    }

    public int getRange(int index) {
        return hangar.get(index).getFlyingRange();
    }
}
