package creational.abstractFactory.impl;

import creational.abstractFactory.impl.button.Button;
import creational.abstractFactory.impl.choiceBox.ChoiceBox;

public interface GuiComponentFactory {
    Button createButton();
    ChoiceBox createChoiceBox();
}
