import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String input = scanner.nextLine();
        System.out.println("Hello, " + input + "!");



    }

    }
