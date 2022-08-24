package behavioral.mediator;

public class FontDialogDirector implements DialogDirector {

    private Button ok;
    private Button cancel;
    private ListBox fontList;
    private EntryField fontName;

    @Override
    public void ShowDialog() {

    }

    @Override
    public void WidgetChanged(Widget widget) {
        if (widget.equals(fontList)){
            fontName.SetText(fontList.GetSelection());
        } else if (widget.equals(ok)) {
            // ...
        }
        else if (widget.equals(cancel)) {
            // dismiss
        }
    }

    @Override
    public void CreateWidgets() {
        ok = new Button(this);
        cancel = new Button(this);
        fontList = new ListBox(this);
        fontName = new EntryField(this);
    }
}
