package Commands.Invoker;

import Commands.Command;

public class RemoteControl implements Command {

    private Command command;

    public RemoteControl(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    @Override
    public void execute() {
        command.execute();
    }
}
