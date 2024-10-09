package koeharjoitukset.factorymethod.composite;
public class Main {
    public static void main(String[] args) {
        Component line = new LineLeaf();
        Component line1 = new LineLeaf();

        PanelComposite panelComposite = new PanelComposite();
        panelComposite.addComponent(line);
        panelComposite.addComponent(line1);

        panelComposite.draw();
    }
}
