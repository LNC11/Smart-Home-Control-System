public class Television extends Device {
    private int channel;
    private int volume;

    public Television(boolean isOn, int channel, int volume) {
        super(isOn);
        this.channel = channel;
        this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }
    public int getVolume() {
        return volume;
    }

    public void setChannel(int channel) {
        this.channel = channel;
        showStatus();
    }
    public void setVolume(int volume) {
        this.volume = volume;
        showStatus();
    }
    @Override
    public void showStatus() {
        if(getIsOn()) {
            System.out.print("\n------ DEVICE STATUS ------");
            System.out.print("\nTelevision");
            System.out.print("\nChannel: " + channel);
            System.out.print("\nVolume: " + volume + "%");
            System.out.print("\n---------------------------");
        } else {
            System.out.print("\nTelevision is currently turned off.");
        }
    }
}
