import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scResponse = new Scanner(System.in);
        System.out.println("Do you want to talk to Bob? Yes or No");
        String userResponse = scResponse.nextLine();
        if (userResponse.equalsIgnoreCase("yes")) {
            System.out.println("Exit at anytime by typing \"x\"");
            System.out.println("Talk to Bob: ");
            while (true) {
                Scanner scUserInput = new Scanner(System.in);
                String userInput = scUserInput.nextLine();
                if (userInput.endsWith("!")) {
                    System.out.println("Whoa, chill out!");
                } else if (userInput.endsWith("?")) {
                    System.out.println("Sure.");
                } else if (userInput.endsWith(".")) {
                    System.out.println("Whatever.");
                } else if (userInput.endsWith("x")) {
                    System.out.println("Fine. Be that way!");
                    break;
                } else {
                    System.out.println("What was that?");
                }
            }
        }
    }
}
