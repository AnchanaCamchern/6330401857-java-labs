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
            // Print the names of selected items
            List selectedGames = gamesList.getSelectedValuesList();
            int numSelected = selectedGames.size();
            for (Object selectedGame : selectedGames) {
                message.append(selectedGame).append(", ");
            }
            JOptionPane.showMessageDialog(this, message.toString());
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
