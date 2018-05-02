import java.util.Scanner;
import java.util.Random;

public class HighLow {
    public static void main(String[] args) {

        String userResponse;


        Scanner scUserResponse = new Scanner(System.in);
        Scanner scUserNumber = new Scanner(System.in);
        System.out.println("Would you like to play a guessing game?");
        userResponse = scUserResponse.nextLine();

        if (userResponse.equalsIgnoreCase("yes") || userResponse.equalsIgnoreCase("y")) {

            String userContinue;
            Scanner scUserContinue = new Scanner(System.in);


            do {
                int userNumber;
                Random correct = new Random();
                int answer = correct.nextInt(100) + 1;

                do {
                    System.out.println("Enter a number: ");
                    userNumber = scUserNumber.nextInt();

                        if (userNumber > answer) {
                            System.out.println("Lower...");
                        } else if (userNumber < answer) {
                            System.out.println("Higher...");
                        } else {
                            System.out.println("CORRECT!");
                        }
                        System.out.println("Guess again");

                } while (userNumber != answer);

                System.out.println("Do you want to play again?");
                userContinue = scUserContinue.nextLine();

            } while (userContinue.equalsIgnoreCase("yes") || userContinue.equalsIgnoreCase("y"));
        }
    }
}
