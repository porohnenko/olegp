/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jul 3, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abs;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.Aircraft;
import java.util.Comparator;

public interface Sortable extends Comparator<Aircraft> {

    public void sort();
}
