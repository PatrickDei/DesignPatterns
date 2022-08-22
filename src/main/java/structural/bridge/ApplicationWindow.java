package structural.bridge;

public class ApplicationWindow extends Window {

    public ApplicationWindow(View contents) {
        super(contents);
    }

    // ...
    @Override
    public void DrawContents() {
        GetView().DrawOn(this);
    }
}
