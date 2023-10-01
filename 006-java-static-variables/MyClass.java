public class MyClass {
    private static int sharedValue = 0; // A static variable shared among all instances

    private int instanceValue; // An instance-specific variable

    public MyClass(int instanceValue) {
        this.instanceValue = instanceValue;
    }

    public void setSharedValue(int newValue) {
        sharedValue = newValue; // Change the shared value
    }

    public void printValues() {
        System.out.println("Instance Value: " + instanceValue);
        System.out.println("Shared Value: " + sharedValue);
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10);
        MyClass obj2 = new MyClass(20);

        obj1.printValues();
        obj2.printValues();

        // Change the shared value using a static method
        obj1.setSharedValue(30);

        obj1.printValues();
        obj2.printValues();
    }
}
