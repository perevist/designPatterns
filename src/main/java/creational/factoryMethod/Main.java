package creational.factoryMethod;


import creational.factoryMethod.impl.CosmicObject;
import creational.factoryMethod.impl.CosmicObjectFactory;
import creational.factoryMethod.impl.RandomCosmicObjectFactory;

public class Main {

    public static void main(String[] args) {
        // Tworzymy obiekt fabryki
        CosmicObjectFactory factory = new RandomCosmicObjectFactory();
        
        // Tworzymy obiekty
        CosmicObject cosmicObject1 = factory.create();
        CosmicObject cosmicObject2 = factory.create();
        CosmicObject cosmicObject3 = factory.create();
        CosmicObject cosmicObject4 = factory.create();

        // Uzywamy stworzonych obiektow w dalszej logice biznesowej
        cosmicObject1.display();
        cosmicObject2.display();
        cosmicObject3.display();
        cosmicObject4.display();
    }
}
