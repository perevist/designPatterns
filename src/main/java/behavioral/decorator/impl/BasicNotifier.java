package behavioral.decorator.impl;

// Jest to konkretny komponent
// w tym przypadku zakladamy ze jest to jakis ekran urzadzenia
// np. wsywietlacz lodowki, ktory wyswietla informacje

public class BasicNotifier implements Notifier{
    @Override
    public void notifyConsumer() {
        System.out.println("Powiadomienie podstawowe - wyswietlenie powiadomienia na ekranie lodowki");
    }
}
