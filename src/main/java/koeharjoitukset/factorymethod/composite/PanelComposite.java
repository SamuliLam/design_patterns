package koeharjoitukset.factorymethod.composite;

import java.util.ArrayList;
import java.util.List;

public class PanelComposite implements Component {
    private List<Component> components = new ArrayList<>();

    public void addComponent(Component component){
        components.add(component);
    }

    @Override
    public void draw(){
        System.out.println("Drawing panel");
        for (Component component : components){
            component.draw();
        }
    }
}
