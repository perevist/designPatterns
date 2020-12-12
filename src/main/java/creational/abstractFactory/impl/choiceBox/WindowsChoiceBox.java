package creational.abstractFactory.impl.choiceBox;

// Klasa reprezentuje konkretny Produkt na diagramie klas UML.

public class WindowsChoiceBox extends ChoiceBox {
    @Override
    public void chooseOption() {
        System.out.println("WINDOWS CHOICE BOX - wybrano opcje");
    }
}
