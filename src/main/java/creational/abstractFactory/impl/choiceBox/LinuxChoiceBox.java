package creational.abstractFactory.impl.choiceBox;

// Klasa reprezentuje konkretny Produkt na diagramie klas UML.

public class LinuxChoiceBox extends ChoiceBox {
    @Override
    public void chooseOption() {
        System.out.println("LINUX CHOICE BOX - wybrano opcje");
    }
}
