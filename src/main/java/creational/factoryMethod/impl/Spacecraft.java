package creational.factoryMethod.impl;

// Jest to klasa, która na diagramie UML reprezentuje ConcreteProduct

public class Spacecraft extends CosmicObject {
    @Override
    public void display() {
        System.out.println("SPACECRAFT - jestem statkiem kosmicznym");
    }
}
