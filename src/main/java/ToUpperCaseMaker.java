import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ToUpperCaseMaker {
    public static void main(String[] args) {

    }
    public static void getUpperCase(String filePath, String newFilePath){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String fileContent = Files.readString(Path.of(filePath));
            System.out.println(fileContent);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
