package AerialVehicles.UAVs.Hermes;

import AerialVehicles.Interfaces.AerialBdaVehicle;
import AerialVehicles.Interfaces.AerialIntelligenceVehicle;
import Missions.BdaMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Zik extends HermesJet implements AerialBdaVehicle, AerialIntelligenceVehicle {
    String sensorType;
    String cameraType;

    public Zik(String cameraType, String sensorType, String pilotName, Mission mission, int hoursSinceLastRepair, boolean readyToFly) {
        super(pilotName, mission, hoursSinceLastRepair, readyToFly);
        this.sensorType = sensorType;
        this.cameraType = cameraType;
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
        return "Zik";
    }
}
