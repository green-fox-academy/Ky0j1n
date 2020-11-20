import java.util.Scanner;

// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4
public class AverageOfInput {
    public static void main(String[] args) {
        System.out.println("Please, provide me 5 numbers!");
        System.out.println("First number:");
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        System.out.println("Second number:");
        Scanner scanner2 = new Scanner(System.in);
        int b = scanner2.nextInt();
        System.out.println("Third number:");
        Scanner scanner3 = new Scanner(System.in);
        int c = scanner3.nextInt();
        System.out.println("Fourth number:");
        Scanner scanner4 = new Scanner(System.in);
        int d = scanner4.nextInt();
        System.out.println("Fifth number:");
        Scanner scanner5 = new Scanner(System.in);
        int e = scanner5.nextInt();
        int sum = (a + b + c + d + e);
        double average = (sum / 5);
        System.out.println("Sum: " + sum + ",  " + "Average: " + average);


    }
}
