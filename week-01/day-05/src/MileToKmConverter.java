import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        System.out.println("Insert distance in mi: ");
        Scanner scanner = new Scanner(System.in);
        Double user = scanner.nextDouble();
        double km = (user * 1.609344);
        System.out.println(user + " miles = " + km + " km");

    }

}
