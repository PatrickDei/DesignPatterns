package behavioral.strategy;

/**
 * initialize the class with the compositor you need
 */
public class Composition {

    private Compositor compositor;
    private int componentCount;
    private int lineWidth;

    public Composition(Compositor compositor) {
        this.compositor = compositor;
    }
}
