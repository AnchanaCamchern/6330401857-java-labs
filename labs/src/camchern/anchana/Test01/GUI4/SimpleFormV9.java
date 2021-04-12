package camchern.anchana.Test01.GUI4;

import camchern.anchana.Test01.GUI3.SimpleFormV8;

import javax.swing.*;
import java.awt.event.*;
import java.io.File;

public class SimpleFormV9 extends SimpleFormV8 {
    protected JFileChooser fileChooser;
    public SimpleFormV9(String title) {
        super(title);
        fileChooser = new JFileChooser();
    }

    public void handleOpenMI() {
        int returnVal = fileChooser.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            //This is where a real application would open the file.
            JOptionPane.showMessageDialog(this,
                    "Opening: " + file.getName() + ".");
        } else if (returnVal == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(this,
                    "Open command cancelled by user.");
        }
    }
    public void actionPerformed(ActionEvent e) {
        Object srcObject = e.getSource();
        if (srcObject == openItem) {
            handleOpenMI();
        } else {
            super.actionPerformed(e);
        }
    }
    public static void createAndShowGUI() {
        SimpleFormV9 window = new SimpleFormV9("SimpleFormV9");
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
/**
import camchern.anchana.Test01.GUI3.SimpleFormV8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class SimpleFormV9 extends SimpleFormV8 implements ActionListener {
    static protected final String newline = "\n";
    JFileChooser chooser;
    JTextArea log;
    JButton openButton, saveButton;
    public void addComponents() {
       log = new JTextArea(2,20);
       log.setMargin(new Insets(5,5,5,5));
       JScrollPane logScrollPane = new JScrollPane(log);
       chooser = new JFileChooser();
       openItem.addActionListener(this);

    }

    public void actionPerformed() {

    }
    public SimpleFormV9(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        SimpleFormV9 simpleFormV9 = new SimpleFormV9("SimpleFormV9");
        simpleFormV9.addComponents();
        simpleFormV9.addMenus();
        simpleFormV9.addListeners();
        simpleFormV9.setFrameFeatures();
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