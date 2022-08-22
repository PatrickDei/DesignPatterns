package structural.decorator;

public class BorderDecorator extends Decorator {

    private final int borderWidth;

    public BorderDecorator(VisualComponent visualComponent, int borderWidth) {
        super(visualComponent);
        this.borderWidth = borderWidth;
    }

    private void DrawBorder() {
        /*
        draw the border
         */
    }

    @Override
    public void Draw() {
        super.Draw();
        DrawBorder();
    }
}
