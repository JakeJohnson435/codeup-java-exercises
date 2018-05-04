import java.util.Scanner;

public class Person {

    private String name;

    public Person(String name) {
        setName(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        Person person = new Person("Jake");
        System.out.println(person.getName());
        person.setName("Johnson");
        person.sayHello();
    }

//    public Person(String name) {this.name = name;}
//
//
//    public String getName() {
//        return this.name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//        System.out.println("Changing user’s name to "+ name);
//    }
//
//    public void sayHello() {System.out.println(this.name + " says Hello!");}
//
//    public static void main(String[] args) {
//        Person jake = new Person("Jake");
//        jake.getName();
//        jake.setName("Shake");
//        jake.sayHello();
//
//    }
}