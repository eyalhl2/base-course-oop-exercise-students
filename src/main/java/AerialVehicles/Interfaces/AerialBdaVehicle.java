package AerialVehicles.Interfaces;

import Missions.BdaMission;

public interface AerialBdaVehicle {
    default String preformBda() {
        return getPilotName() + ": " + getVehicleName() + " taking pictures of " + getObjective() + " with: " + getCameraType() + " camera";
    }

    String getPilotName();

    String getObjective();

    String getCameraType();

    String getVehicleName();
}
