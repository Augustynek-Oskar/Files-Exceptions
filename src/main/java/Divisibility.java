import java.util.Arrays;
public class Divisibility {
    public static void main(String[] args) {
        int [] numbersArray = {0, 1, 2 ,3 ,4 ,6};

        areElementsDivisibleByThree(numbersArray);

    }
    public static void areElementsDivisibleByThree(int[] values){
        for (int number : values) {
            try {
                isDivisibleByThree(number);
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void isDivisibleByThree (int number){
        if (number % 3 != 0){
            throw new IllegalArgumentException(number + ": nie jest podzielne przez 3!");
        }
        else System.out.println(number + ": jest podzielne przez 3!");
    }
}
