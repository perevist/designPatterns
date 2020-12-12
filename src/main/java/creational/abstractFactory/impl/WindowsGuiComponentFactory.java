package creational.abstractFactory.impl;

import creational.abstractFactory.impl.button.Button;
import creational.abstractFactory.impl.button.WindowsButton;
import creational.abstractFactory.impl.choiceBox.ChoiceBox;
import creational.abstractFactory.impl.choiceBox.WindowsChoiceBox;

public class WindowsGuiComponentFactory implements GuiComponentFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public ChoiceBox createChoiceBox() {
        return new WindowsChoiceBox();
    }
}
