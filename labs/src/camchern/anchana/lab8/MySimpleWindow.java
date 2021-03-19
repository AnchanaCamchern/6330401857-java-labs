/**
 * This is a MySimpleWindow program that was inherited from JFrame.
 * MySimPleWindow Program include four variables,that buttonsPanel,
   mainPanel resetButton,submitButton as instance variables with the access level as protected.
 * Has setFrameFeatures() method  which set the window location at the center of the screen, set the window visible,
   exit the application using the System exit method when the user initiates a "close" on this frame, pack all components of the frame.
 *This program will display two buttons, that's "Reset" and "Submit" button and also display "My Simple Window" on the program title .
 *
 * Autor : Anchana  Camchern
 * Student ID : 633040185-7
 * Section 2
 * Date 18th March 2021
 */
package camchern.anchana.lab8;

import javax.swing.*;
import java.awt.*;

public class MySimpleWindow extends JFrame {
    protected JPanel buttonsPanel, mainPanel;
    protected JButton resetButton,submitButton;

    public MySimpleWindow(String title) {
        super(title);
    }

    public void addComponents() {
        mainPanel = (JPanel) this.getContentPane();
        resetButton = new JButton("Reset"); // set a button
        submitButton = new JButton("Submit");

        mainPanel.setLayout(new BorderLayout());

        buttonsPanel = new JPanel();
        buttonsPanel.add(resetButton);
        buttonsPanel.add(submitButton);

        mainPanel.add(buttonsPanel, BorderLayout.CENTER); // set location of buttonsPanel
    }

    protected void setFrameFeatures() {
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close the program when the user click "Close"
    }

    public static void createAndShowGUI() {
        MySimpleWindow mySimpleWindow = new MySimpleWindow("My Simple Window"); // set a title of program
        mySimpleWindow.addComponents();
        mySimpleWindow.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

