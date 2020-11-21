import java.sql.SQLOutput;
import java.util.Scanner;

// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//
public class DrawChessTable {
    public static void main(String[] args) {
        System.out.println("How many column would you like?");
        Scanner scanner = new Scanner(System.in);
        int column = scanner.nextInt();
        System.out.println("How many row would you like?");
        Scanner scanner2 = new Scanner(System.in);
        int row = scanner2.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if ((i % 2 == 0) && (j == 1) || (i % 2 != 0) && (j == column)) {

                    System.out.print(" ");
                } else {
                    System.out.print("%");
                }
            }
            System.out.println();
        }
    }
}
