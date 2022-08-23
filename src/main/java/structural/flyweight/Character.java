package structural.flyweight;

public class Character extends Glyph {

    private char character;

    public Character(char character) {
        this.character = character;
    }

    @Override
    public void Draw(Object window, GlyphContext glyphContext) {
        super.Draw(window, glyphContext);
    }
}
