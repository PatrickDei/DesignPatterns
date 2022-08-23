package structural.flyweight;

/**
 * a composite with graphical attributes and can draw itself
 * subclasses that have children must implement Next so that it calls GlyphContext.Next() at each point in the traversal
 */
public class Glyph {

    protected Glyph() {}

    public void Draw(Object window, GlyphContext glyphContext) {}
    public void SetFont(GlyphContext.Font font, GlyphContext glyphContext) {}
}
