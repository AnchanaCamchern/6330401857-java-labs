package camchern.anchana.lab11;

import javax.swing.*;
import java.io.*;
import java.util.List;


public class PlayerFormV10 extends PlayerFormV9 {
    protected String gamesSelected;
    protected StringBuilder message;

    public PlayerFormV10(String title) {
        super(title);
    }

    public void setGamesSelected() {
        message = new StringBuilder();
        List selectedGames = gamesList.getSelectedValuesList();
        for (Object selectedGame : selectedGames) {
            message.append(selectedGame).append("\n");
        }
    }

    public void getPlayerForm() {
        username = nameTxtArea.getText() + " " + nationalityTxtArea.getText();
        dateOfBirth = dateOfBirthTxtArea.getText();
        getGender();
        player = (String) playerTypeCombo.getSelectedItem();
        setGamesSelected();
        gamesSelected = message.toString();
    }

    public void writePlayerForm() {
        String filename = "PlayerForm.txt";
        String line;
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            fr.close();
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }

    public void readPlayerForm() {
            String filename = "PlayerForm.txt";
            try {
                FileWriter fw = new FileWriter(filename);
                PrintWriter pw = new PrintWriter(fw);
                getPlayerForm();
                pw.println(username + "\n" + dateOfBirth + "\n" + gender + "\n" + player +  "\n" + gamesSelected);
                pw.close();
                fw.close();
            } catch (IOException ex) {
                ex.printStackTrace(System.err);
            }
    }

    @Override
    public void handleOpenMenuItem() {
        super.handleOpenMenuItem();
        readPlayerForm();

    }

    public static void createAndShowGUI() {
        PlayerFormV10 playerFormV10 = new PlayerFormV10("Player Form V10");
        playerFormV10.addComponents();
        playerFormV10.addMenus();
        playerFormV10.addListener();
        playerFormV10.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

