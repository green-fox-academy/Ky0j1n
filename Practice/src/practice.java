import java.lang.reflect.Array;
import java.util.Arrays;

// - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements of `numbers`
// - Print the elements of the reversed `numbers`
public class practice {
    public static void main(String[] args) {
     int[] numbers = {3, 4, 5, 6, 7};
     int[] reversedNumbers = new int[numbers.length];

        for (int i = numbers.length-1; i >= 0 ; i++) {
            int j=0;
            reversedNumbers[j] = numbers[i];
            j++;
        }
        System.out.println(Arrays.toString(reversedNumbers));
        }

}


