/**
 * Lab work №8 Basics OOP, principles GRASP, SOLID. Pattern MVS
 * Theme: class PassengerAircraft
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 15, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.entity;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abs.Aircraft;

public class PassengerAircraft extends Aircraft {

    private boolean businessClass;

    public PassengerAircraft(
            boolean businessClass,
            String model,
            String boardNumber,
            int flyingRange,
            int maxTakeoffWeight,
            int age,
            int numberOfEngines,
            int passengerCapacity,
            int loadingCapacity) {
        super(model, boardNumber, flyingRange, maxTakeoffWeight, age, numberOfEngines, passengerCapacity, loadingCapacity);
        this.businessClass = businessClass;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    @Override
    public String toString() {
        return super.toString() + " | Business class: " + businessClass
                + "\n------------------------------------------------------------"
                + "-----------------------------------------------------------------"
                + "-----------------------------------------------------------------\n";
    }
}
