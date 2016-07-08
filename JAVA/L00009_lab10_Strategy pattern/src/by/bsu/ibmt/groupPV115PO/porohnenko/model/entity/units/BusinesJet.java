/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jun 19, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.units;

public class BusinesJet extends Aircraft {

    private boolean vipSalon;

    public BusinesJet(
            boolean vipSalon,
            String model,
            String boardNumber,
            int flyingRange,
            int maxTakeoffWeight,
            int age,
            int numberOfEngines,
            int passengerCapacity,
            int loadingCapacity) {
        super(model, boardNumber, flyingRange, maxTakeoffWeight, age, numberOfEngines, passengerCapacity, loadingCapacity);
        this.vipSalon = vipSalon;
    }

    public boolean isvipSalon() {
        return vipSalon;
    }

    @Override
    public String toString() {
        return super.toString() + " | VIP salon: " + vipSalon
                + "\n------------------------------------------------------------"
                + "-----------------------------------------------------------------"
                + "-----------------------------------------------------------------\n";
    }
}
