import java.util.Scanner;

// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5
public class CountFromTo {
    public static void main(String[] args) {
        System.out.println("Give me your soul / two numbers!");
        System.out.println("Wise choice! Your first number is:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Second number:");
        Scanner scanner2 = new Scanner(System.in);
        int b = scanner2.nextInt();
        if (b < a) {
            System.out.println("The second number should be bigger");
        } else {
            while (a <= b) {
                System.out.println(a);
                a++;

            }

        }


    }
}
