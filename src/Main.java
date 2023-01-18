import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class Main {
    public static String readFileAsString(String filename) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filename)));
    }
    public static void main(String[] args) throws IOException {

        String string = new String(Files.readAllBytes(Paths.get("C:\\Users\\user\\Desktop\\text.txt")));
        //String regex = "[\\w\\s,]";
        String[] filter = string.split("");
        int len = filter.length;

        System.out.println(len);
        int i = 1;
       for () {

            if (len == 0) {
                break;
            } else if (len > 1) {

            }
            System.out.println(len); //191
        }
    }
}