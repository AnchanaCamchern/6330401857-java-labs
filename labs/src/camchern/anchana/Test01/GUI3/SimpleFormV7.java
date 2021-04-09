package camchern.anchana.Test01.GUI3;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleFormV7 extends SimpleFormV6 {
    public SimpleFormV7(String title) {
        super(title);
    }

    public void addListeners() {
        super.addListeners();
        newItem.addActionListener(this);
        openItem.addActionListener(this);
        quitItem.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        Object srcObj = e.getSource();
        if (srcObj == newItem) {
            JOptionPane.showMessageDialog(this, "Menu New is clicked");
        } else if (srcObj == openItem) {
            JOptionPane.showMessageDialog(this, "Menu Open is clicked");
        } else if (srcObj == quitItem) {
            System.exit(0);
        }
    }
    public void addMenus() {
        super.addMenus();
        newItem.setMnemonic(KeyEvent.VK_N);
        openItem.setMnemonic(KeyEvent.VK_O);
        quitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,
                Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));

    }
    public static void createAndShowGUI() {
        SimpleFormV7 window = new SimpleFormV7("SimpleFormV7");
        window.addComponents();
        window.addMenus();
        window.addListeners();
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
/**import javax.swing.*;

public class SimpleFormV7 extends SimpleFormV6 {
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenuItem newMenu, quitMenu;
    public SimpleFormV7(String title) {
        super(title);
    }

    public void addMenus() {
        super.addMenus();
//        menuBar = new JMenuBar();
//        fileMenu = new JMenu("file");
//        menuBar.add(fileMenu);
//
//        newMenu = new JMenuItem("New", new ImageIcon("Labs/Icon/newIcon.png"));
//        fileMenu.add(newMenu);
//        quitMenu = new JMenuItem("Quit");
//        fileMenu.add(quitMenu);
//        setJMenuBar(menuBar);
    }
    public static void createAndShowGUI() {
        SimpleFormV7 simpleFormV7 = new SimpleFormV7("Simple Form Version 7");
        simpleFormV7.addComponents();
        simpleFormV7.addMenus();
        simpleFormV7.setFrameFeatures();
        simpleFormV7.addListeners();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
 */
