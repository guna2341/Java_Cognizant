package Notifier.Decorators;

import Notifier.Notifier;

public abstract class NotifierDecorator implements Notifier {
    protected Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    public String send() {
       return notifier.send();
    }

}
