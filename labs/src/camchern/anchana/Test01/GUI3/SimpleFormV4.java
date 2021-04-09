package camchern.anchana.Test01.GUI3;

import javax.swing.*;

public class SimpleFormV4 extends SimpleFormV3 {
    protected  JMenuBar menuBar;
    protected  JMenu menu;
    protected  JMenuItem newItem, openItem, quitItem;
    public SimpleFormV4(String title) {
        super(title);
    }

    public void addMenus() {
        menuBar = new JMenuBar();
        menu = new JMenu("File");
        menuBar.add(menu);

        newItem = new JMenuItem("New", new ImageIcon("Labs\\Icon\\NewIcon.png"));
        menu.add(newItem);

        openItem = new JMenuItem("Open", new ImageIcon(
                "Labs\\Icon\\OpenIcon.png"));
        menu.add(openItem);

        quitItem = new JMenuItem("Quit");
        menu.add(quitItem);
        this.setJMenuBar(menuBar);
    }

    public void setFrameFeatures() {
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void createAndShowGUI() {
        SimpleFormV4 window = new SimpleFormV4("SimpleFormV4");
        window.addComponents();
        window.addMenus();
        window.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
