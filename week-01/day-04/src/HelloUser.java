import java.util.Scanner;
// Modify this program to greet user instead of the World!
// The program should ask for the name of the user
public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String input = scanner.nextLine();
        System.out.println("Hello, " + input + "!");



    }

    }
