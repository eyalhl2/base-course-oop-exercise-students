package AerialVehicles.Interfaces;


public interface AerialAttackVehicle {

    default String attack() {
        return getPilotName() + ": " + getVehicleName() + " Attacking " + getTarget() + " with: " + getRocketType() + "X" + getRocketsAmount();
    }

    String getPilotName();

    String getTarget();

    String getRocketType();

    int getRocketsAmount();

    String getVehicleName();
}
