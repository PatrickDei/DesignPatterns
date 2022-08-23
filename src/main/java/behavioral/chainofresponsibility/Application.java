package behavioral.chainofresponsibility;

public class Application extends HelpHandler {
    public Application(Topic topic) {
        super(null, topic);
    }

    @Override
    public void HandleHelp() {
        // show a list of help topics
    }

}
