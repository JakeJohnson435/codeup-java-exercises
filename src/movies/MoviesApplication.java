package movies;
import java.util.Scanner;
import util.Input;

public class MoviesApplication {

    public static Movie[] films = MoviesArray.findAll();
    public static String genre;
    public static void movieList(){

        for (int i=0; i<films.length; i++){
            System.out.println(films[i].getName() + "-" + films[i].getCategory());
        }
    }

    public static void movieGenre(){

        for (int i =0; i<films.length; i++){
            if (genre.equalsIgnoreCase(films[i].getCategory())){
                System.out.println(films[i].getName() + "-" + films[i].getCategory());
            }
        }
    }



    public static void main(String[] args) {

        int userChoice;
        Input input = new Input();

        do{

            System.out.println("Enter an option");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println();
            userChoice = input.getInt();

                if (userChoice == 1){
                    movieList();
                } else if (userChoice == 2){
                    genre = "animated";
                    movieGenre();
                } else if (userChoice == 3){
                    genre = "drama";
                    movieGenre();
                } else if (userChoice == 4){
                    genre = "horror";
                    movieGenre();
                } else if (userChoice == 5){
                    genre = "scifi";
                    movieGenre();
                }

        } while (userChoice != 0);
    }
}
