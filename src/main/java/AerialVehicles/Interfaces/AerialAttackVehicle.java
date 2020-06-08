package AerialVehicles.Interfaces;


public interface AerialAttackVehicle extends AerialVehicleService {

    default String attack() {
        return getPilotName() + ": " + getVehicleName() + " Attacking " + getTarget() + " with: " + getRocketType() + "X" + getRocketsAmount();
    }

    String getTarget();

    String getRocketType();

    int getRocketsAmount();

}
