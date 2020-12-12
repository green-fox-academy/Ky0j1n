// Write a program that opens a file called "my-file.txt", then prints
// each line from the file.
// If the program is unable to read the file (for example it does not exist),
// then it should print the following error message: "Unable to read file: my-file.txt"


// Write a function that takes a filename as string,
// Write a function that is able to manipulate a file
// By writing your name into it as a single line
// The file should be named "my-file.txt"
// In case the program is unable to write the file,
// It should print the following error message: "Unable to write file: my-file.txt"

import javax.swing.*;
import java.io.IOException;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class practice {
    public static void main(String[] args) {
        practice a = new practice();
            a.addString("Mate");
            a.addToAnExictentFile("Aoi");
            a.addToAnExictentFile("Hanako");
            a.getFileContent();

    }

    public void addToAnExictentFile(String lineToAdd){
            List<String> content = new ArrayList<>();
            List<String> contentOfTheNewFile = new ArrayList<>();
            content.addAll(fileContent());
            content.add(lineToAdd);

        try {
            Files.write(pathToTheUsedFile(),content);
        } catch (IOException e) {
            System.out.println("unable to writte file");
        }


    }
    public Path pathToTheUsedFile(){
        Path filePath = Paths.get("src/my-file.txt");
        return filePath;
    }
    public void addString(String writeALine){
        List<String> content = new ArrayList<>();
        content.add(writeALine);
            Path filePath = Paths.get("src/my-file.txt");
        try {
            Files.write(filePath,content);
        } catch (IOException e) {
            System.out.println("no file!");
        }


    }

    public List <String> fileContent(){
        Path filePath = Paths.get("src/my-file.txt");
        List<String> content = new ArrayList<>();
        try {
            content.addAll(Files.readAllLines(filePath));
        } catch (IOException e) {
            System.out.println("No, file!");
        }
        return content;
    }

    public void  getFileContent(){
        int order = 1;
        Path filePath =  Paths.get("src/my-file.txt");
        List<String> content = new ArrayList<>();
        try {
            content.addAll(Files.readAllLines(filePath));
        } catch (IOException e) {
            System.out.println("can't reach the file");
            System.exit(-1);
        }
        for(String line : content){
            System.out.println(order + " $ " + line);
            order++;
        }

    }



}




