package ASCII;

public class TextFieldA extends TextField{

    public TextFieldA(String text){
        super(text);
    }

    @Override
    public void display() {
        makeOutline(textLength);
        System.out.println("=   " + this.text + "   =");
        makeOutline(textLength);
    }

    private void makeOutline(int length){
        for (int i = 0; i < length +8; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

}
