package command;

public class TogglePixelCommand implements Command{
    private Pixel pixel;

    public TogglePixelCommand(Pixel pixel){
        this.pixel = pixel;
    }
    @Override
    public void execute() {
        pixel.setToggled(!pixel.isToggled());
    }
}
