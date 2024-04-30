package environment.device;

public class Switch extends Device {
    public Switch(String deviceId, String status) {
        super(deviceId, status);
    }

    @Override
    public void operate() {
        System.out.println("Licht " + (getStatus().equals("ON") ? "an" : "aus"));
    }
}

