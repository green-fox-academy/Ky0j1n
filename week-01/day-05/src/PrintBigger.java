import java.util.Scanner;

// Write a program that asks for two numbers and prints the bigger one
public class PrintBigger {
    public static void main(String[] arg) {
        System.out.println("Do your magic and give me 2 numbers.");
        System.out.println("First number");
        Scanner input1 = new Scanner(System.in);
        int a = input1.nextInt();
        System.out.println("Second number");
        Scanner input2 = new Scanner(System.in);
        int b = input2.nextInt();
        if (a > b) {
            System.out.println(a + " is the bigger number.");
        } else {
            System.out.println(b + " is the bigger number");
        }
    }
}
