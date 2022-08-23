package behavioral.chainofresponsibility;

public class ChainImplementation {

    public void Program() {
        Application application = new Application(Topic.APPLICATION);

        Dialog dialog = new Dialog(application, Topic.PRINT);

        Button button = new Button(dialog, Topic.PAPER_ORIENTATION);

        // invoke help from any object in the chain f.e.
        button.HandleHelp();
    }
}
