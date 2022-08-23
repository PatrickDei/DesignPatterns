package structural.proxy;

public class ImageProxy implements Graphic {
    
    private Image image;
    private Object extent;
    private String filename;
    
    public ImageProxy(String filename) {
        this.filename = filename;
        this.extent = null; // still unknown
        this.image = null;
    }
    
    protected Image GetImage(){
        if (image == null){
            image = new Image(filename);
        }
        return image;
    }
    
    @Override
    public void Draw() {
        GetImage().Draw();
    }

    @Override
    public void HandleMouse() {
        GetImage().HandleMouse();
    }

    @Override
    public Object GetExtent() {
        if (extent == null) {
            extent = GetImage().GetExtent();
        }

        return extent;
    }

    @Override
    public void Load() {}

    @Override
    public void Save() {}
}
