package Notifier.Impl;

import Notifier.Notifier;

// Basic notifier class in case we need to call some decorator separately.
public class BasicNotifier implements Notifier {
    @Override
    public String send() {
        return "";
    }
}
