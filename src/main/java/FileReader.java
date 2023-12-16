import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReader {
    public static void main(String[] args) {
        readEveryOtherLine("E:\\PROGRAMOWANIE\\KURSY\\PROJEKTY\\Files-Exceptions\\src\\main\\resources\\data.txt");
    }
    public static void readEveryOtherLine(String filePath){
        try {
            String contentOfTheFile = Files.readString(Paths.get(filePath));
            int allLinesNumber = (int) contentOfTheFile.lines().count();
            int lineNum = 0;
            while (lineNum < allLinesNumber){
                if (lineNum % 2 != 0){
                    System.out.println(Files.readAllLines(Path.of(filePath)).get(lineNum));
                }
                lineNum++;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
