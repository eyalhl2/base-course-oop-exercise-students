package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialVehicle;
import Missions.Mission;

public abstract class HaronJet extends AerialVehicle {
    private final static int HARON_JETS_HOURS_BEFORE_REPAIR = 150;
    public HaronJet(String pilotName, Mission mission, int hoursSinceLastRepair, boolean readyToFly) {
        super(pilotName, mission, hoursSinceLastRepair, readyToFly, HARON_JETS_HOURS_BEFORE_REPAIR);
    }
}
