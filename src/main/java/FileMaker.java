import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileMaker {
    public static void main(String[] args){

        createFile("E:\\PROGRAMOWANIE\\KURSY\\PROJEKTY\\Files-Exceptions\\src\\main\\resources\\data.txt");
        writeInFile("E:\\PROGRAMOWANIE\\KURSY\\PROJEKTY\\Files-Exceptions\\src\\main\\resources\\data.txt", "Kurs \nJava \nLekcja6 \nPliki \nWyjątki \nPliki \nKoniec pliku" );

    }
    public static void createFile(String filePath){
        try {
            File file = new File(filePath);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            }
        }catch (IOException e){
            System.out.println("An Error occured");
            e.printStackTrace();
        }
    }
    public static void writeInFile(String filePath, String text){
        try {
            Files.writeString(Paths.get(filePath), text);

        } catch (IOException e){

            System.out.println("Error");
            e.printStackTrace();
        }


    }
}
