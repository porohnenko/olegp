/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jun 18, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.comparator;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.units.Aircraft;
import java.util.Comparator;

public class CompareByLoadingCapacity implements Comparator<Aircraft> {

    @Override
    public int compare(Aircraft o1, Aircraft o2) {
        return o1.getLoadingCapacity() - o2.getLoadingCapacity();
    }

    @Override
    public String toString() {
        return "sorted by loading capasity";
    }
}
