package structural.bridge;

public class XWindowImpl extends WindowImpl {

    private Display display;
    private Drawable windowId;
    private GraphicContext graphicContext;

    @Override
    public void ImplTop()  {}

    @Override
    public void ImplBottom()  {}

    @Override
    public void ImplSetExtent()  {}

    @Override
    public void ImplSetOrigin()  {}

    @Override
    public void DeviceRect(Object a, Object b, Object c, Object d)  {}

    @Override
    public void DeviceText(String text, Object point, Object point2)  {}

    @Override
    public void DeviceBitmap(String string, Object point, Object point2)  {}

    class Display {}
    interface Drawable {}
    interface GraphicContext {}
}
