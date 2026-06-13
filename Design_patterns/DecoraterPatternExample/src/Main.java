import Notifier.Decorators.NotifierDecorator;
import Notifier.Decorators.SlackNotifierDecorator;
import Notifier.Decorators.SmsNotifierDecorator;
import Notifier.Impl.EmailNotifier;

public class Main {
    public static void main(String[] args) {
        NotifierDecorator decorator = new SlackNotifierDecorator(new SmsNotifierDecorator(new EmailNotifier()));
        System.out.println(decorator.send());
    }
}