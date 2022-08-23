package behavioral.command;

public class PasteCommand implements Command {

    private Object document;

    public PasteCommand(Object document) {
        this.document = document;
    }

    @Override
    public void Execute() {
        // document.Paste()
    }
}
