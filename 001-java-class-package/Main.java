import java.util.Scanner;
import animals.Animal;

public class Main {
    int x;

    //    class constructor
    public Main() {
        x = 1;
    }

    static void sayHello() {
        System.out.println("Hello, John! <-- static");
    }

    public void sayHello2(String name) {
        System.out.println("Hello, " + name + "! <-- dynamic");
    }



    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Main newObj = new Main();

        System.out.println("this is the Main object itself - " + newObj);
        System.out.println("this is the attribute x of the Main object - " + newObj.x);


//        System.out.println("Enter a name");
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//
//        Main.sayHello();
//        newObj.sayHello2(name);
        System.out.println("\n------------------\n");
        Animal dog = new Animal(10, "dog");
        dog.bark();
        System.out.println("\n------------------\n");

    }
}
