
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

// Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.
// The path parameter should be a string that describes the location of the file you wish to modify
// The word parameter should also be a string that will be written to the file as individual lines
// The number parameter should describe how many lines the file should have.
// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'
// The function should not raise any errors if it could not write the file.
public class WriteMultipleLines {
    public static void addWords(Path path, String word, int howManyRows) throws IOException {
        List<String> theWord = new ArrayList<String>();
        for (int i = 0; i < howManyRows - 1; i++) {
            theWord.add(word);
        }
        theWord.add(word);

        Files.write(path, theWord);
    }

    public static void main(String[] args) {

        Path filePath = Paths.get("apple.txt");
        String word = "apple";
        int number = 5;
        try {
            addWords(filePath, word, number);
        } catch (IOException e) {
            System.out.println("");
        }
    }
}
