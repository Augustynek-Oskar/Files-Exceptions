import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReverseContent {

    public void showReversedFileContent(String filePath){
    try {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String contentOfTheFile = Files.readString(Paths.get(filePath));
        String reverse = "";




    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    }
}
