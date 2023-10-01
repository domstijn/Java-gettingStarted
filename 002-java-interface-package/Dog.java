import animal.Animal;
import animal.Car;

// Animal is an interface
// https://www.w3schools.com/java/java_interface.asp
public class Dog implements Animal {
    int age = 0;

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println("hello world");
    }

    @Override
    public int getAge() {
        return this.age;
    }

    // toString needs to be overwritten to print out a custom object representation
    @Override
    public String toString() {
        return "Custom dog repr: dog is " + this.age + " years old!";
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(20);

        System.out.println(dog.getAge());
        System.out.println(dog);

        // the main function from the car.java class is not being run
        // WHEN DOES THIS FUNCITON RUN?
        Car car = new Car(2023, 2, "Chevy");

        car.Broom();
    }
}


