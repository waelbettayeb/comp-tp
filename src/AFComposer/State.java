package AFComposer;

import java.util.ArrayList;

public class State {
    private static int ID = 0;
    private int id = ID++;
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
}
