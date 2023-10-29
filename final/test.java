import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class test {

    public static void main(String[] args) {
        try {
            String content = new String(Files.readAllBytes(Paths.get("./resources/m1.in")));
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
