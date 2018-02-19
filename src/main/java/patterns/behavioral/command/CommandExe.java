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

/*

    GoF Definition: Encapsulate a request as an object, thereby letting you parameterize clients with different
requests, queue or log requests, and support undoable operations.

    Concept
    Here requests are encapsulated as objects. In general, four terms are associated—invoker, client, command,
and receiver. A command object is capable of calling a particular method in the receiver. It stores the
parameters of the methods in receiver. An invoker only knows about the command interface, but it is
totally unware about the concrete commands. The client object holds the invoker object and the command
object(s). The client decides which of these commands needs to execute at a particular point in time. To do
that, he/she passes the command object to the invoker to execute that particular command.

    Real-Life Example
    We cannot change our past, but frequently we wish we could do so. Unfortunately, we do not have any such
device yet to fulfill that wish. But we can undo and redo many other operations in our daily life. We can erase
a pencil drawing with a rubber. We can re-architect our living places. And, most important, we can forget
bad memories and start a fresh journey. So, you must acknowledge that undo/redo operations are part of
our life and we are doing those through some commands—either externally or internally.

    Computer World Example
    The above scenario applies with Microsoft paint also. There we can do the undo/redo operations easily
through some menu options or shortcut keys.

    Note
1. This pattern is widely used for undo/redo operations.
2. A callback function can be designed with this pattern.
3. This pattern is very useful when we model transactions (which can be
responsible for changes in data).
4. Commands can be extended easily. They operate like any other objects. And the
beauty of using them is that while we use them, we do not need to change the
classes in the system.
5. There is another pattern called chain of responsibility. There we forward a request
along a chain of objects with the hope that any one of the objects along that chain
will handle the request. But in command pattern, we’ll forward the request to the
specific object.
 */