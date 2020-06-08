package AerialVehicles.FighterJets;

import AerialVehicles.Interfaces.AerialAttackVehicle;
import AerialVehicles.Interfaces.AerialBdaVehicle;
import Missions.AttackMission;
import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F16 extends FighterJet implements AerialAttackVehicle, AerialBdaVehicle {
    int rocketsAmount;
    String rocketType;
    String cameraType;

    public F16(String cameraType, int rocketsAmount, String rocketType, String pilotName, Mission mission, int hoursSinceLastRepair, boolean readyToFly) {
        super(pilotName, mission, hoursSinceLastRepair, readyToFly);
        this.rocketsAmount = rocketsAmount;
        this.rocketType = rocketType;
        this.cameraType = cameraType;
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
    public String getObjective() {
        return ((BdaMission)super.getMission()).getObjective();
    }

    @Override
    public String getCameraType() {
        return this.cameraType;
    }

    @Override
    public String getVehicleName() {
        return "F16";
    }
}
