/**
 * This is PlayerFormV1 program that was inherited from MySimpleWindow.
 * This is PlayerFormV2 program that was inherited from PlayerFormV1.
 * The program have a panel that's the left part contains JLabel and the right part contains JTextField.
 * The first line contains the "Name :" label and text field of name.
 * The second line contains the "Nationality:” label and text field of nationality.
 * The third line contains the “Date of Birth (eg.,31-01-1990):” label and text field of date of birth.
 * The fourth line contains the radio buttons which are “Male” and “Female”.
 * The fifth line contains two buttons which should be named “Reset” and “Submit” respectively.
 * The title of the program is  “Player Form V1”
 *
 * Autor : Anchana  Camchern
 * Student ID : 633040185-7
 * Section 2
 * Date 18th March 2021
 */

package camchern.anchana.lab8;
import javax.swing.*;
import java.awt.*;

public class PlayerFormV1 extends MySimpleWindow {
    protected JLabel nameLabel, nationalityLabel, dateOfBirthLabel, genderLabel;
    protected JTextField nameTxtArea, nationalityTxtArea, dateOfBirthTxtArea;
    protected JPanel contentPanel, mainPanel, genderPanel, namePanel, nationPanel, dateOfBirthPanel ,maleFemalePanel;
    protected JRadioButton maleButton, femaleButton;

    public PlayerFormV1(String title) {
        super(title);
    }

    public void addComponents() {
        super.addComponents();
        initComponents();
        contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(4,2)); // set Grid layout with 4 rows and 4 collum
        contentPanel.add(namePanel); // add name panel to content panel
        contentPanel.add(nationPanel);
        contentPanel.add(dateOfBirthPanel);
        contentPanel.add(genderPanel);

        ButtonGroup genderGrd = new ButtonGroup(); // ButtonGroup to group two radio buttons together and allow a user to choose only one radio button at a time
        genderGrd.add(maleButton);
        genderGrd.add(femaleButton);

        mainPanel.setLayout(new BorderLayout()); // set main panel layout to BorderLayout
        mainPanel.add(contentPanel, BorderLayout.CENTER); // add contentPanel to mainPanel and set location as Center
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH); // add buttonsPanel to mainPanel and set location as south
    }

    public void  initComponents() {
        genderPanel = new JPanel();
        genderLabel = new JLabel("Gender : "); // set gender label
        maleButton = new JRadioButton("Male"); // set "Male" button
        femaleButton = new JRadioButton("Female",true); //  set “Female” button and selected by default

        nameLabel = new JLabel();
        nameLabel = new JLabel("Name : "); // set name label

        nationalityLabel = new JLabel();
        nationalityLabel = new JLabel("Nationality : "); // set nationality label

        dateOfBirthLabel = new JLabel();
        dateOfBirthLabel = new JLabel("Date Of Birth (eg., 31-01-1990) : "); // set date of birth label

        nameTxtArea = new JTextField(); // set text field of name
        dateOfBirthTxtArea = new JTextField(); // set text field of date of birth
        nationalityTxtArea = new JTextField(); // set text field of nationality
        mainPanel = (JPanel) this.getContentPane();

        namePanel = new JPanel();
        namePanel.setLayout(new GridLayout(1,2));
        namePanel.add(nameLabel); // add name label to name panel
        namePanel.add(nameTxtArea); // add name text area to name panel

        nationPanel = new JPanel();
        nationPanel.setLayout(new GridLayout(1,2));
        nationPanel.add(nationalityLabel);
        nationPanel.add(nationalityTxtArea);

        dateOfBirthPanel = new JPanel();
        dateOfBirthPanel.setLayout(new GridLayout(1,2));
        dateOfBirthPanel.add(dateOfBirthLabel);
        dateOfBirthPanel.add(dateOfBirthTxtArea);

        maleFemalePanel = new JPanel();
        maleFemalePanel.setLayout(new GridLayout(0,2));
        maleFemalePanel.add(maleButton);
        maleFemalePanel.add(femaleButton);

        genderPanel = new JPanel();
        genderPanel.setLayout(new GridLayout(1,2));
        genderPanel.add(genderLabel);
        genderPanel.add(maleFemalePanel);

        mainPanel = (JPanel) this.getContentPane();
        mainPanel.setLayout(new BorderLayout());
    }

    public void setFrameFeatures() {
        super.setFrameFeatures();
    }

    public static void createAndShowGUI() {
        PlayerFormV1 playerFormV1 = new PlayerFormV1("Player Form V1");
        playerFormV1.addComponents();
        playerFormV1.setFrameFeatures();;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
