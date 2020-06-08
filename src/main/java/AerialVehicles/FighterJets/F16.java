package AerialVehicles.FighterJets;

import AerialVehicles.Interfaces.AerialAttackVehicle;
import AerialVehicles.Interfaces.AerialBdaVehicle;
import Missions.AttackMission;
import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F16 extends FighterJet implements AerialAttackVehicle, AerialBdaVehicle {
    int rocketsAmount;
    String rocketType;
    String cameraType;

    public F16(String cameraType, int rocketsAmount, String rocketType, String pilotName, Mission mission, int hoursSinceLastRepair, boolean readyToFly) {
        super(pilotName, mission, hoursSinceLastRepair, readyToFly);
        this.rocketsAmount = rocketsAmount;
        this.rocketType = rocketType;
        this.cameraType = cameraType;
    }

    @Override
    public String attack() {

        return super.getPilotName() + ": F16 Attacking " + ((AttackMission) super.getMission()).getTarget() + " with: " + this.rocketType + "X" + this.rocketsAmount;
    }

    @Override
    public String preformBda() {

        return super.getPilotName() + ": F16 taking pictures of " + ((BdaMission) super.getMission()).getObjective() + " with: " + this.cameraType + " camera";
    }
}
