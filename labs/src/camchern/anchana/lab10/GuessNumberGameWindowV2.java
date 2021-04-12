/**
 * This is a GuessNumberGameWindowV2 program that was inherited from GuessNumberGameWindow in lab9 and was an implementation of ActionListener.
 * User can to keep guessing the number by clicking at the number buttons
   until the guessed number is the same as the answer number which is randomly generated in the range 1 - 10 .
 * If the user guess is correct the program will display "Congratulations! " in the result and the user cannot click any number button.
 * If a guess number is smaller than the answer the program will display "Higher" in the result.
 * If a guess number is higher than the answer the program will display "Lower" in the result.
 *
 * Author : Anchana  Canchern
 * Student ID : 633040185-7
 * Section : 2
 * Date : 12th April 2021
 */

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
            statusField.setText("Lower");
        } else if (correctNum > clickedNumber) {
            statusField.setText("Higher");
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

