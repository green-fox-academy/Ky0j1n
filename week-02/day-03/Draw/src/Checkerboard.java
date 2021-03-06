import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static Integer sizeOfTheSquares(int inputsize) {
        int size = inputsize / 8;
        return size;
    }
    public static Double sizeCounter(double WIDTH) {
        double size = WIDTH / 7;
        return size;
    }

    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int size = sizeOfTheSquares(WIDTH);


        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {

                if(((j%2) !=0) && ((i%2)==0) || ((j%2) ==0) && ((i%2) !=0)){
                    graphics.setColor(Color.YELLOW);
                    graphics.fillRect(size * j, (size * i),size,size);

                }else{
                    graphics.setColor(Color.GREEN);
                    graphics.fillRect(size * j, (size * i),size,size);

                }

            }

        }
    }

    // Don't touch the code below
    static int WIDTH = 1200;
    static int HEIGHT =1200;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}