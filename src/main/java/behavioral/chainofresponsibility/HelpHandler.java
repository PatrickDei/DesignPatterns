package behavioral.chainofresponsibility;

public abstract class HelpHandler {

    private HelpHandler successor;
    private Topic topic;

    // maybe a builder pattern since successor can be null
    public HelpHandler(HelpHandler successor, Topic topic) {
        this.successor = successor;
        this.topic = topic != null ? topic : Topic.NO_HELP_TOPIC;
    }

    public boolean HasHelp() {
        return topic != Topic.NO_HELP_TOPIC;
    }

    public void HandleHelp() {
        if (successor != null) {
            successor.HandleHelp();
        }
    }

    public void SetHandler(HelpHandler handler, Topic topic) {
        this.successor = handler;
        this.topic = topic;
    }
}
