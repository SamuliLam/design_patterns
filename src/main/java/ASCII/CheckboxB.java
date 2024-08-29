package ASCII;

public class CheckboxB extends Checkbox{

    public CheckboxB(String text){
        super(text);
    }

    @Override
    public void display() {
        System.out.println("////");
        System.out.println("/  /  "+ this.text);
        System.out.println("////");
    }
}
