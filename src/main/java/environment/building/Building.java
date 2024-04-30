package environment.building;
import environment.floor.Floor;
import environment.floor.IFloor;

import java.util.ArrayList;
import java.util.List;

public class Building implements IBuilding{
    private String address;
    private List<Floor> floors;

    public Building(String address) {
        this.address = address;
        this.floors = new ArrayList<>();
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    @Override
    public void addFloor(IFloor floor) {

    }

    public List<Floor> getFloors() {
        return floors;
    }

    public String getAddress() {
        return address;
    }
}

