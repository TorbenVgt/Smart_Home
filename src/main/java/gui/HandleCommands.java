package gui;

import environment.building.Building;
import environment.floor.Floor;
import environment.room.Room;


public class HandleCommands {
    public static void handleDevicesStatusCommand(String command, Building building) {
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
                    room.operateAllDevices();
                }
            } else {
                System.out.println("Etage nicht gefunden.");
            }
        } else {
            System.out.println("Falsches Format für Statusbefehl. Verwenden Sie 'status floor [Etage]'.");
        }
    }
}
