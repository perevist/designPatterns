package behavioral.decorator.impl;

public class EmailNotifierDecorator implements Notifier{

    private Notifier notifier;

    public EmailNotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void notifyConsumer() {
        notifier.notifyConsumer();
        System.out.println("Symulacja operacji - powiadomienie klienta poprzez maila");
    }
}
