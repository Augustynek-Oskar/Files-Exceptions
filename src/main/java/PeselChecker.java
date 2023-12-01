public class PeselChecker {
    public static void main(String[] args) {
        getPeselLength("01261700298");
        getPeselDataTypeValidation(111);
    }
    public static void getPeselLength(String pesel){
        try {
            if (pesel.length() != 11){
                throw new IllegalLengthException("Incorrect length!");
            }
            else {
                System.out.println("Length is correct");
            }
        }
        catch (IllegalLengthException e){
            System.out.println(e.getMessage());
        }
    }
    public static void getPeselDataTypeValidation(String pesel){
        try {
            if (pesel ){
                System.out.println("Data type is correct");
            }
            else {
                throw new WrongTypeOfDataException("Incorrect data type!");
            }
        }
        catch (WrongTypeOfDataException e){
            System.out.println(e.getMessage());
        }

    }
}
