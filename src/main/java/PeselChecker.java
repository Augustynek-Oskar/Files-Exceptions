public class PeselChecker {
    public static void main(String[] args) {
        getPeselLengthValidation("1235678911");
    }
    public static void getPeselLengthValidation(String pesel){
        try {
            if (pesel.length() != 11){
                throw new IllegalLengthException("Incorrect length!");
            }
            System.out.println("Length is correct");
        }
        catch (IllegalLengthException e){
            System.out.println(e.getMessage());
        }
    }
    public static void getPeselDataTypeValidation(String pesel){
        try {
            if (pesel != String){
                throw new WrongTypeOfDataException("Incorrect data type!");
            }
        }
        catch (WrongTypeOfDataException e){
            System.out.println(e.getMessage());
        }

    }
}
