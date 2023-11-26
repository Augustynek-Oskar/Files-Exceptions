import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NumberOfCharacters {
    public static void main(String[] args) {
        countCharacters("E:\\PROGRAMOWANIE\\KURSY\\PROJEKTY\\Files-Exceptions\\src\\main\\resources\\data.txt");
    }
    public static void countCharacters(String filePath){
        try {
            String contentOfTheFile = Files.readString(Paths.get(filePath));
            int numberOfCharacters = (int) contentOfTheFile.chars().count();
            System.out.println(numberOfCharacters);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
