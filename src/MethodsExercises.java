import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    public static void main(String[] args) {

        addition(10,5);
        subtraction(10, 5);
        multiplication(10,5);
        division(10,5);
        modulus(10,5);
        getInteger(1, 10);
        diceRoll();

    }


    public static int addition(int x, int y){
        System.out.println(x+y);
        return x+y;
    }

    public static int subtraction(int x, int y){
        System.out.println(x-y);
        return x-y;
    }

    public static int multiplication(int x, int y){
        System.out.println(x*y);
        return x*y;
    }

    public static int division(int x, int y){
        System.out.println(x/y);
        return x/y;
    }

    public static int modulus(int x, int y){
        System.out.println(10%5);
        return x%y;
    }

    public static int getInteger(int min, int max){
        int userInput;
        String goOn;
        do {
            Scanner scUserInput = new Scanner(System.in);
            System.out.println("Enter a number between 1-10: ");
            userInput = scUserInput.nextInt();
        } while (userInput<min || userInput>max);
        System.out.println("You entered "+ userInput);
        Scanner scGoOn = new Scanner(System.in);
        System.out.println("Would you like to see the factorial of your number?");
        goOn = scGoOn.nextLine();

        if (goOn.equalsIgnoreCase("yes") || goOn.equalsIgnoreCase("y")){
            long factorial = 1;
            for (int i =1; i <= userInput; i++){
                factorial = factorial*i;
            }
            System.out.println(factorial);
        }
        return userInput;
    }

    public static int diceRoll(){
        Random rand = new Random();
        Random rand2 = new Random();
        int n;
        int n2;
        Scanner sc = new Scanner(System.in);
        String confirmRoll;
        int sides;
        System.out.println("Do you want to roll some dice? Y | N ");
        confirmRoll = sc.next();Scanner scSides = new Scanner(System.in);
        System.out.println("How many sides?: ");
        sides = scSides.nextInt();
        n = rand.nextInt(sides) + 1;
        n2 = rand2.nextInt(sides) + 1;
            if (confirmRoll.equalsIgnoreCase("Y") || confirmRoll.equalsIgnoreCase("yes")) {

                System.out.println("You rolled two " + sides + " sided dice getting a: " + n +" and a " + n2 +"\nResulting in a " + (n+n2));
            } else {
                System.out.println("Player opted not to roll");
            }
        return n + n2;
    }


}
