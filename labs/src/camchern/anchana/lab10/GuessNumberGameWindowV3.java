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
                statusField.setText("Higher");
            } else if (correctNum > clickedNumber) {
                statusField.setText("Lower");
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
    }
}


