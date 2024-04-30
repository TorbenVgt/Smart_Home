package environment.floor;
import environment.room.IRoom;
import environment.room.Room;

import java.util.ArrayList;
import java.util.List;

public class Floor implements IFloor{
    private int number;
    private List<Room> rooms;

    public Floor(int number) {
        this.number = number;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    @Override
    public void addRoom(IRoom room) {

    }

    public List<Room> getRooms() {
        return rooms;
    }

    public int getNumber() {
        return number;
    }
}
