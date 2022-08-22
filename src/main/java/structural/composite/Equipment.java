package structural.composite;

import java.util.Iterator;

/**
 * actions performed on children are unsafe here because equipment can be a leaf - have no children
 * this is a balance between transparency and security (treating every object the same way or having safe calls)
 * if you opt for safety, then at times you may lose type information and have to convert a component into a composite, how can you do this without resorting to a type-unsafe cast
 * One approach is to declare an operation *Composite GetComposite* in the Component class. Component provides a default operation that returns a null pointer. The Composite class redefines this operation to return itself through this pointer
 */
public class Equipment {

    private final String name;

    protected Equipment(String name) {
        this.name = name;
    }

    public Watt Power() {
        return new Watt();
    }

    public Currency NetPrice() {
        return new Currency();
    }

    public Currency DiscountPrice() {
        return new Currency();
    }


    public void Add(Equipment equipment) {}

    public void Remove(Equipment equipment) {}

    public Iterator<Equipment> CreateIterator() {
        return null;
    }


    public String getName() {
        return name;
    }

    class Watt {}
    class Currency {}
}
