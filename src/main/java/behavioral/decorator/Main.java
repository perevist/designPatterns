package behavioral.decorator;

import behavioral.decorator.impl.*;

public class Main {

    public static void main(String[] args) {

        // Tworzymy pierwszy system powiadamiajacy
        // moglibysmy to zrobic w jednej linijce tworzac nowe obiekty i przekazujac
        // do odpowiednich konstruktorow, ale zrobiono tak jak ponizej ze wzgledu na czytelnosc
        Notifier notifier1 = new BasicNotifier();
        Notifier notifier2 = new SmsNotifierDecorator(notifier1);
        Notifier notifier3 = new EmailNotifierDecorator(notifier2);
        Notifier notifier4 = new FacebookNotifierDecorator(notifier3);

        notifier4.notifyConsumer();
    }
}
