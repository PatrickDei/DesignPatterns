package behavioral.mediator;

public class EntryField extends Widget {

    public EntryField(DialogDirector dialogDirector) {
        super(dialogDirector);
    }

    public void SetText(String text) {}

    public String GetText() {
        return "";
    }

    @Override
    public void HandleMouse(Object mouseevent) {}

    // ...
}
