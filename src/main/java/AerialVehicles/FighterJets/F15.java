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
    public String getTarget() {
        return ((AttackMission)super.getMission()).getTarget();
    }

    @Override
    public String getRocketType() {
        return this.rocketType;
    }

    @Override
    public int getRocketsAmount() {
        return this.rocketsAmount;
    }

    @Override
    public String getSensorType() {
        return this.sensorType;
    }

    @Override
    public String getRegion() {
        return ((IntelligenceMission)super.getMission()).getRegion();
    }

    @Override
    public String getVehicleName() {
        return "F15";
    }
}
