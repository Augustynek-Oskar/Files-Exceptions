import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ToUpperCaseMaker {
    public static void main(String[] args) {
        getUpperCase("E:\\PROGRAMOWANIE\\KURSY\\PROJEKTY\\Files-Exceptions\\src\\main\\resources\\data.txt", "E:\\PROGRAMOWANIE\\KURSY\\PROJEKTY\\Files-Exceptions\\src\\main\\resources\\output.txt");
    }
    public static void getUpperCase(String filePath, String newFilePath){
        try {
            String fileContent = Files.readString(Path.of(filePath));
            String fileContentUpperCase = fileContent.toUpperCase();
            File file = new File(newFilePath);
            Files.writeString(Path.of(newFilePath), fileContentUpperCase);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
