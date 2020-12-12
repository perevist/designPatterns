package creational.abstractFactory;

import creational.abstractFactory.impl.GuiComponentFactory;
import creational.abstractFactory.impl.LinuxGuiComponentFactory;
import creational.abstractFactory.impl.WindowsGuiComponentFactory;
import creational.abstractFactory.impl.button.Button;
import creational.abstractFactory.impl.choiceBox.ChoiceBox;

public class Main {

    public static void main(String[] args) {

        GuiComponentFactory factory1 = new WindowsGuiComponentFactory();
        GuiComponentFactory factory2 = new LinuxGuiComponentFactory();

        System.out.println("---------- WINDOWS ----------");
        Button button1 = factory1.createButton();
        ChoiceBox choiceBox1 = factory1.createChoiceBox();
        button1.clickButton();
        choiceBox1.chooseOption();

        System.out.println("---------- LINUX ----------");
        Button button2 = factory2.createButton();
        ChoiceBox choiceBox2 = factory2.createChoiceBox();
        button2.clickButton();
        choiceBox2.chooseOption();
    }
}
