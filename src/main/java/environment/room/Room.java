package environment.room;
import environment.device.Device;
import environment.device.IDevice;

import java.util.ArrayList;
import java.util.List;

public class Room implements IRoom{
    private String name;
    private List<Device> devices;

    public Room(String name) {
        this.name = name;
        this.devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    @Override
    public void addDevice(IDevice device) {

    }

    public void operateAllDevices() {
        for (Device device : devices) {
            device.operate();
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public List<IDevice> getDevices() {
        return null;
    }
}

