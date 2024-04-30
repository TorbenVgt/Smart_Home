package gui;
import environment.building.Building;
import rule.RuleManager;
import rule.TemperatureControlRule;

import java.util.Scanner;

public class ConsoleInterface {
    public static void startInterface(Building building, RuleManager ruleManager) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Geben Sie einen Befehl ein (status, rule enable [ruleName], rule disable [ruleName], exit):");
            String command = scanner.nextLine();

            if (command.equals("exit")) {
                System.out.println("Programm wird beendet.");
                break;
            } else if (command.startsWith("status")) {
                HandleCommands.handleDevicesStatusCommand(command, building);
            } else if (command.startsWith("rule enable")) {
                String ruleName = command.substring("rule enable".length()).trim(); // Extrahiert den Regelnamen
                ruleManager.enableRule(ruleName);
            } else if (command.startsWith("rule disable")) {
                String ruleName = command.substring("rule disable".length()).trim(); // Extrahiert den Regelnamen
                ruleManager.disableRule(ruleName);
            } else {
                System.out.println("Unbekannter Befehl.");
            }
        }
        scanner.close();
    }



    private static void handleRuleCommand(String command, TemperatureControlRule rule) {
        if (command.equals("enable rule")) {
            rule.enable();
            System.out.println("Regel aktiviert.");
        } else if (command.equals("disable rule")) {
            rule.disable();
            System.out.println("Regel deaktiviert.");
        } else {
            System.out.println("Unbekannter Regelbefehl.");
        }
    }
}
