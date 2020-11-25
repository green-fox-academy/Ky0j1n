import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {
    public static void rectangelsColor(int width, int height, Graphics location){

        Color[] colors = {Color.RED, Color.BLUE, Color.PINK, Color.GREEN};

        for(int i = 0; i < colors.length; i++){
            int j = i*10;
            location.setColor(colors[i]);
            location.drawRect(((WIDTH)/2)  - ((width+j)/2) , (HEIGHT/2)-((height+j)/2),width +j,height+j);

            }



    }

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
   rectangelsColor(30,30,graphics);

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
