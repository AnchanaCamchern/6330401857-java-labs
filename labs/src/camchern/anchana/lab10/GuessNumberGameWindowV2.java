package camchern.anchana.lab10;

import camchern.anchana.lab9.GuessNumberGameWindow;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class GuessNumberGameWindowV2 extends GuessNumberGameWindow implements ActionListener {
    protected int minNum = 1; // set mini number to 1
    protected int maxNum = 10; // set maximum number to 10
    protected int correctNum = minNum + (int)(Math.random() * ((maxNum - minNum) + 1 ));
    protected int clickedNumber;
    public JButton buttonOnClick;

    public GuessNumberGameWindowV2(String title) {
        super(title);
    }

    protected void addListener() {
        for (JButton jButton : Arrays.asList(buttonNumberOne, buttonNumberTwo,
                buttonNumberThree, buttonNumberFour, buttonNumberFive,
                buttonNumberSix, buttonNumberSeven, buttonNumberEight,
                buttonNumberNine, buttonNumberTen)) {
            jButton.addActionListener(this);
        }
        statusField.setColumns(15);
        statusField.setText(" ");
    }

    public void stopButton() {
        for (JButton jButton : Arrays.asList(buttonNumberOne, buttonNumberTwo,
                buttonNumberThree, buttonNumberFour, buttonNumberFive,
                buttonNumberSix, buttonNumberSeven, buttonNumberEight,
                buttonNumberNine, buttonNumberTen)) {
            jButton.setEnabled(false);
        }
    }

    public void setNameButton() {
        buttonNumberOne.setName("1");
        buttonNumberTwo.setName("2");
        buttonNumberThree.setName("3");
        buttonNumberFour.setName("4");
        buttonNumberFive.setName("5");
        buttonNumberSix.setName("6");
        buttonNumberSeven.setName("7");
        buttonNumberEight.setName("8");
        buttonNumberNine.setName("9");
        buttonNumberTen.setName("10");
    }

    public void playGame() {
        if (correctNum == clickedNumber) {
            statusField.setText("Congratulations! ");
            stopButton();
        } else if (correctNum < clickedNumber) {
            statusField.setText("Higher");
        } else if (correctNum > clickedNumber) {
            statusField.setText("Lower");
        }
    }

    public static void createAndShowGUI() {
        GuessNumberGameWindowV2 guessNumberGameWindowV2 = new GuessNumberGameWindowV2("GuessNumberGameWindow Version 2"); // set the title of the program.
        guessNumberGameWindowV2.addComponents();
        guessNumberGameWindowV2.setFrameFeatures();
        guessNumberGameWindowV2.addListener();
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
        setNameButton();
        buttonOnClick = (JButton) e.getSource();
        clickedNumber = Integer.parseInt(buttonOnClick.getName());
        playGame();
    }
}

