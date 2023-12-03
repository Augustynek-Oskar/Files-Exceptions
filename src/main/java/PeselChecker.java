public class PeselChecker {
    public static void main(String[] args) throws IllegalLengthException {

        checkIfPeselLengthIsCorrect("12345678901");
        getPeselDataTypeValidation("1236789011");

    }
    public static void checkIfPeselLengthIsCorrect(String pesel) throws IllegalLengthException {

        if (pesel == null) throw new IllegalLengthException("Pesel cannot be null!");

        if (pesel.length() != 11) throw new IllegalLengthException("Incorrect length!");

        else System.out.println("Length is correct");

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
