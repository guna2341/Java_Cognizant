package Commands.ConcreteClasses.Impl;

import Commands.Command;
import Commands.Receiver.Impl.Light;

public class LightOnCommand implements Command {

    final private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnon();
    }
}
