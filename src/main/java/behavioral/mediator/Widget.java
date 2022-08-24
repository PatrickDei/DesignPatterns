package behavioral.mediator;

public abstract class Widget {

    private DialogDirector dialogDirector;

    public Widget(DialogDirector dialogDirector) {
        this.dialogDirector = dialogDirector;
    }

    public void Changed() {
        dialogDirector.WidgetChanged(this);
    }

    public void HandleMouse(Object mouseevent) {

    }

    // ...
}
