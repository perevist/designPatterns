package creational.abstractFactory.impl.button;

// Klasa reprezentuje konkretny Produkt na diagramie klas UML.

public class WindowsButton extends Button {
    @Override
    public void clickButton() {
        System.out.println("WINDOWS BUTTON - kliknieto przycisk");
    }
}
