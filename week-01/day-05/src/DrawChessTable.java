import java.sql.SQLOutput;

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
        int column = 5;
        int row = 8;
        for (int i = 1; i <= column; i++) {
            for (int j = 1; j <= row; j++) {
                if ((i % 2) != 0 && i< row) {
                    System.out.print("%");
                }

            }
            System.out.println();
        }
    }
}
