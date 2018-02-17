package patterns.behavioral.state;

public class On extends RemoteControl {
    @Override
    public void pressSwitch(TV context) {
        System.out.println("On");
        context.setState(new Off());
    }
}
