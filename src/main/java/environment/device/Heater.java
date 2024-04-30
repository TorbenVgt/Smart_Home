package environment.device;

public class Heater extends Device implements IActor {
    public Heater(String deviceId, String status) {
        super(deviceId, status);
    }

    @Override
    public void operate() {
        System.out.println("Heizung ist " + getStatus());
    }

    @Override
    public void actuate() {
        if (getStatus().equals("ON")) {
            System.out.println("Heizung wird eingeschaltet.");
        } else {
            System.out.println("Heizung wird ausgeschaltet.");
        }
    }
}
