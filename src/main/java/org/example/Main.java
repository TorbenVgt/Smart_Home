package org.example;

import environment.building.Building;
import environment.device.*;
import environment.floor.Floor;
import environment.room.Room;
import gui.ConsoleInterface;
import rule.RuleManager;
import rule.TemperatureControlRule;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Erstellen von Geräten (Sensoren und Aktoren)
        TemperatureSensor tempSensor1 = new TemperatureSensor("TempSensor1", "10");
        Heater heater1 = new Heater("Heater1", "OFF");
        VentilationDevice ventDev1 = new VentilationDevice("VentilationDevice1", "20");
        HumidityDevice humDev1 = new HumidityDevice("HumidityDevice1", "1000");
        // Erstellen eines Raumes und Hinzufügen von Geräten
        Room room1 = new Room("Konferenzraum");
        room1.addDevice(tempSensor1);
        room1.addDevice(heater1);
        room1.addDevice(ventDev1);
        room1.addDevice(humDev1);

        // Erstellen einer Etage und Hinzufügen des Raumes
        Floor floor1 = new Floor(1);
        floor1.addRoom(room1);

        // Erstellen eines Gebäudes und Hinzufügen der Etage
        Building building = new Building("1234 Smart Home Straße");
        building.addFloor(floor1);

        // Erstellen des Regel-Managers und Hinzufügen von Regeln
        RuleManager ruleManager = new RuleManager();
        TemperatureControlRule tempRule = new TemperatureControlRule(tempSensor1, heater1);
        ruleManager.addRule("TempControl", tempRule);

        // Starten der Konsole-Interface
        ConsoleInterface.startInterface(building, ruleManager);
    }
}


        /*  / Erstellung der Geräte
        Heater heater = new Heater("Heater1", "OFF");
        TemperatureSensor tempSensor = new TemperatureSensor("TempSensor1", "10");

        // Erstellung des Raums und Hinzufügen der Geräte
        Room room = new Room("Office");
        room.addDevice(heater);
        room.addDevice(tempSensor);

        // Erstellung der Etage und Hinzufügen des Raums
        Floor floor = new Floor(1);
        floor.addRoom(room);

        // Erstellung des Gebäudes und Hinzufügen der Etage
        Building building = new Building("1234 Smart St.");
        building.addFloor(floor);

        // Erstellung der Regel
        TemperatureControlRule tempControlRule = new TemperatureControlRule(tempSensor, heater);

        // Starten der GUI und Bereitstellen der Gebäudeinformationen und Regel
        ConsoleInterface.startInterface(building, tempControlRule);
    }
}
            */
