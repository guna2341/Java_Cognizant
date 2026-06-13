package test;

import Notifier.Decorators.NotifierDecorator;
import Notifier.Decorators.SlackNotifierDecorator;
import Notifier.Decorators.SmsNotifierDecorator;
import Notifier.Impl.EmailNotifier;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

public class NotifierTest {

@Test
    public void decoratorTest() {
    NotifierDecorator decorator = new SlackNotifierDecorator(new SmsNotifierDecorator(new EmailNotifier()));
    String msg = decorator.send();
    assertNotNull(decorator);
    assertTrue(msg.equals("Msg sent via EMAIL.\nMsg sent via SMS.\nMsg sent via SLACK."));
}

}
