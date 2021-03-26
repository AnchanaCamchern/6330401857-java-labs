package camchern.anchana.Test01.GUI2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class ShapePanel extends JPanel {
    static  final long serialVersionUID = 4397914223424048061L;
    public Rectangle2D.Double square = new Rectangle2D.Double(120,40,150,150);
    public Ellipse2D.Double circle = new Ellipse2D.Double(180,95,30,30);
    public void  paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setPaint(Color.WHITE);
        g2d.fill(square);
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(2)); // ทำให้เส้นหนา
        g2d.fill(circle);

    }
    public static void createAndShowGUI() {
        JFrame window = new JFrame("Graphics Demo");
        ShapePanel content = new  ShapePanel();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(content);
        window.setLocation(100,75);
        window.setSize(400,300);
        window.setLocationRelativeTo(null);
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
