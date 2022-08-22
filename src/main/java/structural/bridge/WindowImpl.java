package structural.bridge;

public abstract class WindowImpl {

    protected WindowImpl() {}

    public abstract void ImplTop();
    public abstract void ImplBottom();
    public abstract void ImplSetExtent();
    public abstract void ImplSetOrigin();

    public abstract void DeviceRect(Object a, Object b, Object c, Object d);
    public abstract void DeviceText(String text, Object point, Object point2);
    public abstract void DeviceBitmap(String string, Object point, Object point2);
    // lots more functions for drawing windows...
}
