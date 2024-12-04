package exam12.memento;

import java.util.Deque;
import java.util.LinkedList;

public class Caretaker {
    private Deque<Originator.Memento> mementos;
    private Originator originator;

    public Caretaker() {
        mementos = new LinkedList<>();
        originator = new Originator();
    }


    public void addMemento(String text){
        originator.setState(text);
        mementos.add(originator.createMemento());
    }

    public void removeMemento(){
        originator.restoreMemento(mementos.pop());
    }
}
