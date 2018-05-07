import java.util.Scanner;
import java.util.Random;

public class ServerNameGenerator {

    static String noun[] = {"Belligerency", "Bonsai", "Charge", "Divide", "Radio", "Asphalt", "Laundry", "Unemployment", "Dessert", "Carp"};
    static String adjective[] = {"Tasteless", "Abandoned", "Swanky", "Giant", "Waiting", "Harsh", "Luxurious", "Ratty", "Remarkable", "Smooth"};

    public static String getNoun(){
        Random randomNoun = new Random();
        int randNoun = randomNoun.nextInt(9) + 1;
        return noun[randNoun];
    }

    public static String getAdj(){
        Random randomAdjective = new Random();
        int randAdj = randomAdjective.nextInt(9) + 1;
        return adjective[randAdj];
    }

    public static void main(String[] args) {



        String reroll;

        do {
            Scanner scReroll = new Scanner(System.in);

            String serverNoun = getNoun();
            String serverAdj = getAdj();

            System.out.println("Your server name is: " + serverAdj + "-" + serverNoun);
            System.out.println("Do you want a different name? Yes or No");
            reroll = scReroll.nextLine();


        } while ("yes".equalsIgnoreCase(reroll) || "y".equalsIgnoreCase(reroll));
    }

}
