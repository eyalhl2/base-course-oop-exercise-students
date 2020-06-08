package AerialVehicles.Interfaces;

import Missions.IntelligenceMission;

public interface AerialIntelligenceVehicle extends AerialVehicleService {
    default String collectIntelligence() {
        return getPilotName() + ": " + getVehicleName() + " Collecting Data in " + getRegion() + " with sensor type: " + getSensorType();
    }

    String getSensorType();

    String getRegion();

}
