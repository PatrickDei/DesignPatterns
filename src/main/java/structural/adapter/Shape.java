package structural.adapter;

public class Shape {
    public void BoundingBox(){}

    public Manipulator CreateManipulator() {
        return new Manipulator();
    }

    class Manipulator {}
}
