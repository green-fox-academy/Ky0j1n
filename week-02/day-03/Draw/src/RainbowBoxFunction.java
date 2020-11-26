import javax.swing.*;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class RainbowBoxFunction {

    public static void rainbow(int size, Color color, Graphics location) {
        location.setColor(color);
        location.fillRect((WIDTH / 2) - (size / 2), (HEIGHT / 2) - (size / 2), size, size);


    }



    public static Double sizeCounter(double WIDTH) {
        double size = WIDTH / 7;
        return size;
    }


    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).
//        rainbow(50,Color.cyan,graphics);
        Color[] colors = {Color.RED, Color.orange, Color.yellow, Color.GREEN, Color.BLUE, new Color(75, 0, 130), new Color(238, 130, 238)};
        ArrayList<Color> colorList= new ArrayList<Color>(Arrays.asList((colors)));
        ArrayList<Color> reversedColor = new ArrayList<Color>();
        for( int g = colors.length-1; g >=0; g--){
          reversedColor.add(colorList.get(g));
        }

        for (int i = 0; i < colors.length; i++) {
            double j = i * sizeCounter(WIDTH);
            Color c = colors[i];
            rainbow((int) (WIDTH - j), c, graphics);

        }


//        UNDER HERE IS THE SOLUTION for THE EXERCISE.

//        for (int i = 0; i < colors.length; i++) {
//            int j = i * 45;
//            Color c = colors[i];
//            rainbow((315 - j), c, graphics);
//        }


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