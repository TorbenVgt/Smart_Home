package environment.device;

public class Light extends Device implements IActor {
    public Light(String deviceId, String status) {
        super(deviceId, status);
    }

    @Override
    public void operate() {
        System.out.println("Licht " + (getStatus().equals("ON") ? "ist an" : "ist aus"));
    }

    @Override
    public void actuate() {
        if (getStatus().equals("ON")) {
            System.out.println("Licht wird eingeschaltet.");
        } else {
            System.out.println("Licht wird ausgeschaltet.");
        }
    }
}
