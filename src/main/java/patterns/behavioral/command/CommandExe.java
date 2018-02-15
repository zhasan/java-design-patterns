package patterns.behavioral.command;

public class CommandExe {
    public static void main(String[] args) {
        System.out.println("Demo");
        Receiver intendedReceiver = new Receiver();
        Invoke inv = new Invoke();
        MyUndoCommand unCmd = new MyUndoCommand(intendedReceiver);
        MyRedoCommand reCmd = new MyRedoCommand(intendedReceiver);
        inv.executeCmd(unCmd);
        inv.executeCmd(reCmd);
    }
}