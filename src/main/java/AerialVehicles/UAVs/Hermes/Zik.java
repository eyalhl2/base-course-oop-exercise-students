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
    public String collectIntelligence() {
        return super.getPilotName() + ": Zik Collecting Data in " + ((IntelligenceMission) super.getMission()).getRegion() + " with sensor type: " + this.sensorType;
    }

    @Override
    public String preformBda() {

        return super.getPilotName() + ": Zik taking pictures of " + ((BdaMission) super.getMission()).getObjective() + " with: " + this.cameraType + " camera";
    }
}
