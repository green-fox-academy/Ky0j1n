import java.util.ArrayList;
import java.util.Scanner;

// Write a program that asks for a number
// It would ask this many times to enter an integer
// If all the integers are entered it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4
public class ParametricAverage {

    public static void main(String[] args) {
        System.out.println("How many numbers would you like to use?");
        Scanner scanner = new Scanner(System.in);
        int amountOFNum = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int sum=0;
        int average=0;
        for ( int i = 1; i < amountOFNum; i++){
            System.out.println("Next number, please!");
                numbers.add(scanner2.nextInt()) ;
        }
        for (int number : numbers ){
            sum += number;
        }
        average = sum / amountOFNum;

        System.out.println("Sum of the numbers: " + sum );
        System.out.println("Average ofthe numbers: " + average);
    }

}
