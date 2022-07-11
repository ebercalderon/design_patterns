package factories;

import animals.Animal;
import animals.Cat;

public class CatFactory extends Factory {

    @Override
    public Animal createAnimal() {
        System.out.println("New cat is created");
        return createInstance();
    }

    @Override
    public Animal createInstance() {
        return new Cat();
    }
}
