
// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static int lineCounter(String file) {
        int counter = 0;
        try {
            Path filePath = Paths.get(file);
            List<String> lines = Files.readAllLines(filePath);

            for (int i = 0; i < lines.size(); i++) {
                counter++;
            }
        } catch (Exception e) {
            System.out.println("0");
        }

        return counter;
    }

    public static void main(String[] args) {
        lineCounter("my-file.txt");
    }
}
