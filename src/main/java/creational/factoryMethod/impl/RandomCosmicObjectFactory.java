package creational.factoryMethod.impl;

import java.util.Random;

// Jest to klasa, która na diagramie UML reprezentuje ConcreteCreator

public class RandomCosmicObjectFactory implements CosmicObjectFactory{

    private Random random;

    public RandomCosmicObjectFactory() {
        random = new Random();
    }

    @Override
    public CosmicObject create() {
        int randNumber = random.nextInt(3) + 1;

        switch (randNumber) {
            case 1:
                return new SmallAsteroid();
            case 2:
                return new BigAsteroid();
            case 3:
                return new Spacecraft();
            default:
                return null;
        }
    }
}
