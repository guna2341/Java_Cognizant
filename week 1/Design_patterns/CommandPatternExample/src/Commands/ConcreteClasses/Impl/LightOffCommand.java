package Commands.ConcreteClasses.Impl;

import Commands.Command;
import Commands.Receiver.Impl.Light;

public class LightOffCommand implements Command {

    final private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnoff();
    }
}
