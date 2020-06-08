package AerialVehicles;

import Entities.Coordinates;
import Missions.Mission;
import Missions.MissionTypeException;


public abstract class AerialVehicle {
    private String pilotName;
    private Mission mission;
    private int hoursSinceLastRepair;
    private boolean readyToFly;
    private int maxHoursBeforeRepair;

    public AerialVehicle(String pilotName, Mission mission, int hoursSinceLastRepair, boolean readyToFly, int maxHoursBeforeRepair) {
        this.pilotName = pilotName;
        this.mission = mission;
        this.hoursSinceLastRepair = hoursSinceLastRepair;
        this.readyToFly = readyToFly;
        this.maxHoursBeforeRepair = maxHoursBeforeRepair;
    }

    public void flyTo() {
        System.out.println("Flying to: " + this.mission.getCords().getLatitude() + ", " + this.mission.getCords().getLongitude());
    }

    public void land() {
        System.out.println("Landing");
    }

    public void check(){
        if (this.hoursSinceLastRepair > this.maxHoursBeforeRepair)
            this.repair();
    }

    public void repair(){
        this.readyToFly = true;
        this.hoursSinceLastRepair = 0;
    }

    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public Mission getMission() {
        return mission;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public int getHoursOfFlightSinceLastRepair() {
        return hoursSinceLastRepair;
    }

    public void setHoursOfFlightSinceLastRepair(int hoursSinceLastRepair) {
        this.hoursSinceLastRepair = hoursSinceLastRepair;
    }

    public boolean isReadyToFly() {
        return readyToFly;
    }

    public void setReadyToFly(boolean readyToFly) {
        this.readyToFly = readyToFly;
    }

    public int getMaxHoursBeforeRepair() {
        return maxHoursBeforeRepair;
    }

    public void setMaxHoursBeforeRepair(int maxHoursBeforeRepair) {
        this.maxHoursBeforeRepair = maxHoursBeforeRepair;
    }
}
