import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ToUpperCaseMaker extends FileMaker{
    public static void main(String[] args) {

        createFile("E:\\PROGRAMOWANIE\\KURSY\\PROJEKTY\\Files-Exceptions\\src\\main\\resources\\output2.txt");
        writeInFile("E:\\PROGRAMOWANIE\\KURSY\\PROJEKTY\\Files-Exceptions\\src\\main\\resources\\output2.txt", getUpperCase("E:\\PROGRAMOWANIE\\KURSY\\PROJEKTY\\Files-Exceptions\\src\\main\\resources\\data.txt"));


    }
    public static String getUpperCase(String filePath){
        try {
            String fileContent = Files.readString(Path.of(filePath));
            String fileContentUpperCase = fileContent.toUpperCase();
            return fileContentUpperCase;

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
