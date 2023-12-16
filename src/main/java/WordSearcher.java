import javax.sound.midi.Track;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WordSearcher extends FileMaker{
    public static void searchForWord(String filePath, String word) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String contentOfTheFile = Files.readString(Paths.get(filePath));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
                if (line.contains(word)){
                    System.out.println("Znaleziono słowo");
                    reader.close();
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
