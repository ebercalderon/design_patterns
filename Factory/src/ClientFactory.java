import animals.Animal;
import factories.*;

public class ClientFactory {

    public static void main(String[] args) {
        Factory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.speak();

        Factory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.speak();
    }
}