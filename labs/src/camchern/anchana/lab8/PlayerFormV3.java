/**
 * This is PlayerFormV3 program that was inherited from PlayerFormV2.
 * PlayerFormV3 program is as same as PlayerFormV2.
 * PlayerFormV3 have the list with the label “Games:” and the choices as “Guess NumberGame” , “High-Low Game”, “Monopoly Game”, The list can be selectable.
 * The title of the program is “Player Form V3”
 *
 * Autor : Anchana  Camchern
 * Student ID : 633040185-7
 * Section 2
 * Date 18th March 2021
 */

package camchern.anchana.lab8;

import javax.swing.*;
import java.awt.*;

public class PlayerFormV3 extends  PlayerFormV2 {
    protected String games[] = {"Guess Number Game", "High-Low Game", "Monopoly Game"};
    protected JList gamesList;
    protected JScrollPane gamesScrollPane;
    protected JPanel gamesPanel, setGamesLayout;
    protected JLabel gamesLabel;

    public PlayerFormV3(String title) {
        super(title);
    }

    public void addComponents() {
        super.addComponents();
        initComponents();

        contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(6,2));
        contentPanel.add(namePanel);
        contentPanel.add(nationPanel);
        contentPanel.add(dateOfBirthPanel);
        contentPanel.add(genderPanel);
        contentPanel.add(playerPanel);

        ButtonGroup genderGrd = new ButtonGroup();
        genderGrd.add(maleButton);
        genderGrd.add(femaleButton);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(contentPanel, BorderLayout.NORTH);
        mainPanel.add(setGamesLayout, BorderLayout.CENTER);
        mainPanel.add(notePanel, BorderLayout.AFTER_LAST_LINE);
    }

    public void initComponents() {
        super.initComponents();
        gamesList = new JList(games);
        gamesList.setVisibleRowCount(3);
        gamesScrollPane = new JScrollPane(gamesList);
        gamesLabel = new JLabel("Games : ");

        gamesPanel = new JPanel();
        gamesPanel.setLayout(new GridLayout(1,2));
        gamesPanel.add(gamesLabel);
        gamesPanel.add(gamesScrollPane);

        setGamesLayout = new JPanel();
        setGamesLayout.setLayout(new BorderLayout());
        setGamesLayout.add(gamesPanel,BorderLayout.CENTER);

        mainPanel = (JPanel) this.getContentPane();
        mainPanel.setLayout(new BorderLayout());

    }

    public void setFrameFeatures() {
        super.setFrameFeatures();
    }

    public static void createAndShowGUI() {
        PlayerFormV3 playerFormV3 = new PlayerFormV3("Player Form V3");
        playerFormV3.addComponents();
        playerFormV3.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
/**
 package camchern.anchana.lab8;

 import javax.swing.*;
 import java.awt.*;

 public class PlayerFormV3 extends  PlayerFormV2 {
 protected String games[] = {"Guess Number Game", "High-Low Game", "Monopoly Game"};
 protected JList gamesList;
 protected JScrollPane gamesScrollPane;
 protected  JPanel gamesPanel;
 protected JLabel gamesLabel;

 public PlayerFormV3(String title) {
 super(title);
 }

 public void addComponents() {
 super.addComponents();
 initComponents();

 contentPanel = new JPanel();
 contentPanel.setLayout(new GridLayout(0,2));
 contentPanel.add(nameLabel);
 contentPanel.add(nameTxtArea);
 contentPanel.add(nationalityLabel);
 contentPanel.add(nationalityTxtArea);
 contentPanel.add(dateOfBirthLabel);
 contentPanel.add(dateOfBirthTxtArea);
 contentPanel.add(genderLabel);
 contentPanel.add(genderPanel);
 contentPanel.add(playerTypeLabel);
 contentPanel.add(playerTypeCombo);
 contentPanel.add(gamesLabel);
 contentPanel.add(gamesScrollPane);

 ButtonGroup genderGrd = new ButtonGroup();
 genderGrd.add(maleButton);
 genderGrd.add(femaleButton);

 mainPanel.setLayout(new BorderLayout());
 mainPanel.add(contentPanel, BorderLayout.CENTER);
 mainPanel.add(notePanel, BorderLayout.AFTER_LAST_LINE);
 }

 public void initComponents() {
 super.initComponents();
 gamesList = new JList(games);
 gamesScrollPane = new JScrollPane(gamesList);
 gamesLabel = new JLabel("Games : ");
 }

 public void setFrameFeatures() {
 super.setFrameFeatures();
 }

 public static void createAndShowGUI() {
 PlayerFormV3 playerFormV3 = new PlayerFormV3("Player Form V3");
 playerFormV3.addComponents();
 playerFormV3.setFrameFeatures();
 }

 public static void main(String[] args) {
 SwingUtilities.invokeLater(new Runnable() {
 public void run() {
 createAndShowGUI();
 }
 });
 }
 }
*/