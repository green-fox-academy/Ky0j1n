import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.List;

// Write a program that opens a file called "my-file.txt", then prints
// each line from the file.
// If the program is unable to read the file (for example it does not exist),
// then it should print the following error message: "Unable to read file: my-file.txt"
public class PrintEachLine {
    public static void main(String[] args) {
                List<String> content = new ArrayList<>();
            Path filePath = Paths.get("src/my-file");
        try {
           content = Files.readAllLines(filePath);
        } catch (Exception e) {
            System.out.println("Unable to read file: my-file.txt");
        }
        for(String line: content){
            System.out.println(line);
        }
    }
}
