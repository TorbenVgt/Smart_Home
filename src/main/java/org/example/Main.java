package org.example;

import environment.building.Building;
import environment.device.*;
import environment.floor.Floor;
import environment.room.Room;
import gui.ConsoleInterface;
import rule.RuleManager;
import rule.TemperatureControlRule;


public class Main {
    public static void main(String[] args) {
        // Erstellen der Sensoren und Aktoren
        Switch switch1 = new Switch("switch1", "ON");
        TemperatureSensor tempSen1 = new TemperatureSensor("tempSen1", "20");
        TemperatureSensor tempSen2 = new TemperatureSensor("tempSen2", "30");
        HumidityDevice humDev1 = new HumidityDevice("humDev1", "80");

        Light light1 = new Light("light1", "ON");
        Heater heater1 = new Heater("heater1", "ON");
        Heater heater2 = new Heater("heater2", "ON");
        VentilationDevice venDev1 = new VentilationDevice("venDev1", "40");

        // Erste Etage mit zwei Räumen
        Room room1Floor1 = new Room("Office 1.1");
        room1Floor1.addDevice(heater1);
        room1Floor1.addDevice(tempSen1);

        Room room2Floor1 = new Room("Office 1.2");
        room2Floor1.addDevice(heater2);
        room2Floor1.addDevice(tempSen2);

        Floor floor1 = new Floor(1);
        floor1.addRoom(room1Floor1);
        floor1.addRoom(room2Floor1);

        // Zweite Etage mit zwei Räumen
        Room room1Floor2 = new Room("Office 2.1");
        room1Floor2.addDevice(switch1);
        room1Floor2.addDevice(light1);

        Room room2Floor2 = new Room("Office 2.2");
        room2Floor2.addDevice(humDev1);
        room2Floor2.addDevice(venDev1);

        Floor floor2 = new Floor(2);
        floor2.addRoom(room1Floor2);
        floor2.addRoom(room2Floor2);

        // Gebäude initialisieren
        Building building = new Building("1234 Smart St.");
        building.addFloor(floor1);
        building.addFloor(floor2);

        // Regelmanager und Regeln
        RuleManager ruleManager = new RuleManager();
        TemperatureControlRule tempControlRule1 = new TemperatureControlRule(tempSen2, heater2);
        ruleManager.addRule("TempControl1", tempControlRule1);

        // Starten der CLI
        ConsoleInterface.startInterface(building, ruleManager);
    }

}

