package factories;

import animals.Animal;
import animals.Dog;

public class DogFactory extends Factory {

    @Override
    public Animal createAnimal() {
        System.out.println("New dog is created");
        return createInstance();
    }

    @Override
    public Animal createInstance() {
        return new Dog();
    }
}