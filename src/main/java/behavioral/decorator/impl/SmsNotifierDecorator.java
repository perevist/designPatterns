package behavioral.decorator.impl;

public class SmsNotifierDecorator implements NotifierDecorator{

    private Notifier notifier;

    public SmsNotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void notifyConsumer() {
        notifier.notifyConsumer();
        System.out.println("Symulacja operacji - powiadomienie klienta przez SMS");
    }
}
