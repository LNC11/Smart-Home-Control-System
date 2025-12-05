public class Microwave extends Device {
    private String timer;
    private int temperature;

    public Microwave(boolean isOn, String timer, int temperature) {
        super(isOn);
        this.timer = timer;
        this.temperature = temperature;
    }

    public String getTimer() {
        return timer;
    }
    public int getTemperature() {
        return temperature;
    }

    public void setTimer(String timer) {
        this.timer = timer;
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
            System.out.print("\nMicrowave");
            System.out.print("\nTimer: " + timer);
            System.out.print("\nTemperature: " + temperature);
            System.out.print("\n---------------------------");
        } else {
            System.out.print("\nMicrowave is currently turned off.");
        }
    }
}
