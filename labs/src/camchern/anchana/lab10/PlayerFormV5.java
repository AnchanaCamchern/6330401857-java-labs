/**
 * This is a PlayerFormV5 program that was inherited from PlayerFormV4 and was an implementation of ActionListener.
 * When the user enters the top three text fields and clicks the Submit button
   the program will display  values of name, nationality, date of birth, gender and player type.
 * When the user clicks the Reset button, the program resets the name, nationality,and date of birth text field.
 * When the user changes any text field (name, nationality, or date of birth)
   and click Enter, the program displays the message dialog that the text field    is updated.
 * When the user changes the player type, the program will show the updated player type.
 *
 *  Author : Anchana  Canchern
 * Student ID : 633040185-7
 * Section : 2
 * Date : 12th April 2021
 */

package camchern.anchana.lab10;

import camchern.anchana.lab8.PlayerFormV4;
import javax.swing.*;
import java.awt.event.*;
import java.util.Objects;

public class PlayerFormV5 extends PlayerFormV4 implements ActionListener {
    protected StringBuffer resultBuffer;
    protected String username , nation, dateOfBirth, gender, player ; // set type of variable


    public PlayerFormV5(String title) {
        super(title);
    }

    protected  void getGender() { // method to get a gender that user select.

        if(maleButton.isSelected()){
            gender = "male";
        }
        if (femaleButton.isSelected()){
            gender = "female";
        }
    }

    protected void handlerSubmitButton() {
        username = nameTxtArea.getText();
        nation = nationalityTxtArea.getText();
        dateOfBirth = dateOfBirthTxtArea.getText();
        player = Objects.requireNonNull(playerTypeCombo.getSelectedItem()).toString();
        getGender();
        JOptionPane.showMessageDialog(this, username + " has nationality as "
        + nation + ", birthdate as " + dateOfBirth + ", gender as " + gender
        + ", player type as " + player); // to display a massage
    }

    protected void handleResetButton() {
        nameTxtArea.setText(""); // set text field to empty.
        nationalityTxtArea.setText("");
        dateOfBirthTxtArea.setText("");
    }

    protected  void handleTextField(JTextField tf) {
        nameTxtArea.setName("NameText"); // set name of text field
        nationalityTxtArea.setName("NationText");
        dateOfBirthTxtArea.setName("DateText");
        String getText = tf.getName();
        switch (getText) {
            case "NameText" -> {
                username = nameTxtArea.getText();
                JOptionPane.showMessageDialog(this, "Name is updated to " + username);
            }
            case "NationText" -> {
                nation = nationalityTxtArea.getText();
                JOptionPane.showMessageDialog(this, "Nationality is updated to " + nation);
            }
            case "DateText" -> {
                dateOfBirth = dateOfBirthTxtArea.getText();
                JOptionPane.showMessageDialog(this, "Birthdate is updated to " + dateOfBirth);
            }
        }
    }

    protected void handleComboBox() {
        player = (String) playerTypeCombo.getSelectedItem();

        switch (player) {
            case "Beginner" -> JOptionPane.showMessageDialog(this, "Player type is updated to Beginner");
            case "Professional" -> JOptionPane.showMessageDialog(this, "Player type is updated to Professional");
            case "Amateur" -> JOptionPane.showMessageDialog(this, "Player type is updated to Amateur");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object scr = e.getSource();
        resultBuffer = new StringBuffer();

        if (scr == submitButton) {
            handlerSubmitButton();
        }else if (scr == resetButton){
            handleResetButton();
        }else if (scr instanceof JTextField) {
            JTextField tf = (JTextField) scr;
            handleTextField(tf);
        }else if ( scr == playerTypeCombo) {
            handleComboBox();
        }
    }

    public void addListener() {
        submitButton.addActionListener(this);
        resetButton.addActionListener(this);
        nameTxtArea.addActionListener(this);
        nationalityTxtArea.addActionListener(this);
        dateOfBirthTxtArea.addActionListener(this);
        playerTypeCombo.addActionListener(this);
        nameTxtArea.setText("Adam"); // set text of name text field
        nationalityTxtArea.setText("American");
        dateOfBirthTxtArea.setText("08-04-2001");
    }

    public static void createAndShowGUI() {
        PlayerFormV5 playerFormV5 = new PlayerFormV5("Player Form V5");
        playerFormV5.addComponents();
        playerFormV5.addMenus();
        playerFormV5.addListener();
        playerFormV5.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}


