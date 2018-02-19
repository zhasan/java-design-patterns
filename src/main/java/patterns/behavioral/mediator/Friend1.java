package patterns.behavioral.mediator;

public class Friend1 extends Friend {
    public Friend1(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    public void Send(String msg) {
        mediator.Send(this, msg);
    }
    public void Notify(String msg) {
        System.out.println("Amit gets message: "+ msg);
    }
}
