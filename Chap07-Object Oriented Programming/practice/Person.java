package chap07;

enum Gender {
    MALE, FEMALE,OTHER;
}
public class Person {
    private final String firstName;
    private final String lastName;

    private int age;

    private Gender gender;

    public Person(String firstName, String lastName, int age, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return firstName + " " + lastName ;
    }
    public int getAge() {
        return age;
    }


    public static void main(String[] args) {
        Person person = new Person("Mohammad", "Alamin", 25, Gender.MALE);
        System.out.println(person.getName());
    }
}
