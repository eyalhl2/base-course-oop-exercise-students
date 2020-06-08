package Missions;

import Entities.Coordinates;

public class BdaMission extends Mission{
    private String objective;

    public BdaMission(String objective, Coordinates cords) {
        super(cords);
        this.objective = objective;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
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
