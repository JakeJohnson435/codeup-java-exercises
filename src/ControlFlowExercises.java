public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

        int i2 = 0;
        do {
            if (i2 % 2 == 0){
                System.out.println(i2);}
            i2++;
        } while (i2 <= 100);
    }
}
