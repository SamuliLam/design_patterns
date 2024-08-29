package ASCII;

public abstract class TextField {
    protected String text;
    protected int textLength;

    public TextField(String text) {
        this.text = text;
        this.textLength = text.length();
    }

    public abstract void display();

    public void setText(String text){
        this.text = text;
        this.textLength = text.length();
    }
}
