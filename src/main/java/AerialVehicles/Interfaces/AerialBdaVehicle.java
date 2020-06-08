package AerialVehicles.Interfaces;

import Missions.BdaMission;

public interface AerialBdaVehicle extends AerialVehicleService {
    default String preformBda() {
        return getPilotName() + ": " + getVehicleName() + " taking pictures of " + getObjective() + " with: " + getCameraType() + " camera";
    }

    String getObjective();

    String getCameraType();


}
