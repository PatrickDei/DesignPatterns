package behavioral.chainofresponsibility;

public class Button extends Widget {
    protected Button(Widget parent, Topic topic) {
        super(parent, topic);
    }

    @Override
    public void HandleHelp() {
        if (HasHelp()) {
            // offer help on the button
        }
        else {
            super.HandleHelp();
        }
    }
}
