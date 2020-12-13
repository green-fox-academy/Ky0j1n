//Create a function named isAnagram() following your current language's style guide. It should take two strings and return a boolean value depending on whether it's an anagram or not.
//
//        Examples
//        input 1	input 2	output
//        "dog"	"god"	true
//        "green"	"fox"	false


import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String firstWord, String secondWord) {
        boolean result = false;
        char[] firstCharArray = new char[firstWord.length()];
        char[] secondCharArray = new char[secondWord.length()];
        if (firstWord.length() != secondWord.length()) {
            result = false;
        } else {
            for (int i = 0; i <firstWord.length() ; i++) {
                firstCharArray[i] = firstWord.charAt(i);

            }
            for (int i = 0; i <firstWord.length() ; i++) {
                secondCharArray[i] = secondWord.charAt(i);
            }
            Arrays.sort(firstCharArray);
            Arrays.sort(secondCharArray);
            for (int i = 0; i <firstCharArray.length ; i++) {
                    if(firstCharArray[i] != secondCharArray[i]){
                       result = false;
                    }else {
                        result = true;
                    }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Anagram test = new Anagram();
        String input1 = "dog";
        String input2 = "god";
        String input3 = "green";
        String input4 = "fox";
        System.out.println(test.isAnagram(input1, input2));
        System.out.println(test.isAnagram(input3, input4));
    }
}
