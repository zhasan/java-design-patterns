package patterns.behavioral.state;

public class TV {
    private RemoteControl state;

    public RemoteControl getState() {
        return state;
    }

    void setState(RemoteControl state) {
        this.state = state;
    }

    TV(RemoteControl state) {
        this.state = state;
    }

    void pressButton() {
        state.pressSwitch(this);
    }
}
