import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Write a function that is able to manipulate a file
// By writing your name into it as a single line
// The file should be named "my-file.txt"
// In case the program is unable to write the file,
// It should print the following error message: "Unable to write file: my-file.txt"
public class WriteSingleLine {
    public static void addName(String addName) {
        List<String> name = new ArrayList<>();
            name.add(addName);
            Path filePath = Paths.get("my-file.txt");
        try{
            Files.write(filePath, name);
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }

    }

    public static void main(String[] args) {

        String name = "Mate";
        addName(name);
    }
}
