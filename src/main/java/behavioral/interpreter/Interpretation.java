package behavioral.interpreter;

public class Interpretation {

    /**
     * evaluate expression (x && y)
     */
    public void Start() {
        BooleanExp expression;
        Context context = new Context();

        VariableExp x = new VariableExp("x");
        VariableExp y = new VariableExp("y");

        expression = new AndExp(x, y);

        context.Assign(x, true);
        context.Assign(y, false);

        boolean result = expression.Evaluate(context);
    }
}
