package gui;
import environment.building.Building;
import rule.RuleManager;
import java.util.Scanner;

public class ConsoleInterface {
    public static void startInterface(Building building, RuleManager ruleManager) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Geben Sie einen Befehl ein (help, status, control, sensor, rule enable [ruleName], rule disable [ruleName], exit):");
            String command = scanner.nextLine();

            if (command.equals("exit")) {
                System.out.println("Programm wird beendet.");
                break;
            } else if (command.equals("help")) {
                displayHelp();
            } else if (command.startsWith("status")) {
                HandleCommands.handleStatusCommand(command, building);
            } else if (command.startsWith("control")) {
                HandleCommands.handleControlCommand(command, building);
            } else if (command.startsWith("sensor")) {
                HandleCommands.handleSensorCommand(command, building);
            } else if (command.startsWith("rule enable")) {
                String ruleName = command.substring("rule enable".length()).trim();
                ruleManager.enableRule(ruleName);
            } else if (command.startsWith("rule disable")) {
                String ruleName = command.substring("rule disable".length()).trim();
                ruleManager.disableRule(ruleName);
            } else {
                System.out.println("Unbekannter Befehl.");
            }
        }
        scanner.close();
    }

    private static void displayHelp() {
        System.out.println("Verfügbare Befehle:");
        System.out.println("help - Zeigt alle verfügbaren Befehle an");
        System.out.println("exit - Beendet das Programm");
        System.out.println("status floor [floorNumber] - Zeigt den Status aller Geräte in einer Etage an");
        System.out.println("control [deviceId] [on/off] - Schaltet ein spezifisches Gerät ein oder aus");
        System.out.println("sensor [sensorId] - Zeigt den Status eines spezifischen Sensors an");
        System.out.println("rule enable [ruleName] - Aktiviert eine Regel");
        System.out.println("rule disable [ruleName] - Deaktiviert eine Regel");
    }
}