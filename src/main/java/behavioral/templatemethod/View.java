package behavioral.templatemethod;

public abstract class View {

    public void Display() {
        SetFocus();
        DoDisplay();
        ResetFocus();
    }

    protected void SetFocus() {
        // set default focusing mechanic
    }

    abstract protected void DoDisplay();

    private void ResetFocus() {
        // default reset focus
    }
}
