
// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {
    public static int lineCounter(String file) {
        List<String> content = new ArrayList<>();
        int counter = 0;
            Path filePath = Paths.get(file);
        try {
          content = Files.readAllLines(filePath);
        } catch (Exception e) {
            System.out.println("0");
        }
            for (int i = 0; i < content.size(); i++) {
                counter++;
            }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(lineCounter("src/my-file"));
    }
}
