package ASCII;

public class CheckboxA extends Checkbox{

    public CheckboxA(String text){
        super(text);
    }
    @Override
    public void display() {
        System.out.println("====");
        System.out.println("=  =  "+ this.text);
        System.out.println("====");
    }

}
