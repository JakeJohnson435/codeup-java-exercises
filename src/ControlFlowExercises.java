import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//
//        int i2 = 100;
//        do {
//            if (i2 % 5 == 0){
//                System.out.println(i2);}
//            i2--;
//        } while (i2 >= -10);
        for (int i2 = 100; i2 >= -10; i2--) {
            if (i2 % 5 == 0) {
                System.out.println(i2);
            }
        }

        for (long i3 = 2; i3 <= 65536; i3 *= i3) {
            System.out.println(i3);
        }

        for (int i4 = 1; i4 <= 100; i4++) {
            if (i4 % 5 == 0 && i4 % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (i4 % 5 == 0) {
                System.out.println("Buzz");
            } else if (i4 % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i4);
            }
        }

        int userNumber;
        Scanner scNumber = new Scanner(System.in);
        System.out.print("Enter a number: ");
        userNumber = scNumber.nextInt();

        System.out.println("Here is your table!");
        System.out.println("Number" + "|" + "squared" + "|" + "cubed");

        for (int i5 = 1; i5 <= userNumber; i5++) {
            System.out.println(i5 + "|" + i5 * i5 + "|" + i5 * i5 * i5);
        }

        Scanner scUserResponse = new Scanner(System.in);
        System.out.println("Do you want to continue? Yes or No");
        String userResponse = scUserResponse.nextLine();
        if (userResponse.equalsIgnoreCase("yes")) {

            System.out.print("Enter your grade: ");
            int userNumber2;
            Scanner scNumber2 = new Scanner(System.in);
            userNumber2 = scNumber2.nextInt();
            System.out.println("Do you want to see your grade? Yes or No");
            Scanner scResponse2 = new Scanner(System.in);
            String userResponse2 = scResponse2.nextLine();
            if (userResponse2.equalsIgnoreCase("Yes")) {

                if (userNumber2 >= 88) {
                    System.out.println("Your grade is an A");
                } else if (userNumber2 >= 80) {
                    System.out.println("Your grade is a B");
                } else if (userNumber2 >= 67) {
                    System.out.println("Your grade is a C");
                } else if (userNumber2 >= 60) {
                    System.out.println("Your grade is a D");
                } else {
                    System.out.println("You're failing");
                }
                System.out.println();
            }
        }
    }
}
