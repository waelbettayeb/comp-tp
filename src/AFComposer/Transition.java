package AFComposer;

public class Transition {
    private EventsEnum event = null;
    private State state;
    private String composantId;

    public Transition(EventsEnum event, State state, String composantId) {
        this.event = event;
        this.state = state;
        this.composantId = composantId;
    }

    public EventsEnum getEvent() {
        return event;
    }

    public String getComposantId() {
        return composantId;
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        return this.event + "(" + this .composantId +")";
    }
}
