package behavioral.strategy.impl;

public class UppercaseDisplayTaxInfoStrategy implements DisplayTaxInfoStrategy {

    @Override
    public void display() {
        System.out.println("Infomracje o podatku".toUpperCase());
    }
}
