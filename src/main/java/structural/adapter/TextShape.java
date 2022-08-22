package structural.adapter;

public class TextShape extends Shape {
    private TextView textView;

    public TextShape(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void BoundingBox() {
        textView.GetOrigin();
        textView.GetExtent();

        // perform recalculations
    }

    public boolean IsEmpty() {
        return textView.IsEmpty();
    }

    @Override
    public Manipulator CreateManipulator() {
        return super.CreateManipulator();
    }
}
