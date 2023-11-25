import java.io.File;
import java.io.IOException;

public class FileMaker {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("E:\\PROGRAMOWANIE\\KURSY\\PROJEKTY\\Files-Exceptions\\src\\main\\resources\\data.txt");
            if (file.createNewFile()){
                System.out.println("File created: " + file.getName());
            }
        }catch (IOException e){
            System.out.println("Error.");
            e.printStackTrace();

        }
    }
}
