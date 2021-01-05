package com.greenfox.exercise11;
/*Find a random Wikipedia article and copy the contents to a txt file.

        Create a Stream expression which reads all text from this file, and prints the 100 most common words in descending order.
        Keep in mind that the text contains punctuation characters which should be ignored. The result should be something like this:*/

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class Main {
    public static void main(String[] args) {

            Path filePath = Paths.get("C:\\Users\\marko\\Documents\\greenfox\\Ky0j1n\\week -06\\day-01\\src\\com\\greenfox\\exercise11\\random.txt");
        try {
            List<String> lines = Files.readAllLines(filePath);

           List<String> onlyAlphabeticalCharacters = lines.stream()
                                            .map(line -> line.replaceAll("[^a-zA-Z0-9]", ""))
                                            .collect(Collectors.toList());

                                onlyAlphabeticalCharacters.stream()
                                        .

            Map<String, Integer> descent = wordsOccurrences.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (element1, element2) -> element1, LinkedHashMap::new));

                     Map<String, Integer> first100 = (Map<String, Integer>) descent.entrySet().stream()
                                                       .limit(100);

            System.out.println(first100);


        } catch (Exception e) {
            System.out.println("Uh-oh, could not read the file!");
        }


    }

}
