package bridge;

public class Radio implements Device {
    private boolean on = false;
    private int volume = 0;
    private int channel = 0;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
        System.out.println("Radio is turned ON.");
    }

    @Override
    public void disable() {
        on = false;
        System.out.println("Radio is turned OFF.");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if (on) {
            volume = percent;
            System.out.println("Radio volume set to: " + percent + "%");
        } else {
            System.out.println("Radio is OFF. Cannot set volume.");
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        if (on) {
            this.channel = channel;
            System.out.println("Radio channel set to: " + channel);
        } else {
            System.out.println("Radio is OFF. Cannot set channel.");
        }
    }
}