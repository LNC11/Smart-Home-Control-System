public class AirConditioner extends Device {
    private int fanSpeed;
    private int temperature;

    public AirConditioner(boolean isOn, int fanSpeed, int temperature) {
        super(isOn);
        this.fanSpeed = fanSpeed;
        this.temperature = temperature;
    }

    public int getFanSpeed() {
        return fanSpeed;
    }
    public int getTemperature() {
        return temperature;
    }

    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
        showStatus();
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        showStatus();
    }
    @Override
    public void showStatus() {
        if(getIsOn()) {
            System.out.print("\n------ DEVICE STATUS ------");
            System.out.print("\nAir Conditioner");
            System.out.print("\nSpeed: " + fanSpeed);
            System.out.print("\nTemperature: " + temperature);
            System.out.print("\n---------------------------");
        } else {
            System.out.print("\nAir Conditioner is currently turned off.");
        }
    }
}
