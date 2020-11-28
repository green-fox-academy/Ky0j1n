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

        int size = 7;
        for (int i = 0; i < size-1; i++) {
            for (int j = i; j < size; j++) {
                System.out.print("$");
            }
            for (int g = 1; g < (i * 2); g++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int x = size / 2; x > 0; x--) {
            for (int y = x; y > size; y--) {
                System.out.print("$");
            }
            for (int xx = size /2; xx >0; xx--){
                System.out.println("*");
            }
            System.out.println("");

        }
    }
}
