package camchern.anchana.Test01.GUI2;

import camchern.anchana.lab9.GuessNumberGameWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HandlersExample extends JFrame implements ActionListener {
    protected JButton okButton;
    protected JPanel mainPanel;

    public HandlersExample(String title) {
        super(title);
    }

    public void addComponents() {
        mainPanel = (JPanel) this.getContentPane();
        okButton = new JButton("OK");
        mainPanel.add(okButton, BorderLayout.CENTER);
    }

    public void addListener() {
        okButton.addActionListener(this);
    }

    public void setFrameFeatures() {
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void createAndShowGUI() {
        HandlersExample handlersExample = new HandlersExample("HandlersExample ");
        handlersExample.addComponents();
        handlersExample.setFrameFeatures();;
        handlersExample.addListener();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("OK BUTTON");
    }
}
