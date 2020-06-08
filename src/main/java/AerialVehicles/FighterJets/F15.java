package AerialVehicles.FighterJets;

import AerialVehicles.Interfaces.AerialAttackVehicle;
import AerialVehicles.Interfaces.AerialIntelligenceVehicle;
import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F15 extends FighterJet implements AerialAttackVehicle, AerialIntelligenceVehicle {
    int rocketsAmount;
    String rocketType;
    String sensorType;

    public F15(String sensorType, int rocketsAmount, String rocketType, String pilotName, Mission mission, int hoursSinceLastRepair, boolean readyToFly) {
        super(pilotName, mission, hoursSinceLastRepair, readyToFly);
        this.rocketsAmount = rocketsAmount;
        this.rocketType = rocketType;
        this.sensorType = sensorType;
    }

    @Override
    public String attack() {

        return super.getPilotName() + ": F15 Attacking " + ((AttackMission) super.getMission()).getTarget() + " with: " + this.rocketType + "X" + this.rocketsAmount;
    }

    @Override
    public String collectIntelligence() {
        return super.getPilotName() + ": F15 Collecting Data in " + ((IntelligenceMission) super.getMission()).getRegion() + " with sensor type: " + this.sensorType;
    }
}
