import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReverseContent {
    public static void main(String[] args) {
        showReversedFileContent("E:\\PROGRAMOWANIE\\KURSY\\PROJEKTY\\Files-Exceptions\\src\\main\\resources\\data.txt");
    }

    public static void showReversedFileContent(String filePath){
    try {
        String contentOfTheFile = Files.readString(Paths.get(filePath));
        int allLinesCount = (int) contentOfTheFile.lines().count();
        while (allLinesCount >= 1){
            String line = Files.readAllLines(Path.of(filePath)).get(allLinesCount - 1);
            System.out.println(line);
            allLinesCount--;
        }
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    }
}
