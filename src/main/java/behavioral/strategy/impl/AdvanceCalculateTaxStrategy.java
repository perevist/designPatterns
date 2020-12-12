package behavioral.strategy.impl;

public class AdvanceCalculateTaxStrategy implements CalculateTaxStrategy {

    @Override
    public double calculateTax(double price) {
        price += (price * 0.4 - price *0.16);
        return price;
    }
}
