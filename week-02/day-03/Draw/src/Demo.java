import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Demo {
    public static void locationAndColorSetter(int x, int y, int size, Graphics graphics) {
        Color[] colors = {Color.RED, Color.orange, Color.yellow, Color.GREEN, Color.BLUE, new Color(75, 0, 130), new Color(238, 130, 238)};
        ArrayList<Color> colorList = new ArrayList<Color>(Arrays.asList((colors)));
        ArrayList<Color> reversedColor = new ArrayList<Color>();
        for (int g = colors.length - 1; g >= 0; g--) {
            reversedColor.add(colorList.get(g));
        }

        for (int i = 0; i < colors.length; i++) {
            Color c = colors[i];
            graphics.setColor(c);
            graphics.fillRect(x, y, size, size);
            x += 1;
            y += 1;
            size -= 5;

        }

    }


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

                if (((j % 2) != 0) && ((i % 2) == 0) || ((j % 2) == 0) && ((i % 2) != 0)) {
                    locationAndColorSetter(size * j,size * i, size,graphics);
                } else {

                    locationAndColorSetter(size * j,size * i, size,graphics);

                }

            }

        }
    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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