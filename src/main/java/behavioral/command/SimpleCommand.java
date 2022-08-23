package behavioral.command;

public class SimpleCommand<Receiver> implements Command {

    private Object action;
    private Receiver receiver;

    public SimpleCommand(Object action, Receiver receiver) {
        this.action = action;
        this.receiver = receiver;
    }

    @Override
    public void Execute() {
        // receiver.action() !!!
    }
}
