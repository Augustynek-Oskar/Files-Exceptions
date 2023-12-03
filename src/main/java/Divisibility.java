import java.util.Arrays;

public class Divisibility {
    public static void main(String[] args) {
        int [] numbersArray = {1, 2 ,3 ,4 ,6};
        isNumberDivisibleByThree(numbersArray);
    }

    public static void isNumberDivisibleByThree(int[] values){
        for (int number : values){
            try {
                if (number % 3 == 0) System.out.println(number + " jest podzielna przez 3!");
                else throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException e){
                System.out.println(number + " nie jest podzielne przez 3!");
            }
        }
    }
}
