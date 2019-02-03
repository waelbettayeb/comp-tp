package AFComposer;

import java.util.ArrayList;

public class State {
    private static int ID_COUNTER = 0;
    private int id = State.ID_COUNTER++;
    private ArrayList<Transition> transitions = new ArrayList<>();

    public int getId() {
        return id;
    }

    public ArrayList<Transition> getTransitions() {
        return transitions;
    }

    public void addTransition(Transition transition) {
        this.transitions.add(transition);
    }

    @Override
    public String toString() {
        return "(S:" + this.id + "){"+ this.transitions +"}";
    }
}
