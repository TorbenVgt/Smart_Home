package environment.room;
import environment.device.IDevice;

import java.util.List;

public interface IRoom {
    void addDevice(IDevice device);
    void operateAllDevices();
    String getName();
    List<IDevice> getDevices(); // Methode zur Rückgabe aller Geräte im Raum
}
