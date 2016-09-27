/**
 * Lab work №8 Basics OOP, principles GRASP, SOLID. Pattern MVS
 * Theme: class TransportAircraft
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 15, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.units;

public class TransportAircraft extends Aircraft {

    private boolean transportEquipment;

    public TransportAircraft(
            boolean transportEquipment,
            String model,
            String boardNumber,
            int flyingRange,
            int maxTakeoffWeight,
            int age,
            int numberOfEngines,
            int passengerCapacity,
            int loadingCapacity) {
        super(model, boardNumber, flyingRange, maxTakeoffWeight, age,
                numberOfEngines, passengerCapacity, loadingCapacity);
        this.transportEquipment = transportEquipment;
    }

    public boolean isTransportEquipment() {
        return transportEquipment;
    }

    @Override
    public String toString() {
        return super.toString() + " |Existence of the transport equipment: " + transportEquipment
                + "\n------------------------------------------------------------"
                + "-----------------------------------------------------------------"
                + "-----------------------------------------------------------------\n";
    }
}
