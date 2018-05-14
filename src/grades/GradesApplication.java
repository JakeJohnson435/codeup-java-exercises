package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        students.put("MidNightCookie", new Student("John"));
        students.put("Trying-Yeti", new Student("Nestor"));
        students.put("Phteven", new Student("Steven"));
        students.put("DoughBrainTwirlMonkey", new Student("Brian"));

        Student nestor = students.get("Trying-Yeti");
        Student john = students.get("MidNightCookie");
        Student steven = students.get("Phteven");
        Student brian = students.get("DoughBrainTwirlMonkey");

        nestor.addGrade(50);
        nestor.addGrade(60);
        nestor.addGrade(75);

        john.addGrade(80);
        john.addGrade(88);
        john.addGrade(88);

        steven.addGrade(80);
        steven.addGrade(50);
        steven.addGrade(66);

        brian.addGrade(90);
        brian.addGrade(82);
        brian.addGrade(75);


            System.out.println("Select a Username you want more info on");
            System.out.println();
            for (Map.Entry<String, Student> entry : students.entrySet()) {

                System.out.println(" | " + entry.getKey() + " | ");
            }
            String anotherStudent;

            do {
                String username;
                Scanner scUsername = new Scanner(System.in);
                Scanner scAnother = new Scanner(System.in);
                username = scUsername.nextLine();
                if (username.equalsIgnoreCase("Trying-Yeti")) {
                    System.out.println("Name = " + students.get("Trying-Yeti").getName());
                    System.out.println("Trying-Yeti's average grade is " + students.get("Trying-Yeti").getGradeAverage());
                    System.out.println("Would you like to select another one?");
                    anotherStudent = scAnother.nextLine();
                } else if (username.equalsIgnoreCase("MidNightCookie")) {
                    System.out.println("Name = " + students.get("MidNightCookie").getName());
                    System.out.println("MidNightCookie's average grade is " + students.get("MidNightCookie").getGradeAverage());
                    System.out.println("Would you like to select another one?");
                    anotherStudent = scAnother.nextLine();
                } else if (username.equalsIgnoreCase("Phteven")) {
                    System.out.println("Name = " + students.get("Phteven").getName());
                    System.out.println("Phteven's average grade is " + students.get("Phteven").getGradeAverage());
                    System.out.println("Would you like to select another one?");
                    anotherStudent = scAnother.nextLine();
                } else if (username.equalsIgnoreCase("DoughBrainTwirlMonkey")) {
                    System.out.println("Name = " + students.get("BrainDoughTwirlMonkey").getName());
                    System.out.println("BrainDoughTwirlMonkey's average grade is " + students.get("BrainDoughTwirlMonkey").getGradeAverage());
                    System.out.println("Would you like to select another one?");
                    anotherStudent = scAnother.nextLine();
                } else if (username.equalsIgnoreCase("n")||username.equalsIgnoreCase("n")||(username.equalsIgnoreCase("Quit"))) {
                    System.out.println("Have a nice day!");
                    break;
                } else {
                    System.out.println("there is no student with that username");
                    System.out.println("Would you like to select another one?");
                    anotherStudent = scAnother.nextLine();
                }
            } while (anotherStudent.equalsIgnoreCase("yes") || anotherStudent.equalsIgnoreCase("y"));


    }
}
