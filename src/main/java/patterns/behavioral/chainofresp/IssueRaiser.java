package patterns.behavioral.chainofresp;

class IssueRaiser {
    public IReceiver setFirstReceiver;

    public IssueRaiser(IReceiver setFirstReceiver) {

        this.setFirstReceiver = setFirstReceiver;
    }

    public void RaiseMessage(Message msg) {
        if (setFirstReceiver!=null) {
            setFirstReceiver.ProcessMessage(msg);
        }
    }
}
