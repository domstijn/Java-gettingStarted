import java.util.Date;

public class Person {
    public static void main(String[] args) {
        Date date = new Date();

        Person person = new Person("John", "M", date);

        System.out.println(person.gender);
        System.out.println(person.birthday);
        System.out.println(person.name);
    }

    enum Gender {
        MALE,
        FEMALE,
        UNSURE
    }

    String name;
    Gender gender = Gender.UNSURE;
    Date birthday;


    public Person(String name, String gender, Date birthday) {
        this.name = name;
        this.birthday = birthday;

        Gender g;

        if (gender.equalsIgnoreCase("m")) {
            g = Gender.MALE;
        } else if (gender.equalsIgnoreCase("f")) {
            g = Gender.FEMALE;
        } else {
            g = Gender.UNSURE;
        }

        this.gender = g;
    }




}
