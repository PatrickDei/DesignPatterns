package behavioral.mediator;

public class Button extends Widget {
    public Button(DialogDirector dialogDirector) {
        super(dialogDirector);
    }

    public void SetText(String text) {}

    @Override
    public void HandleMouse(Object mouseevent) {
        // ...
        Changed();
    }

    // ...
}
