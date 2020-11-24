
//  Create the usual class wrapper
//  and main method on your own.

import java.util.Scanner;

// - Create a function called `factorio`
//   that returns it's input's factorial
public class Factorial {

    public static int factorio(int input) {

        int result = 1;
        for (int i = 1; i <= input; i++) {
            result *= i;

        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("How many factorials would you like my frrrrrriend?");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(factorio(a));
    }
}
