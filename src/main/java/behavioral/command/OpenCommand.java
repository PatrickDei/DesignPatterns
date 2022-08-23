package behavioral.command;

public class OpenCommand implements Command {

    private Object application;
    private String response;

    public OpenCommand(Object application){
        this.application = application;
    }

    protected String AskUser() {
        return "";
    }

    @Override
    public void Execute() {
        final String name = AskUser();
        if (name != null) {
            // perform action with application
        }
    }
}
