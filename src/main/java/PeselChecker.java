public class PeselChecker {
    public static void main(String[] args) throws IllegalLengthException {

        checkIfPeselLengthIsCorrect("12345678901");
        checkIfPeselDataTypeIsCorrect("12345678901");

    }
    public static void checkIfPeselLengthIsCorrect(String pesel) throws IllegalLengthException {
        if (pesel == null) throw new IllegalLengthException("Pesel cannot be null!");

        if (pesel.length() != 11) throw new IllegalLengthException("Incorrect length!");

        else System.out.println("Length is correct");
    }
    public static void checkIfPeselDataTypeIsCorrect(String pesel) {
        if (pesel == null) throw new WrongTypeOfDataException("Pesel cannot be null!");

        if (pesel.matches(".*[a-z].*")) throw new WrongTypeOfDataException("Illegal data type in your pesel!");

        else System.out.println("Correct data type format!");
    }
}
