package behavioral.chainofresponsibility;

public abstract class Widget extends HelpHandler {

    private Widget parent;

    protected Widget(Widget parent, Topic topic) {
        super(parent, topic);
        this.parent = parent;
    }

}
