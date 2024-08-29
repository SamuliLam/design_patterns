package ASCII;

public class Main {
    public static void main(String[] args) {
        UIFactory uiFactoryA = new AFactory();

        Button AButton = uiFactoryA.createButton("Press me twice!");
        AButton.display();

        AButton.setText("Dont press me!");
        AButton.display();

        Checkbox ACheckbox = uiFactoryA.createCheckbox("Check me!");
        ACheckbox.display();

        TextField ATextField = uiFactoryA.createTextField("Text here!");
        ATextField.display();

        UIFactory uiFactoryB = new BFactory();

        Button BButton = uiFactoryB.createButton("Press me twice!");
        BButton.display();

        Checkbox BCheckbox = uiFactoryB.createCheckbox("Check me!");
        BCheckbox.display();

        TextField BTextField = uiFactoryB.createTextField("Text here!");
        BTextField.display();
    }
}
