/**
 * This is PlayerFormV2 program that was inherited from PlayerFormV1.
 * PlayerFormV2 program is as same as PlayerFormV1.
 * This program have “Player Type:” label and have the combo box of the type of player which includes “Beginner”, “Amateur”, “Professional”,
   the default type shown  “Amateur”.
 * PlayerFormV2 program also have the label “Note:” and the text area with 3 rows and 35 columns,
   text area have a text is s "A game is a structured form of play, usually undertaken for entertainment or fun, and sometimes used as an educational tool.”
 * The title of the program is “Player Form V2”
 *
 * Autor : Anchana  Camchern
 * Student ID : 633040185-7
 * Section 2
 * Date 18th March 2021
 */

package camchern.anchana.lab8;

import javax.swing.*;
import java.awt.*;

public class PlayerFormV2 extends PlayerFormV1{
    protected  JLabel playerTypeLabel, noteLabel;
    protected  JPanel notePanel, playerPanel, notePart;
    protected  JTextArea noteTxtArea;
    protected  JComboBox  playerTypeCombo;
    protected JScrollPane noteScrollPane;

    public PlayerFormV2(String title) {
        super(title);
    }

    public void addComponents() {
        super.addComponents();
        initComponents();
        contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(5,2));
        contentPanel.add(namePanel);
        contentPanel.add(nationPanel);
        contentPanel.add(dateOfBirthPanel);
        contentPanel.add(genderPanel);
        contentPanel.add(playerPanel);

        ButtonGroup genderGrd = new ButtonGroup();
        genderGrd.add(maleButton);
        genderGrd.add(femaleButton);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(contentPanel, BorderLayout.CENTER);
        mainPanel.add(notePanel, BorderLayout.AFTER_LAST_LINE);
    }

    public void initComponents() {
        super.initComponents();
        playerTypeCombo = new JComboBox();
        playerTypeCombo.addItem("Amateur");
        playerTypeCombo.addItem("Beginner");
        playerTypeCombo.addItem("Professional");

        noteLabel = new JLabel();
        noteLabel = new JLabel("Note : ");
        noteTxtArea = new JTextArea();
        noteTxtArea = new JTextArea(3,35);
        noteScrollPane = new JScrollPane(noteTxtArea);

        playerTypeLabel = new JLabel();
        playerTypeLabel = new JLabel("Player Type : ");

        playerPanel = new JPanel();
        playerPanel.setLayout(new GridLayout(1,2));
        playerPanel.add(playerTypeLabel);
        playerPanel.add(playerTypeCombo);

        notePanel = new JPanel();
        notePanel  = new JPanel(new BorderLayout());
        noteTxtArea.setLineWrap(true);
        noteTxtArea.setWrapStyleWord(true);
        noteTxtArea.setText("A game is a structured form of play, ");
        noteTxtArea.append("usually undertaken for entertainment or fun, ");
        noteTxtArea.append("and sometimes used as an educational tool.");

        notePart = new JPanel();
        notePart.setLayout(new BorderLayout());
        notePart.add(noteLabel, BorderLayout.NORTH);
        notePart.add(noteScrollPane,BorderLayout.SOUTH);

        mainPanel = (JPanel) this.getContentPane();
        mainPanel.setLayout(new BorderLayout());

        notePanel.add(notePart, BorderLayout.CENTER);
        notePanel.add(buttonsPanel, BorderLayout.AFTER_LAST_LINE);
    }

    public void setFrameFeatures() {
        super.setFrameFeatures();
    }

    public static void createAndShowGUI() {
        PlayerFormV2 playerFormV2 = new PlayerFormV2("Player Form V2");
        playerFormV2.addComponents();
        playerFormV2.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
