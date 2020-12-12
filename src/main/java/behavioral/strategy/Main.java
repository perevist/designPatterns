package behavioral.strategy;

import behavioral.strategy.impl.*;

public class Main {

    public static void main(String[] args) {

        // Tworzymy konkretne serwisy do obliczania podatku
        TaxService taxService1 = new TaxService(new SimpleCalculateTaxStrategy(), new SimpleDisplayTaxInfoStrategy());
        TaxService taxService2 = new TaxService(new AdvanceCalculateTaxStrategy(), new UppercaseDisplayTaxInfoStrategy());

        System.out.println("-------------- SERWIS 1 --------------");
        System.out.println("Do zaplaty z podatkiem " + taxService1.calculateTax(16));
        taxService1.displayTaxInfo();

        System.out.println("-------------- SERWIS 1 --------------");
        System.out.println("Do zaplaty z podatkiem " + taxService2.calculateTax(16));
        taxService2.displayTaxInfo();
    }
}
