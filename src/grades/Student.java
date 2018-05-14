package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades property
    public int addGrade(int grade){
        grades.add(grade);
        return grade;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double averageGrade = 0;

        for (double grade : grades) {
            averageGrade += grade;
        }
        averageGrade = averageGrade / grades.size();
        return averageGrade;

    }

    public static void main(String[] args) {

        Student jake = new Student("Jake");

        jake.addGrade(60);
        jake.addGrade(75);
        jake.addGrade(99);
        jake.addGrade(85);

        System.out.println(jake.getName());
        System.out.println(jake.grades);
        System.out.println(jake.getGradeAverage());

        Student brian = new Student("Brian");

        brian.addGrade(80);
        brian.addGrade(76);
        brian.addGrade(95);

        System.out.println(brian.getName());
        System.out.println(brian.grades);
        System.out.println(brian.getGradeAverage());


    }

}
