package structural.proxy;

public class Image implements Graphic {
    public Image(String filename) {
        // load the image
    }

    @Override
    public void Draw() {}

    @Override
    public void HandleMouse() {}

    @Override
    public Object GetExtent() {
        return new Object();
    }

    @Override
    public void Load() {}

    @Override
    public void Save() {}
}
