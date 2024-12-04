package exam12.memento;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public static class Memento {
        private String state;

        private Memento(String state) {
            this.state = state;
        }

        private String getState() {
            return state;
        }
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento memento) {
        state = memento.getState();
    }
}
