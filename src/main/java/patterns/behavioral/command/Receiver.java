package patterns.behavioral.command;

class Receiver {
    void performUndo() {
        System.out.println("Ex Undo");
    }

     void performRedo() {
        System.out.println("Ex Redo");
    }
}
