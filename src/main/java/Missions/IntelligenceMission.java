package Missions;

import Entities.Coordinates;

public class IntelligenceMission extends Mission{
    private String region;

    public IntelligenceMission(String objective, Coordinates cords) {
        super(cords);
        this.region = objective;
    }


    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public void begin() {

    }

    @Override
    public void cancel() {

    }

    @Override
    public void finish() {

    }
}
