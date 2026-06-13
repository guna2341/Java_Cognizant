package Notifier.Impl;

import Notifier.Notifier;

public class EmailNotifier implements Notifier {
    @Override
    public String send() {
        return "Msg sent via EMAIL.";
    }
}
