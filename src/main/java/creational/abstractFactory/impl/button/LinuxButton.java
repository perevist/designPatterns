package creational.abstractFactory.impl.button;

// Klasa reprezentuje konkretny Produkt na diagramie klas UML.

public class LinuxButton extends Button {
    @Override
    public void clickButton() {
        System.out.println("LINUX BUTTON - kliknieto przycisk");
    }
}
