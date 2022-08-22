package structural.bridge;

public class Window {
    private View contents;
    private WindowImpl impl;

    public Window(View contents) {
        this.contents = contents;
    }

    protected View GetView() {
        return contents;
    }
    protected WindowImpl GetWindowImpl () {
        if (impl == null) {
            // obtain impl from a factory (check Abstract Factory)
        }
        return impl;
    }

    // requests handled by window
    public void DrawContents() {}

    public void Open() {}
    public void Close() {}
    public void Iconify() {}
    public void Deiconify() {}

    // requests forwarded to implementation
    public void SetOrigin(Object point) {}
    public void SetExtent(Object extent) {}
    public void Raise() {}
    public void Lower() {}

    public void DrawLine(Object from, Object to) {}
    public void DrawPolygon(Object[] points, int n) {}
    public void DrawText(String text, Object point) {}
    public void DrawRect(Object from, Object to) {
        WindowImpl impl = GetWindowImpl();
        impl.DeviceRect(0, 0, 0, 0);
    }
}
