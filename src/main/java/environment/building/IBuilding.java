package environment.building;
import environment.floor.Floor;
import environment.floor.IFloor;

import java.util.List;

public interface IBuilding {
    void addFloor(IFloor floor);
    List<Floor> getFloors();
    String getAddress();
}
