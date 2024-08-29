package ASCII;

public abstract class Button {
    protected String text;
    protected int textLength;

    public Button(String text) {
        this.text = text;
        this.textLength = text.length();
    }

    public abstract void display();

    public void setText(String text){
        this.text = text;
        this.textLength = text.length();
    }
}
