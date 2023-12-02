import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReverseContent {
    public static void main(String[] args) {

        final String PATH = "E:\\PROGRAMOWANIE\\KURSY\\PROJEKTY\\Files-Exceptions\\src\\main\\resources\\data.txt";

        String content = readFromFile(PATH);
        reverseContent(content);

    }

    public static String readFromFile(String path){
        try {
            return Files.readString(Paths.get(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void reverseContent(String content){
        String[] split = content.split(System.lineSeparator());
        for (int i = split.length-1;i >= 0; i--){
            System.out.println(split[i]);
        }

    }

}
