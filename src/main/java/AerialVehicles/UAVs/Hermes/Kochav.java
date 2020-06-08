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
    public String getTarget() {
        return ((AttackMission) super.getMission()).getTarget();
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
        return ((IntelligenceMission) super.getMission()).getRegion();
    }

    @Override
    public String getObjective() {
        return ((BdaMission) super.getMission()).getObjective();
    }

    @Override
    public String getCameraType() {
        return this.cameraType;
    }

    @Override
    public String getVehicleName() {
        return "Kochav";
    }
}
