/**
 * This is a GuessNumberGameWindowV3 program that was inherited from GuessNumberGameWindowV2 and was an implementation of ActionListener.
 * This program is the same as GuessNumberGameWindowV2.
 * Users can click the number button to guess a correct answer three times.
 * If the user already click a number button in three time and can't get the correct answer,
   the program will display  "No more Tries" in the result and the user cannot click any number button.
 *
 * Author : Anchana  Canchern
 * Student ID : 633040185-7
 * Section : 2
 * Date : 12th April 2021
 */

package camchern.anchana.lab10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessNumberGameWindowV3 extends  GuessNumberGameWindowV2 implements ActionListener {
    int maxTries = 3;
    public GuessNumberGameWindowV3(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        GuessNumberGameWindowV3 guessNumberGameWindowV3 = new GuessNumberGameWindowV3("GuessNumberGameWindow Version 3"); // set the title of the program.
        guessNumberGameWindowV3.addComponents();
        guessNumberGameWindowV3.setFrameFeatures();
        guessNumberGameWindowV3.addListener();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    @Override
    public void playGame() {
        maxTries--;
        System.out.println(maxTries);
        for ( int i = maxTries; i >= 0; i--){
            if (correctNum == clickedNumber) {
                statusField.setText("Congratulations! ");
                stopButton();
            }else if (maxTries== 0){
                statusField.setText("No more Tries ");
                stopButton();
            } else if (correctNum < clickedNumber) {
                statusField.setText("Lower");
            } else if (correctNum > clickedNumber) {
                statusField.setText("Higher");
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
    }
}


