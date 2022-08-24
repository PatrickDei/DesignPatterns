package behavioral.mediator;

import java.util.List;

public class ListBox extends Widget{
    public ListBox(DialogDirector dialogDirector) {
        super(dialogDirector);
    }

    public String GetSelection(){
        return "";
    }

    public void SetList(List<String> list) {}

    @Override
    public void HandleMouse(Object mouseevent) {}

    // ...
}
