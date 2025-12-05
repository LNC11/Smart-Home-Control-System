public class Device {
    private boolean isOn;
    static int poweredOn = 0;

    public Device(boolean isOn) {
        this.isOn = false;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void turnOn() {
        this.isOn = true;
    }
    public void turnOff() {
        this.isOn = false;
    }
    public void showStatus() {
        System.out.print("No available devices are currently running.");
    }
    public static void toggleAllDevice(Device[] devices, boolean power) {
        for(Device d : devices) {
            if(power) {
                d.turnOn();
            } else {
                d.turnOff();
            }
            d.showStatus();
        }
    }
    public static void turnedOnDevices(Device[] devices) {
        poweredOn = 0;
        for (Device d : devices) {
            if (d.getIsOn()) {
                poweredOn++;
            }

        }
        System.out.println("\n---------------------------------------------");
        System.out.println("Number of device/s that are currently powered on: " + poweredOn);
        System.out.println("---------------------------------------------\n");
    }
}
