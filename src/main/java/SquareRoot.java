public class SquareRoot {
    public static double getSquareRoot (double number){
        if (number < 0){
            throw new IllegalArgumentException();
        }
        else {
            System.out.println(Math.sqrt(number));
        }
        return Math.sqrt(number);
    }
}
