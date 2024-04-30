package environment.device;

public class TemperatureSensor extends Device {
    public TemperatureSensor(String deviceId, String status) {
        super(deviceId, status);
    }

    @Override
    public void operate() {
        System.out.println("Aktuelle Temperatur ist: " + getStatus() + "°C");
    }
}
