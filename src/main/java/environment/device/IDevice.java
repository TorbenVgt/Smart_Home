package environment.device;

public interface IDevice {
    String getDeviceId();
    String getStatus();
    void setStatus(String status);
    void operate();
}
