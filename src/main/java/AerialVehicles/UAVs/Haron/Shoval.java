package AerialVehicles.UAVs.Haron;

import AerialVehicles.Interfaces.AerialAttackVehicle;
import AerialVehicles.Interfaces.AerialBdaVehicle;
import AerialVehicles.Interfaces.AerialIntelligenceVehicle;
import Missions.*;

public class Shoval extends HaronJet implements AerialIntelligenceVehicle, AerialBdaVehicle, AerialAttackVehicle {
    private String sensorType;
    private String cameraType;
    private int rocketsAmount;
    private String rocketType;

    public Shoval(String cameraType, int rocketsAmount,String rocketType, String sensorType, String pilotName, Mission mission, int hoursSinceLastRepair, boolean readyToFly) {
        super(pilotName, mission, hoursSinceLastRepair, readyToFly);
        this.sensorType = sensorType;
        this.cameraType = cameraType;
        this.rocketsAmount = rocketsAmount;
        this.rocketType = rocketType;
    }

    @Override
    public String attack() {

        return super.getPilotName() + ": Shoval Attacking " + ((AttackMission) super.getMission()).getTarget() + " with: " + this.rocketType + "X" + this.rocketsAmount;
    }

    @Override
    public String collectIntelligence() {
        return super.getPilotName() + ": Shoval Collecting Data in " + ((IntelligenceMission) super.getMission()).getRegion() + " with sensor type: " + this.sensorType;
    }

    @Override
    public String preformBda() {

        return super.getPilotName() + ": Shoval taking pictures of " + ((BdaMission) super.getMission()).getObjective() + " with: " + this.cameraType + " camera";
    }
}

