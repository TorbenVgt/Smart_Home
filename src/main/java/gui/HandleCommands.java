package gui;

import environment.building.Building;
import environment.floor.Floor;
import environment.room.Room;
import environment.device.IDevice;

public class HandleCommands {
    public static void handleStatusCommand(String command, Building building) {
        String[] parts = command.split(" ");
        if (parts.length == 3 && parts[1].equals("floor")) {
            int floorNumber = Integer.parseInt(parts[2]);
            Floor floor = building.getFloors().stream()
                    .filter(f -> f.getNumber() == floorNumber)
                    .findFirst()
                    .orElse(null);
            if (floor != null) {
                for (Room room : floor.getRooms()) {
                    System.out.println("Raum: " + room.getName());
                    room.getDevices().forEach(device -> System.out.println(device.getDeviceId() + " Status: " + device.getStatus()));
                }
            } else {
                System.out.println("Etage nicht gefunden.");
            }
        } else {
            System.out.println("Falsches Format für Statusbefehl. Verwenden Sie 'status floor [Etage]'.");
        }
    }

    public static void handleControlCommand(String command, Building building) {
        String[] parts = command.split(" ");
        if (parts.length == 4 && parts[1].equals("device")) {
            String deviceId = parts[2];
            String action = parts[3].toLowerCase();
            for (Floor floor : building.getFloors()) {
                for (Room room : floor.getRooms()) {
                    room.getDevices().stream()
                            .filter(device -> device.getDeviceId().equals(deviceId))
                            .findFirst()
                            .ifPresent(device -> {
                                device.setStatus(action.equals("on") ? "ON" : "OFF");
                                System.out.println("Gerät " + deviceId + " wurde " + (action.equals("on") ? "eingeschaltet" : "ausgeschaltet"));
                            });
                }
            }
        } else {
            System.out.println("Falsches Format. Verwenden Sie 'control device [deviceId] [on/off]'.");
        }
    }

    public static void handleSensorCommand(String command, Building building) {
        String[] parts = command.split(" ");
        if (parts.length == 3 && parts[1].equals("sensor")) {
            String sensorId = parts[2];
            for (Floor floor : building.getFloors()) {
                for (Room room : floor.getRooms()) {
                    room.getDevices().stream()
                            .filter(device -> device.getDeviceId().equals(sensorId))
                            .findFirst()
                            .ifPresent(sensor -> System.out.println("Sensor " + sensorId + " Status: " + sensor.getStatus()));
                }
            }
        } else {
            System.out.println("Falsches Format. Verwenden Sie 'sensor [sensorId]'.");
        }
    }
}
