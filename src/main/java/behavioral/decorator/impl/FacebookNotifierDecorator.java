package behavioral.decorator.impl;

public class FacebookNotifierDecorator implements NotifierDecorator {

    private Notifier notifier;

    public FacebookNotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void notifyConsumer() {
        notifier.notifyConsumer();
        System.out.println("Symulacja operacji - powiadomienie klienta poprzez Facebook'a");
    }
}
