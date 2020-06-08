package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialVehicle;
import Missions.Mission;

public abstract class HermesJet extends AerialVehicle {
    private final static int HERMES_JETS_HOURS_BEFORE_REPAIR = 100;

    public HermesJet(String pilotName, Mission mission, int hoursSinceLastRepair, boolean readyToFly) {
        super(pilotName, mission, hoursSinceLastRepair, readyToFly, HERMES_JETS_HOURS_BEFORE_REPAIR);
    }
}
