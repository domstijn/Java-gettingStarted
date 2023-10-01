package animals;

public class Animal {

    int age;
    String breed;

    // a constructor or functions and methods do not have default keyword argument options
    // So the builder pattern is used to handle the setting of default keyword arguments
    // See: https://stackoverflow.com/questions/222214/managing-constructors-with-many-parameters-in-java/222295#222295
    public Animal(int _age, String breed) {
        // both of these are equivalent
        age = _age;
        this.breed = breed;
        System.out.println("Creating new animal of breed " + this.breed);

    }

    public void bark() {
        System.out.println("Bark Bark!");
    }
}
