package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    boolean val;


    public String getString() {
        String input = scanner.next();
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
        int value = getInt();
        if (value < min || value > max) {
            return getInt(min, max);
        }
        return value;
    }

    public double getDouble(double min, double max){
        System.out.println("enter a number between "+ min + " " +max);
        double value = getDouble();
        if (value < min || value > max) {
            return getDouble(min, max);
        }
        return value;
    }

    public double getDouble(){
        try {
            return Double.valueOf(getString());
        } catch(NumberFormatException e) {
            System.out.println("Must input a double.");
            return getDouble();
        }
    }

    public int getInt(){
        try {
            return Integer.valueOf(getString());
        } catch(NumberFormatException e) {
            System.out.println("Must input an integer.");
            return getInt();
        }
    }

    public int getBinary(){
        int number = Integer.valueOf(getString(), 2);
        System.out.println(number);
        return number;
    }

    public int getHex(){
        int number = Integer.valueOf(getString(), 16);
        System.out.println(number);
        return number;
    }

}



