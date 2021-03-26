package camchern.anchana.Test01.GUI2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class GradientFills extends ShapePanel {
    static  final long serialVersionUID = 4397914223424048061L;
    private GradientPaint gradientPaint = new GradientPaint(100, 100, Color.RED, 10, 10,Color.YELLOW, true);
 //   private Shape getCircle;

    private Ellipse2D.Double circle = new Ellipse2D.Double(10,10,100,100);
    private Rectangle2D.Double square = new Rectangle2D.Double(10,10,10,10);

    public  void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        drawGradientCircle(g2d);
    }

    protected  void drawGradientCircle(Graphics2D g2d) {
        g2d.setPaint(gradientPaint);
        g2d.fill(circle);
        g2d.setPaint(Color.BLACK);
        g2d.draw(circle);
    }

    public static void createAndShowGUI() {
        JFrame window = new JFrame("Graphics Demo");
        GradientFills content = new GradientFills();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(content);
        window.setLocation(100,75);
        window.setSize(300,100);
        window.setVisible(true);

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
