import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TxtReader{
    public static void main(String[] args) {
        readFile("E:\\PROGRAMOWANIE\\KURSY\\PROJEKTY\\Files-Exceptions\\src\\main\\resources\\data.txt");
    }
    public static void readFile(String filePath){
        try {
            String contentOfTheFile = Files.readString(Paths.get(filePath));
            System.out.println(contentOfTheFile);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
