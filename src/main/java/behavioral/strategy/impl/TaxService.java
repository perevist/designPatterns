package behavioral.strategy.impl;

/*
Poniższa klasa jest klientem na diagramie klas UML. Jest to serwis do obslugi podatkow.
- Gdyż sposobow wyliczenia podatku moze byc wiele to uzywamy strategii - rodzina algorytmów (jeden cel - obliczenie podatku,
ale rozne sposoby wykonania tego celu).
- Sa rowniez rozne spsoby wyswietlania informacji o podatku - wielkie litery, w innym jezyku - ponownie jest tutaj jeden wspolny cel
wyswietlenie informacji o podatku, ale sa rozne sposoby tego implementacji
 */

public class TaxService {

    private CalculateTaxStrategy calculateTaxStrategy;
    private DisplayTaxInfoStrategy displayTaxInfoStrategy;

    public TaxService(CalculateTaxStrategy calculateTaxStrategy, DisplayTaxInfoStrategy displayTaxInfoStrategy) {
        this.calculateTaxStrategy = calculateTaxStrategy;
        this.displayTaxInfoStrategy = displayTaxInfoStrategy;
    }

    public double calculateTax(double price) {
        return calculateTaxStrategy.calculateTax(price);
    }

    public void displayTaxInfo() {
        displayTaxInfoStrategy.display();
    }
}
