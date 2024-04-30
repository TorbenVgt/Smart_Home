package environment.device;

public class HumidityDevice extends Device {
    private int humidity;  // Humidity of the room, ranging from 0 - 100

    public HumidityDevice(String deviceId, String status){
        super(deviceId, status);
        this.humidity = setHumidity(Integer.parseInt(getStatus()));
    }
    
    public int setHumidity(int humidity){
        if(humidity < 0) {
            this.humidity = 0;
        } else if(humidity > 100) {
            this.humidity = 100;
        } else {
            this.humidity = humidity;
        }
        return this.humidity;
    }

    public int getHumidity(){
        return this.humidity;
    }

    @Override
    public void operate(){
        System.out.println("Die Luftfeuchtigkeit beträgt " + getStatus() + " %");
        // Implementation of the operate method
    }
}