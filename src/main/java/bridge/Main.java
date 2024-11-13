package bridge;

public class Main {
    public static void main(String[] args) {

        Device tv = new Tv();
        Device smartTv = new SmartTv();
        SmartRemote smartRemote = new SmartRemote(smartTv);

        // Toggle power
        smartRemote.togglePower();
        System.out.println("TV Power Status: " + smartTv.isEnabled() + "\n");

        // Change volume
        System.out.println("TV Volume: " + smartTv.getVolume());
        smartRemote.volumeUp();
        System.out.println("TV Volume: " + smartTv.getVolume() + "\n");

        // Change channel
        System.out.println("TV Channel: " + smartTv.getChannel());
        smartRemote.channelUp();
        System.out.println("TV Channel: " + smartTv.getChannel() + "\n");

        // Change input source
        System.out.println("Current Input: " + smartRemote.getCurrentInput());
        smartRemote.changeInput("HDMI 2");
        System.out.println("Current Input: " + smartRemote.getCurrentInput() + "\n");

        // Change current app
        System.out.println("Current App: " + ((SmartTv) smartTv).getCurrentApp());
        smartRemote.changeCurrentApp("Netflix");
        System.out.println("Current App: " + ((SmartTv) smartTv).getCurrentApp() + "\n");

        // Trying to change input source of a non-smart device
        SmartRemote remote = new SmartRemote(tv);
        remote.togglePower();
        remote.changeInput("HDMI 2");
    }
}