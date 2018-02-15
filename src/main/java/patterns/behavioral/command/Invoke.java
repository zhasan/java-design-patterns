package patterns.behavioral.command;

class Invoke {
    private ICommand cmd;

    void executeCmd(ICommand cmd) {
        this.cmd = cmd;
        cmd.Do();
    }
}
