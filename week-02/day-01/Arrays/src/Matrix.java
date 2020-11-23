import java.util.Scanner;

// - Create (dynamically*) a two dimensional array
//   with the following matrix**. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output
// * length should depend on a variable
// ** Relax, a matrix is just like an array
public class Matrix {
    public static void main(String[] args) {
        System.out.println("How many rows should your Matrix be?");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();

        int[][] array = new int[row][row];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    System.out.print("1");
                } else
                    System.out.print(array[i][j]);

            }
            System.out.println();
        }
    }
}
