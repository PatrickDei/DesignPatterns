package structural.bridge;

public class IconWindow extends Window {

    private String bitmapName;

    public IconWindow(View contents) {
        super(contents);
    }

    @Override
    public void DrawContents() {
        WindowImpl impl = GetWindowImpl();
        if (impl != null) {
            impl.DeviceBitmap(bitmapName, 0, 0);
        }
    }
}
