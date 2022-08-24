package behavioral.interpreter;

public abstract class BooleanExp {
    public abstract boolean Evaluate(Context context);
    public abstract BooleanExp Replace(String key, BooleanExp expression);
    public abstract BooleanExp Copy();
}
