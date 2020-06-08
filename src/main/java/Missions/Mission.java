package Missions;


import Entities.Coordinates;

public abstract class Mission{
    private Coordinates cords;

    public Coordinates getCords() {
        return cords;
    }

    public void setCords(Coordinates cords) {
        this.cords = cords;
    }

    public Mission(Coordinates cords) {
        this.cords = cords;
    }

    abstract void begin();
    abstract void cancel();
    abstract void finish();
}
