package behavioral.strategy.impl;

public class SimpleDisplayTaxInfoStrategy implements DisplayTaxInfoStrategy {

    @Override
    public void display() {
        System.out.println("Infomracje o podatku");
    }
}
