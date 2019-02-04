package AFComposer;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class State {
    private static int ID_COUNTER = 0;
    private int id = State.ID_COUNTER++;
    private static ArrayList<State> states = new ArrayList<>();
    private ArrayList<Transition> transitions = new ArrayList<>();

    public State() {
        states.add(this);
    }

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
    //Worst conception ever <3
    public static void logPrintTransitionTable(){
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("a.aef", "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        writer.print("|S \\ E \t|");
        for (int i = 0; i < State.ID_COUNTER; i++) {
            writer.print("S"+ states.get(i).getId() + " \t|");
        }
        for (int i = 0; i < State.ID_COUNTER; i++) {
            ArrayList<Transition> tr = states.get(i).getTransitions();
            writer.print("\nS"+states.get(i).getId()+" \t|");
            for (int k = 0; k < State.ID_COUNTER; k++) {
                writer.print("\t"+k+":");
                for (int j = 0; j < tr.size() ; j++) {
                    if(tr.get(j).getState().getId() == k){
                        writer.print(tr.get(j) + " ");
                    }
                }
                writer.print("\t|");
            }
        }
        writer.close();
    }
}
