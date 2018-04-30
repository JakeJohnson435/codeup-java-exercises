import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        String userInput;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something: ");
        userInput = sc.nextLine();
        System.out.println("You entered: --> \"" + userInput + "\" <--");

        int userNumber;
        Scanner scNumber = new Scanner(System.in);
        System.out.print("Enter a number: ");
        userNumber = scNumber.nextInt();
        System.out.println("You entered: \"" + userNumber + "\"");

        String firstWord;
        String secondWord;
        String thirdWord;
        Scanner scThreeWords = new Scanner(System.in);
        System.out.print("Enter three words: ");
        firstWord = scThreeWords.next();
        secondWord = scThreeWords.next();
        thirdWord = scThreeWords.next();
        System.out.println("You entered: ");
        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);

        String sentence;
        Scanner scSentence = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        sentence = scSentence.nextLine();
        System.out.println("You typed the sentence: \""+ sentence + "\"");

        String roomLength;
        String roomWidth;
        Scanner scRoomSize = new Scanner(System.in);
        System.out.print("Enter the length of the room: ");
        roomLength = scRoomSize.nextLine();
        System.out.print("Enter the width of the room: ");
        roomWidth = scRoomSize.nextLine();
        int lengthNumber = Integer.parseInt(roomLength);
        int widthNumber = Integer.parseInt(roomWidth);
        System.out.println("The area of the room is: " + lengthNumber*widthNumber);
        System.out.println("The perimeter of the room is: " + (2*lengthNumber + 2*widthNumber));
    }
}
