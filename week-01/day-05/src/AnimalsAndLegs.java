import java.util.Scanner;
// Write a program that asks for two integers
// The first represents the number of chickens the farmer has
// The second represents the number of pigs owned by the farmer
// It should print how many legs all the animals have
public class AnimalsAndLegs {
    public static void main(String[] args){
        System.out.println("How many chicen do you have my friend?");
        Scanner scanner = new Scanner(System.in);
        int chicken = scanner.nextInt();
        System.out.println("How many piggy do you have ?");
        int piggy =  scanner.nextInt(System.in);
    }
}
