import java.util.Scanner;

// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0
public class DivideByZero {
    public static Integer divideTen(int number) {
        int divided = 10 / number;
        return divided;
    }

    public static void main(String[] args) {
        System.out.println("How should I portion your 10?");
        Scanner scanner = new Scanner(System.in);
        int divideWith = scanner.nextInt();
        try {
            System.out.println(divideTen(divideWith));
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }


    }
}
