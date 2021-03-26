/**
 * This is a DiceGameWindow program that was inherited from JFrame.
 * The program also have three button called "High" , "Low" and "Roll" button.
 * This program has a title called "DiceGameWindow Version 1"
 * The program can also display dices representing number 1-6.
 *
 * Author : Anchana  Canchern
 * Student ID : 633040185-7
 * Section : 2
 * Date : 26th March 2021
 */
package camchern.anchana.lab9;

import camchern.anchana.lab6.DiceGame;
import javax.swing.*;
import java.awt.*;

public class DiceGameWindow extends JFrame {
    protected DiceImageCanvas diceImageCanvas;
    protected DiceGame diceGame;
    protected int diceRoll;
    protected JPanel buttonsPanel;
    protected JButton rollButton, highButton, lowButton;

    public DiceGameWindow(String title) {
        super(title);
        diceGame = new DiceGame();
        diceRoll = diceGame.getDiceRoll();
        diceImageCanvas = new DiceImageCanvas(diceRoll);
    }

    public void setFrameFeatures() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void addComponents() {
        buttonsPanel = new JPanel(new FlowLayout());
        rollButton = new JButton("Roll");
        highButton = new JButton("High");
        lowButton = new JButton("Low");
        buttonsPanel.add(highButton);
        buttonsPanel.add(lowButton);
        buttonsPanel.add(rollButton);

        this.setLayout(new BorderLayout());
        this.add(buttonsPanel, BorderLayout.NORTH);
        this.add(diceImageCanvas, BorderLayout.CENTER);
    }

    public static void createAndShowGUI() {
        DiceGameWindow dgw = new DiceGameWindow("DiceGameWindow Version 1");
        dgw.addComponents();
        dgw.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

