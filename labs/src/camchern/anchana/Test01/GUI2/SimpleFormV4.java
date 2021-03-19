package camchern.anchana.Test01.GUI2;

import javax.swing.*;
import java.awt.*;

public class SimpleFormV4 extends SimpleFormV3{
    public SimpleFormV4(String title) {
        super(title);
    }

    @Override
    public void addComponents() {
        super.addComponents();
        initComponents();
    }

    public void addMenus() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        menuBar.add(menu);

        JMenuItem newItem = new JMenuItem("New", new ImageIcon("Labs\\Icon\\NewIcon.png"));
        menu.add(newItem);

        JMenuItem openItem = new JMenuItem("Open", new ImageIcon(
                "Labs\\Icon\\OpenIcon.png"));
        menu.add(openItem);

        JMenuItem quitItem = new JMenuItem("Quit");
        menu.add(quitItem);
        this.setJMenuBar(menuBar);


    }

    public void initComponents() {
        super.initComponents();
    }

    public static void createAndShowGUI() {
        SimpleFormV4 window = new SimpleFormV4("SimpleFormV4");
        window.addComponents();
        window.setFrameFeatures();
        window.addMenus();
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
