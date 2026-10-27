class Person {

    String name;
    int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Teacher extends Person {

    String subject;

    // Parameterized constructor
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

public class ConstructorInheritance {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Gayatri", 22, "Java");

        t1.display();
    }
}