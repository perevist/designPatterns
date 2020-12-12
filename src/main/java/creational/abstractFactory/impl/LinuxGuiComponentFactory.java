package creational.abstractFactory.impl;

import creational.abstractFactory.impl.button.Button;
import creational.abstractFactory.impl.button.LinuxButton;
import creational.abstractFactory.impl.choiceBox.ChoiceBox;
import creational.abstractFactory.impl.choiceBox.LinuxChoiceBox;

public class LinuxGuiComponentFactory implements GuiComponentFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public ChoiceBox createChoiceBox() {
        return new LinuxChoiceBox();
    }
}
