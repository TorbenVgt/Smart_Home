package environment.floor;
import environment.room.IRoom;
import environment.room.Room;

import java.util.List;

public interface IFloor {
    void addRoom(IRoom room);
    List<Room> getRooms();
    int getNumber();
}
