package environment.device;

public class VentilationDevice extends Device {
    private int intensity;  // Intensity of the ventilation, ranging from 0 - 100

    public VentilationDevice(String deviceId, String status){
        super(deviceId, status);
        this.intensity = Integer.parseInt(this.getStatus());
    }
    
    public void setIntensity(int intensity){
        if(intensity < 0) {
            this.intensity = 0;
        } else if(intensity > 100) {
            this.intensity = 100;
        } else {
            this.intensity = intensity;
        }
    }

    public int getIntensity(){
        return this.intensity;
    }

    @Override
    public void operate() {
        System.out.println("Lüftung ist auf " + getStatus() + " %");
    }

    }
