import java.util.Scanner;

public class Person {
    public static void main(String[] args) {

        String editName;
        Scanner scEditName = new Scanner(System.in);


        Person name = new Person();
        name.firstName = "Jake";
        name.lastName = "Johnson";

        getName();
        System.out.println("Do you want to change the name? Y / N");
        editName = scEditName.nextLine();

            if (editName.equalsIgnoreCase("y") || editName.equalsIgnoreCase("yes")){
                setName();

                System.out.println("You changed the name to " + name.firstName + " " + name.lastName);
            }

        sayHello();

    }



    public static String firstName;
    public static String lastName;

    public static String getName(){
        System.out.println(Person.firstName + " " + Person.lastName);
        return Person.firstName + Person.lastName;
    }

    public static String setName(){
        Scanner scFirstName = new Scanner(System.in);
        Scanner scLastName = new Scanner(System.in);
        System.out.println("Change first name: ");
        Person.firstName = scFirstName.next();
        System.out.println("Change last name: ");
        Person.lastName = scLastName.next();
        return Person.firstName + Person.lastName;
    }

    public static String sayHello(){
        System.out.println("Hello "+ Person.firstName + " " + Person.lastName);
        return Person.firstName + Person.lastName;
    }


}
