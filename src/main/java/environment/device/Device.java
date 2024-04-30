package environment.device;

public abstract class Device implements IDevice {
    private String deviceId;
    private String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Jedes Gerät hat eine Methode zur Ausführung seiner Funktion
    public abstract void operate();
}
