package Notifier.Decorators;

import Notifier.Notifier;

public class SlackNotifierDecorator extends NotifierDecorator {

    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String send() {
        return notifier.send() + "\nMsg sent via SLACK.";
    }
}
