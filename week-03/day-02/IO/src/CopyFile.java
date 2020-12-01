import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful
public class CopyFile {
    public static boolean isCopied(String fileName, String whereToCopy) {

        Path filePath = Paths.get(fileName);

        Path filePathDest = Paths.get(whereToCopy);
        try {
            Files.copy(filePath, filePathDest);
            return true;
        } catch (IOException e) {
            return false;
        }


    }

    public static void main(String[] args) {
        String into = "appleCopy.txt";
        String copy = "apple.txt";
        System.out.println(isCopied(copy, into));


    }
}
