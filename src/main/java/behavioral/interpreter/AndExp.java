package behavioral.interpreter;

public class AndExp extends BooleanExp {
    private BooleanExp operand1;
    private BooleanExp operand2;

    public AndExp(BooleanExp operand1, BooleanExp operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }


    @Override
    public boolean Evaluate(Context context) {
        return operand1.Evaluate(context) && operand2.Evaluate(context);
    }

    @Override
    public BooleanExp Replace(String key, BooleanExp expression) {
        return new AndExp(operand1.Replace(key, expression), operand2.Replace(key, expression));
    }

    @Override
    public BooleanExp Copy() {
        return new AndExp(operand1.Copy(), operand2.Copy());
    }
}
