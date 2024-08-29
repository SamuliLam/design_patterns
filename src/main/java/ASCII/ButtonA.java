package ASCII;

public class ButtonA extends Button{

    public ButtonA(String text){
        super(text);
    }
    @Override
    public void display() {
        makeOutlineForButton(this.textLength);
        System.out.println("==="+ this.text + "===");
        makeOutlineForButton(this.textLength);
    }

    private void makeOutlineForButton(int length){
        for (int i = 0; i < length + 6; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
}
