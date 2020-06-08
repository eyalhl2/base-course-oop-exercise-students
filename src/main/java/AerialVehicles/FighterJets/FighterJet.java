package AerialVehicles.FighterJets;

import AerialVehicles.AerialVehicle;
import Missions.Mission;

public abstract class FighterJet extends AerialVehicle {
    private final static int FIGHTER_JETS_HOURS_BEFORE_REPAIR = 250;
    public FighterJet(String pilotName, Mission mission, int hoursSinceLastRepair, boolean readyToFly) {
        super(pilotName, mission, hoursSinceLastRepair, readyToFly, FIGHTER_JETS_HOURS_BEFORE_REPAIR);
    }
}
