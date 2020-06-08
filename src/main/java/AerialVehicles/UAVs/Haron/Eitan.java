package AerialVehicles.UAVs.Haron;

import AerialVehicles.Interfaces.AerialAttackVehicle;
import AerialVehicles.Interfaces.AerialIntelligenceVehicle;
import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Eitan extends HaronJet implements AerialIntelligenceVehicle, AerialAttackVehicle {
    private int rocketsAmount;
    private String rocketType;
    private String sensorType;

    public Eitan(int rocketsAmount, String rocketType, String sensorType, String pilotName, Mission mission, int hoursSinceLastRepair, boolean readyToFly) {
        super(pilotName, mission, hoursSinceLastRepair, readyToFly);
        this.rocketsAmount = rocketsAmount;
        this.rocketType = rocketType;
        this.sensorType = sensorType;
    }

    @Override
    public String attack() {

        return super.getPilotName() + ": Eitan Attacking " + ((AttackMission) super.getMission()).getTarget() + " with: " + this.rocketType + "X" + this.rocketsAmount;
    }

    @Override
    public String collectIntelligence() {
        return super.getPilotName() + ": Eitan Collecting Data in " + ((IntelligenceMission) super.getMission()).getRegion() + " with sensor type: " + this.sensorType;
    }
}
