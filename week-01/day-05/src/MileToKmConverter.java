import java.util.Scanner;
// Write a program that asks for a double that is a distance in miles,
// then it converts that value to kilometers and prints it

public class MileToKmConverter {
    public static void main(String[] args) {
        System.out.println("Insert distance in mi: ");
        Scanner scanner = new Scanner(System.in);
        Double user = scanner.nextDouble();
        double km = (user * 1.609344);
        System.out.println(user + " miles = " + km + " km");

    }

}
