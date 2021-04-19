package camchern.anchana.lab11;

import camchern.anchana.lab10.PlayerFormV8;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Objects;

public class PlayerFormV9 extends PlayerFormV8 {

    public PlayerFormV9(String title) {
        super(title);
    }

    public void showBirthDateFormat() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try{
            LocalDate date = LocalDate.parse(dateOfBirthTxtArea.getText(),dateTimeFormatter);
            showMessage();
        } catch (DateTimeParseException e){
            JOptionPane.showMessageDialog(this,"Please enter date in the format dd-MM-yyyy such as 31-10-2002");
        }
    }

    public void handleEmptyGameList() {
        try {
            valueChanged(null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"You have not selected any game.");
        }

    }

    public void showMessage() {
        username = nameTxtArea.getText();
        nation = nationalityTxtArea.getText();
        dateOfBirth = dateOfBirthTxtArea.getText();
        player = Objects.requireNonNull(playerTypeCombo.getSelectedItem()).toString();
        getGender();
        JOptionPane.showMessageDialog(this, username + " has nationality as "
                + nation + ", birthdate as " + dateOfBirth + ", gender as " + gender
                + ", player type as " + player); // to display a massage
    }

    public void showEmptyField() {
        nameTxtArea.setName("Name"); // set name of text field
        nationalityTxtArea.setName("Nationality");
        dateOfBirthTxtArea.setName("Birthdate");
        StringBuilder message = new StringBuilder();

        for (JTextField textField : Arrays.asList(nameTxtArea,nationalityTxtArea,dateOfBirthTxtArea)) {
            if (textField.getText().isEmpty()){
                message.append(textField.getName()).append(" is empty\n");
            }
        }
            JOptionPane.showMessageDialog(this,"\n" + message );
    }

    @Override
    protected void handlerSubmitButton() {

        if (nameTxtArea.getText().isEmpty() || nationalityTxtArea.getText().isEmpty() || dateOfBirthTxtArea.getText().isEmpty()){
            showEmptyField();
        }
        else if (gamesList.isSelectionEmpty()) {
            handleEmptyGameList();
        }
        else if (dateOfBirthTxtArea.isValid()){
            showBirthDateFormat();
        }
        else {
            showMessage();
        }
    }

    public static void createAndShowGUI() {
        PlayerFormV9 playerFormV9 = new PlayerFormV9("Player Form V9");
        playerFormV9.addComponents();
        playerFormV9.addMenus();
        playerFormV9.addListener();
        playerFormV9.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
