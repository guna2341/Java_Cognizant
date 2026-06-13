package Notifier.Decorators;

import Notifier.Notifier;

public class SmsNotifierDecorator extends NotifierDecorator {

    public SmsNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String send() {
        return notifier.send() + "\nMsg sent via SMS.";
    }
}
