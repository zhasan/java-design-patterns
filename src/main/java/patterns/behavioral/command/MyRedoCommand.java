package patterns.behavioral.command;

public class MyRedoCommand implements ICommand {

    private Receiver receiver;

    MyRedoCommand(Receiver recv) {
        receiver = recv;

    }

    @Override
    public void Do() {
        receiver.performRedo();
    }
}
