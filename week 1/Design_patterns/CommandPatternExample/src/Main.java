import Commands.ConcreteClasses.Impl.LightOffCommand;
import Commands.ConcreteClasses.Impl.LightOnCommand;
import Commands.Invoker.RemoteControl;
import Commands.Receiver.Impl.Light;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        LightOffCommand lightoff = new LightOffCommand(light);
        LightOnCommand lighton = new LightOnCommand(light);

        RemoteControl remoteControl = new RemoteControl(lighton);
        remoteControl.execute();
        remoteControl.setCommand(lightoff);
        remoteControl.execute();
        remoteControl.execute();

    }
}