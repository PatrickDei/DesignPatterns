package structural.bridge;

public class PMWindowImpl extends WindowImpl {

    private HPS hps;

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


    interface HPS {}
}
