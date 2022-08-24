package behavioral.interpreter;

public class VariableExp extends BooleanExp {

    private String name;

    public VariableExp(String name) {
        this.name = name;
    }


    @Override
    public boolean Evaluate(Context context) {
        return context.Lookup(name);
    }

    @Override
    public BooleanExp Replace(String key, BooleanExp expression) {
        if (key.equals(name)) {
            return expression.Copy();
        }
        else {
            return new VariableExp(name);
        }
    }

    @Override
    public BooleanExp Copy() {
        return new VariableExp(name);
    }
}
