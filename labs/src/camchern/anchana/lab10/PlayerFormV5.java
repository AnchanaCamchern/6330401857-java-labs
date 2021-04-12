package camchern.anchana.lab10;

import camchern.anchana.lab8.PlayerFormV4;
import javax.swing.*;
import java.awt.event.*;
import java.util.Objects;

public class PlayerFormV5 extends PlayerFormV4 implements ActionListener {
    protected StringBuffer resultBuffer;
    protected String username , nation, dateOfBirth, gender, player ;


    public PlayerFormV5(String title) {
        super(title);
    }

    protected  void getGender() {

        if(maleButton.isSelected()){
            gender = " male";
        }
        if (femaleButton.isSelected()){
            gender = " female";
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
        + ", player type as " + player);
    }

    protected void handleResetButton() {
        nameTxtArea.setText(" ");
        nationalityTxtArea.setText(" ");
        dateOfBirthTxtArea.setText(" ");
    }

    protected  void handleTextField(JTextField tf) {
        nameTxtArea.setName("NameText");
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
        nameTxtArea.setText("Adam");
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


