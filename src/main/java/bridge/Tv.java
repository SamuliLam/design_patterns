package bridge;

public class Tv implements Device{
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
        System.out.println("Turned TV ON.");
    }

    @Override
    public void disable() {
        on = false;
        System.out.println("Turned TV OFF.");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if (on) {
            volume = percent;
            System.out.println("TV volume set to: " + percent + "%");
        } else {
            System.out.println("TV is OFF.");
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
            System.out.println("TV channel set to: " + channel);
        } else {
            System.out.println("TV is OFF.");
        }
    }
}
