package patterns.behavioral.state;

public class Off extends RemoteControl {
    @Override
    public void pressSwitch(TV context) {
        System.out.println("Off");
        context.setState(new On());
    }
}
