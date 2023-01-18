import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Main {
    public static String readFileAsString(String filename) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filename)));
    }
    public static void main(String[] args) throws IOException {

        String string = new String(Files.readAllBytes(Paths.get("C:\\Users\\text.txt")));  //C:\\Users\\user\\Desktop\\text.txt")));
        String[] filter = string.split("\\W\\s");
        int len = filter.length;
        int n = 0;
        for (int i = 0; i < len; i++) {
            if (Integer.parseInt(filter[i]) == 0) {
                break;
            } else if (Integer.parseInt(filter[i]) % 2 == 0) {
                n++;
            }
        }
        System.out.println(n);
    }
}
