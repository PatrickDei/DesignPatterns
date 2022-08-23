package structural.flyweight;

import java.util.Map;

/**
 * store extrinsic state of Glyphs
 */
public class GlyphContext {

    private Map<Integer, Font> fonts;
    private int index;

    /**
     * increments index as it traverses
     */
    public void Next() {}

    public void Insert() {}

    public Font GetFont() {
        return new Font();
    }

    public void SetFont(Font font) {

    }

    class Font {}
}
