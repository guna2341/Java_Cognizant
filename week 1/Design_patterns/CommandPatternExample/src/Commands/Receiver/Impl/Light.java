package Commands.Receiver.Impl;

import Commands.Receiver.Receiver;

public class Light implements Receiver {

    private boolean lightStatus;

    public Light() {
        this.lightStatus = false;
    }

    @Override
    public void turnoff() {
        if (lightStatus) {
            this.lightStatus = false;
            System.out.println("Light is turned off");
            return;
        }
        System.out.println( "Light is already off");
    }

    @Override
    public void turnon() {
        if (!lightStatus) {
            this.lightStatus = true;
            System.out.println("Light is turned on");
            return;
        }
        System.out.println("Light is already on");
    }
}
