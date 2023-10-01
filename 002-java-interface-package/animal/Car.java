package animal;

public class Car {
    int year;
    int version;
    String brand;

    public Car(int year, int version, String brand) {
        this.year = year;
        this.version = version;
        this.brand = brand;

        System.out.println(this.brand + " " + this.year + ", version: " + this.version + " is being created");
    }

    public void Broom() {
        System.out.println("broom brooooom, says the " + this.brand);
    }

    public void main(String[] args ) {
        System.out.println("running main from car.java");
    }

}
