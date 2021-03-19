package camchern.anchana.Test01.GUI2;

import javax.swing.*;
import java.awt.*;

import static java.awt.Font.*;

public class CoordinateAppDemo extends JPanel {
    static  final long serialVersionUID = 4397914223424048061L;

    public void paintComponent(Graphics graphics) {
        super.paintComponents(graphics);
        int width = getWidth();
        int height = getHeight();
        int w = width / 2;
        int h = height / 2;
        String massage = "Anchana";
        Font plainFont = new Font("Monospaced", BOLD,25);
        graphics.setFont(plainFont);
        graphics.setColor(Color.GREEN);
        graphics.drawString(massage, w,h);
    }

    public static void createAndShowGUI() {
        JFrame window = new JFrame("My Name");
        CoordinateAppDemo content = new CoordinateAppDemo();
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
