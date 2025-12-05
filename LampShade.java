public class LampShade extends Device {
    private int brightness;
    private String lightColor;

    public LampShade(boolean isOn, int brightness, String lightColor) {
        super(isOn);
        this.brightness = brightness;
        this.lightColor = lightColor;
    }

    public int getBrightness() {
        return brightness;
    }
    public String getColor() {
        return lightColor;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        showStatus();
    }
    public void setColor(String color) {
        this.lightColor = color;
        showStatus();
    }
    @Override
    public void showStatus() {
        if(getIsOn()) {
            System.out.print("\n------ DEVICE STATUS ------");
            System.out.print("\nLampshade");
            System.out.print("\nBrightness: " + brightness + "%");
            System.out.print("\nColor: " + lightColor);
            System.out.print("\n---------------------------");
        } else {
            System.out.print("\nLampshade is currently turned off.");
        }
    }
}