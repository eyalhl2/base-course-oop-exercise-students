package Missions;

import Entities.Coordinates;

public class AttackMission extends Mission{
    private String target;

    public AttackMission(String target, Coordinates cords) {
        super(cords);
        this.target = target;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
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
