package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Enter a string");
        input.getString();
        System.out.println("Enter yes or no");
        input.yesNo();
        System.out.println("Enter a number");
        input.getInt();
        System.out.println("Enter a double");
        input.getDouble();
        System.out.println("Enter a binary number to get it as an Integer");
        input.getBinary();
        System.out.println("Enter a hex number to get it as an Integer");
        input.getHex();
    }
}
