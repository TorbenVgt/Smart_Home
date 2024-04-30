package rule;

import environment.device.Heater;
import environment.device.TemperatureSensor;


public class TemperatureControlRule implements IRule {
    private TemperatureSensor sensor;
    private Heater heater;
    private boolean enabled = true;

    public TemperatureControlRule(TemperatureSensor sensor, Heater heater) {
        this.sensor = sensor;
        this.heater = heater;
    }

    @Override
    public void execute() {
        if (!enabled) return;  // Regel wird nicht ausgeführt, wenn sie deaktiviert ist
        double temperature = Double.parseDouble(sensor.getStatus());
        if (temperature > 25) {
            heater.setStatus("OFF");
            System.out.println("Es ist zu warm. Heizung wird ausgeschaltet.");
        } else if (temperature < 19) {
            heater.setStatus("ON");
            System.out.println("Es ist zu kalt. Heizung wird eingeschaltet.");
        }
        heater.actuate(); // Aktualisiert den operativen Status des Heizungsgerätes
    }

    @Override
    public void enable() {
        enabled = true;
        System.out.println("Temperaturregel aktiviert.");
    }

    @Override
    public void disable() {
        enabled = false;
        System.out.println("Temperaturregel deaktiviert.");
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}