package structural.decorator;

public class Decorator extends VisualComponent {

    private VisualComponent visualComponent;

    public Decorator(VisualComponent visualComponent) {
        this.visualComponent = visualComponent;
    }

    @Override
    public void Draw() {
        visualComponent.Draw();
    }

    @Override
    public void Resize() {
        visualComponent.Resize();
    }
}
