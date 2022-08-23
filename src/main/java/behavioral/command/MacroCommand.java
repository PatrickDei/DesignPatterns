package behavioral.command;

import java.util.List;

public class MacroCommand implements Command {

    private List<Command> commands;

    public void Add(Command command) {
        this.commands.add(command);
    }

    public void Remove(Command command) {
        this.commands.remove(command);
    }

    @Override
    public void Execute() {
        for (Command command : commands) {
            command.Execute();
        }
    }
}
