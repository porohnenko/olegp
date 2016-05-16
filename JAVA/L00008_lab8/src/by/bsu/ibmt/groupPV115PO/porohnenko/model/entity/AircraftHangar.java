/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 16, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.entity;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abs.Aircraft;
import java.util.ArrayList;
import java.util.List;

public class AircraftHangar {

    public List<Aircraft> list = new ArrayList<Aircraft>();

    public void add(Aircraft A) {
        list.add(A);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (Aircraft A : list) {
            str.append(A.toString()).append("\n");
        }
        return str.toString();
    }
}
