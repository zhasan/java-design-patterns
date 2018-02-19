package patterns.behavioral.chainofresp;

class Message {
    public String Text;
    public MessagePriority Priority;

    public Message(String text, MessagePriority priority) {
        Text = text;
        Priority = priority;
    }
}
