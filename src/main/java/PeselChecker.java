public class PeselChecker {
    public static void main(String[] args) {
        boolean numeric = true;


        checkIfPeselLengthIsCorrect("01261700298");
        getPeselDataTypeValidation("1236789011");
    }
    public static void checkIfPeselLengthIsCorrect(String pesel){
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
    public static void getPeselDataTypeValidation(String pesel) {
        try {
            if (pesel.matches(".*[a-z].*")){
            throw new WrongTypeOfDataException("Illegal data type in your pesel!");
            }
            else System.out.println("Correct data type format!");
        }catch (WrongTypeOfDataException e){
            System.out.println(e.getMessage());
        }



    }
}
