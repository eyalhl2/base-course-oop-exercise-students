package AerialVehicles.UAVs.Hermes;

import AerialVehicles.Interfaces.AerialAttackVehicle;
import AerialVehicles.Interfaces.AerialBdaVehicle;
import AerialVehicles.Interfaces.AerialIntelligenceVehicle;
import Missions.*;

public class Kochav extends HermesJet implements AerialAttackVehicle, AerialIntelligenceVehicle, AerialBdaVehicle {
    private int rocketsAmount;
    private String rocketType;
    private String sensorType;
    private String cameraType;

    public Kochav(int rocketsAmount,String rocketType, String cameraType, String sensorType, String pilotName, Mission mission, int hoursSinceLastRepair, boolean readyToFly) {
        super(pilotName, mission, hoursSinceLastRepair, readyToFly);
        this.rocketsAmount = rocketsAmount;
        this.rocketType = rocketType;
        this.sensorType = sensorType;
        this.cameraType = cameraType;
    }

    @Override
    public String attack() {

        return super.getPilotName() + ": Kochav Attacking " + ((AttackMission) super.getMission()).getTarget() + " with: " + this.rocketType + "X" + this.rocketsAmount;
    }

    @Override
    public String collectIntelligence() {
        return super.getPilotName() + ": Kochav Collecting Data in " + ((IntelligenceMission) super.getMission()).getRegion() + " with sensor type: " + this.sensorType;
    }

    @Override
    public String preformBda() {

        return super.getPilotName() + ": Kochav taking pictures of " + ((BdaMission) super.getMission()).getObjective() + " with: " + this.cameraType + " camera";
    }
}
