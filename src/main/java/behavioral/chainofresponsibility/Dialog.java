package behavioral.chainofresponsibility;

public class Dialog extends Widget {
    protected Dialog(HelpHandler parent, Topic topic) {
        super(null, topic);
        SetHandler(parent, topic);
    }

    @Override
    public void HandleHelp() {
        if (HasHelp()) {
            // offer help on the dialog
        }
        else {
            super.HandleHelp();
        }
    }
}
