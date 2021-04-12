/**
 * This is a PlayerFormV7 program that was inherited from PlayerFormV6
   and was an implementation of  ListSelectionListener.
 * This program is the same as PlayerFormV6.
 * When the user selects any game in the list, the program will show the selected game.
 * When the user wants to select more than one item
   in the list, the user can hold the shift key and then starts to select each item.
 * The program will display  one item or multiple items of the game list that user's select.
 *
 * Author : Anchana  Canchern
 * Student ID : 633040185-7
 * Section : 2
 * Date : 12th April 2021
 */

package camchern.anchana.lab10;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.List;

public class PlayerFormV7 extends PlayerFormV6 implements ListSelectionListener {
    ListSelectionModel model;
    public PlayerFormV7(String title) {
        super(title);
    }

    public void addComponents(){
        super.addComponents();
        gamesList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        model = gamesList.getSelectionModel();
    }

    public void addListener(){
        super.addListener();
        gamesList.addListSelectionListener(this);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        boolean isAdjusting = e.getValueIsAdjusting();
        // Need to make sure that the user finishes
        // selecting
        StringBuilder message = new StringBuilder();
        if (!isAdjusting) {
            List selectedGames = gamesList.getSelectedValuesList();
            for (Object selectedGame : selectedGames) {
                message.append(selectedGame).append(", ");
            }
            JOptionPane.showMessageDialog(this, message.toString()); //  // Print the names of selected items
        }
    }

    public static void createAndShowGUI() {
        PlayerFormV7 playerFormV7 = new PlayerFormV7("SimpleFormV7");
        playerFormV7.addComponents();
        playerFormV7.addMenus();
        playerFormV7.addListener();
        playerFormV7.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
