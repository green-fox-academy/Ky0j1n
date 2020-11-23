// Create the usual class wrapper and main method on your own.

import java.util.Scanner;

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter
public class Summing {

    public static int sum(int input) {
        int result = 0;
        for (int i = 0; i < input; i++) {
            result += input;

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("How many numbers shall I sum for you?");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(sum(num));

    }
}
