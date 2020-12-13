import java.util.ArrayList;
import java.util.List;

////  Create a function that takes an array of numbers as a parameter
////  and returns an array of integers where every integer is unique (occurs only once)
//
////  Example
//    System.out.println(findUniqueItems(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
//            //  should print: `[1, 11, 34, 52, 61]`
//            }
public class Unique {
    public int[] unique(int[] arrayOfNumbers) {
//        Bubble search
        int container = 0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            for (int j = 1; (j < arrayOfNumbers.length - i); j++) {
                if (arrayOfNumbers[j - 1] > arrayOfNumbers[j]) {
                    container = arrayOfNumbers[j - 1];
                    arrayOfNumbers[j - 1] = arrayOfNumbers[j];
                    arrayOfNumbers[j] = container;
                }
            }

        }
//       unique
        List<Integer> resultList = new ArrayList<>();
        int lastNumber = 0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] != lastNumber) {
                lastNumber = arrayOfNumbers[i];
                resultList.add(lastNumber);
            }
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }


    public static void main(String[] args) {

        int[] numbers = {1, 11, 34, 11, 52, 61, 1, 34};
        Unique test = new Unique();
        for(int unique : test.unique(numbers)){
            System.out.println(unique);
        }
    }
}
