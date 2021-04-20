/**
 * This is a PlayerFormV10 that was inherited from PlayerFormV9.
 * The PlayerFormV10 program is the same as PlayerFormV9.
 * The title of the program is “Player Form V10”.
 * The program can read a file and get the text in file to set a player form.
 * When the program set the player from the text in the file that program open,
   the program can be set as a text file that includes data of player form.
 * When a file is selected from the open file menu item, the program reads the data in the file to fill in the form.
 * The file will have one line each for name, nationality, date of birth, gender and player type.
 * When the user selected save the file menu item,the program will output the data in the form to file.
   name, nationality, date of birth, gender and player type will be output in one line for each field.
 *
 * Author : Anchana  Canchern
 * Student ID : 633040185-7
 * Section : 2
 * Date : 19th April 2021
 */

package camchern.anchana.lab11;

import javax.swing.*;
import java.io.*;
import java.util.List;
import java.util.Scanner;


public class PlayerFormV10 extends PlayerFormV9 {
    protected File file;
    protected String fileName, playerTypeSelected, genderSelected, gamesSelected, gamesSelected1;
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

    public void readGamesSelected() {

        try {
            if (gamesSelected.equals("Guess Number Game")) {
                gamesList.setSelectedIndex(0);
            }
            else if (gamesSelected.equals("High-Low Game")) {
                gamesList.setSelectedIndex(1);
            }
            else if (gamesSelected.equals( "Monopoly Game")) {
                gamesList.setSelectedIndex(2);
            }
            else {
                gamesList.isSelectionEmpty();
            }
        }
        catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
    }

    public void setPlayerForm() {
        username = nameTxtArea.getText();
        nation = nationalityTxtArea.getText();
        dateOfBirth = dateOfBirthTxtArea.getText();
        getGender();
        player = (String) playerTypeCombo.getSelectedItem();
        setGamesSelected();
        gamesSelected = message.toString();
    }

    public void readSelectedGenderButton () {

        if (genderSelected.equalsIgnoreCase("male")) {
            maleButton.setSelected(true);
        }
        else {
            femaleButton.setSelected(true);
        }
   }

   public void readSelectedPlayerType() {

       if (playerTypeSelected.equalsIgnoreCase("Beginner")) {
           playerTypeCombo.setSelectedItem("Beginner");
       }
       else if (playerTypeSelected.equalsIgnoreCase("Professional")) {
           playerTypeCombo.setSelectedItem("Professional");
       }
       else {
           playerTypeCombo.setSelectedItem("Amateur");
       }
   }

    public void readPlayerForm() {
        try {
            fileName = "in.txt";
            FileReader fileReader = new FileReader(fileName);
            Scanner scanText = new Scanner(fileReader);

            nameTxtArea.setText(scanText.nextLine());
            nationalityTxtArea.setText(scanText.nextLine());
            dateOfBirthTxtArea.setText(scanText.nextLine());

            genderSelected= scanText.nextLine();
            readSelectedGenderButton();

            playerTypeSelected= scanText.nextLine();
            readSelectedPlayerType();

            gamesSelected = scanText.nextLine();
            readGamesSelected();

            fileReader.close();
            scanText.close();


        } catch (IOException ex) {
            ex.printStackTrace(System.err);

        }
    }

    public void showPlayerForm() {
        fileName = "out.txt";
            try {
                FileWriter fw = new FileWriter(fileName);
                PrintWriter pw = new PrintWriter(fw);
                setPlayerForm();
                pw.println(username + "\n" + nation + "\n" + dateOfBirth + "\n" + gender + "\n" + player +  "\n" + gamesSelected);
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

    @Override
    public void handleSaveMenuItem() {
        super.handleSaveMenuItem();
        showPlayerForm();
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
