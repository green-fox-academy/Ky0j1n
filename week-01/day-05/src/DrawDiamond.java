// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was
public class DrawDiamond {
    public static void main(String[] args) {
        int a = 4;
        for (int i = 1; i <= a; i++) {
            for (int j = i; j < a; j++) {
                System.out.print(" ");
            }
            for (int g = 1; g < (i * 2); g++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}

