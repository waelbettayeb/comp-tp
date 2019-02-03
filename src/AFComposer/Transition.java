package AFComposer;

import java.util.ArrayList;
import java.util.HashMap;

public class Transition {
    private Event event = null;
    private State state;
    private String composantId;

    public Transition(Event event, State state, String composantId) {
        this.event = event;
        this.state = state;
        this.composantId = composantId;
    }

    public Event getEvent() {
        return event;
    }

    public String getComposantId() {
        return composantId;
    }


}
