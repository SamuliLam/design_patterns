package bridge;

public class SmartTv implements Device {
    private boolean on = false;
    private int volume = 50;
    private int channel = 1;
    private String inputSource = "HDMI 1";
    private String currentApp = "MTV Katsomo";

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
        System.out.println("Smart TV is turned ON.");
    }

    @Override
    public void disable() {
        on = false;
        System.out.println("Smart TV is turned OFF.");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if (on) {
            volume = percent;
            System.out.println("Smart TV volume set to: " + percent + "%");
        } else {
            System.out.println("Smart TV is OFF. Cannot set volume.");
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
            System.out.println("Smart TV channel set to: " + channel);
        } else {
            System.out.println("Smart TV is OFF. Cannot set channel.");
        }
    }

    public String getInputSource() {
        return inputSource;
    }

    public void setInputSource(String source) {
        if (on) {
            inputSource = source;
            System.out.println("Smart TV input source set to: " + source);
        } else {
            System.out.println("Smart TV is OFF. Cannot set input source.");
        }
    }

    public String getCurrentApp() {
        return currentApp;
    }

    public void setCurrentApp(String app) {
        if (on) {
            currentApp = app;
            System.out.println("Smart TV app set to: " + app);
        } else {
            System.out.println("Smart TV is OFF. Cannot set app.");
        }
    }
}