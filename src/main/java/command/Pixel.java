package command;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Pixel extends Rectangle{

    private boolean isToggled;

    private final int size = 30;
    public Pixel(){
        this.setHeight(size);
        this.setWidth(size);
        this.setFill(Color.WHITE);
    }

    public boolean isToggled() {
        return isToggled;
    }

    public void setToggled(boolean toggled) {
        isToggled = toggled;
        if (isToggled){
            this.setFill(Color.BLACK);
        } else {
            this.setFill(Color.WHITE);
        }
    }

    public int getSize() {
        return size;
    }
}
