package structural.flyweight;

public class GlyphFactory {

    /**
     * contains references to Character Glyphs indexed by character code. The array is initialized in the constructor
     */
    private Character[] characters = new Character[N_CHAR_CODES];

    private static final int N_CHAR_CODES = 128;

    public GlyphFactory() {
        for (int i = 0; i < N_CHAR_CODES; i++) {
            characters[i] = null;
        }
    }

    public Character CreateCharacter(char character) {
        if (characters[character] != null) {
            characters[character] = new Character(character);
        }
       return characters[character];
    }

    public Object CreateRow() {
        return new Object();
    }

    public Object CreateColumn() {
        return new Object();
    }
    /* ... */


}
