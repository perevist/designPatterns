package behavioral.strategy.impl;

public class SimpleCalculateTaxStrategy implements CalculateTaxStrategy {

    @Override
    public double calculateTax(double price) {
        price += (price * 0.23);
        return price;
    }
}
