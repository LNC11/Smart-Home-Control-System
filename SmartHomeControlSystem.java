public class SmartHomeControlSystem {
    public static void main(String[] args) {

        Device ac = new AirConditioner(true, 3, 24);
        

        LampShade lamp1 = new LampShade(true, 100, "Yellow");
        LampShade lamp2 = lamp1;
        

        Device tv = new Television(true, 1, 10);
        

        Microwave mw = new Microwave(true, "0:00", 0);
        

        Device[] devices = {ac, lamp1, lamp2, tv, mw};
        Device.toggleAllDevice(devices, true);

        Device.turnedOnDevices(devices);
    }
}
