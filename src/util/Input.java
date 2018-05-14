package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);
    boolean val;


    public String getString() {
        String input = scanner.nextLine();
        System.out.println(input);
        return input;
    }

    public boolean yesNo(){
        String input;


        do{
            input = scanner.next();
            if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")){
                val = true;
                break;
            } else if (input.equalsIgnoreCase("n") || input.equalsIgnoreCase("no")){
                val = false;
                break;
            } else {
                System.out.println("Try again.");
            }
        }while(!input.equalsIgnoreCase("y") || !input.equalsIgnoreCase("n"));
        return val;
    }

    public int getInt(int min, int max){
        System.out.println("enter a number between "+ min + " " +max);
        int input;

        do{
            input = scanner.nextInt();
            if (input > min && input < max){
                System.out.println("You entered " + input);
            } else {
                System.out.println("Try again");
            }
        } while (input < min || input > max);
        return  input;
    }

    public double getDouble(double min, double max){
        System.out.println("enter a number between "+ min + " " +max);
        double input;

        do{
            input = scanner.nextDouble();
            if (input > min && input < max){
                System.out.println("You entered " + input);
            } else {
                System.out.println("Try again");
            }
        } while (input < min || input > max);
        return  input;
    }

    public double getDouble(){
        double input = scanner.nextDouble();
        return input;
    }

    public int getInt(){
        int input = scanner.nextInt();
        return input;
    }

}



