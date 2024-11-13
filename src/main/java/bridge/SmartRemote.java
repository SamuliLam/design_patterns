package bridge;

public class SmartRemote extends RemoteControl {
    private String currentInput = "HDMI1";

    public SmartRemote(Device device) {
        super(device);
    }

    public void changeCurrentApp(String app) {
        if (device instanceof SmartTv) {
            ((SmartTv) device).setCurrentApp(app);
        } else {
            System.out.println("This device does not support apps.");
        }
    }

    public void changeInput(String input) {
        currentInput = input;
        if (device instanceof SmartTv) {
            ((SmartTv) device).setInputSource(input);
        } else {
            System.out.println("This device does not support input source change.");
        }
    }

    public String getCurrentInput() {
        return currentInput;
    }
}
