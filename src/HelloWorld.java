public class HelloWorld {
    public static void main(String[] args) {

        int myFavoriteNumber = 8;
        System.out.println("My favorite number is " + myFavoriteNumber);

        String myString = "3.14159";
        System.out.println(myString);

        float myNumber = 314;
        System.out.println(myNumber);

//        int x = 4;
//        x+=5;
//        System.out.println(x);

//        int x = 3;
//        int y =4;
//        y = y*=x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x = x/=y;
        y = y-=x;
        System.out.println(y);
        System.out.println(x);
    }
}
