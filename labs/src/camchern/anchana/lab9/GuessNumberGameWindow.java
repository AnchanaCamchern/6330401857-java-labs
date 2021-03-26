/**
 * This is a GuessNumberGameWindow program that was inherited from JFrame.
 * This program has a title called "GuessNumberGameWindow Version 1".
 * GuessNumberGameWindow has three subsection of panel, that's text panel, button panel, result panel and also has one of main panel.
 * The program has a message "Please guess by clicking at the number :" in the north on the main panel.
 * The program has ten buttons, each button has an image number in the order of that button, all the button has located in the center on the  main panel.
 * The program has a message "Result" and text field with text  "Congratulations!" in the south on the  main panel.
 *
 * Author : Anchana  Canchern
 * Student ID : 633040185-7
 * Section : 2
 * Date : 26th March 2021
 */
package camchern.anchana.lab9;

import java.awt.*;
import javax.swing.*;
import static java.awt.Font.*;

public class GuessNumberGameWindow extends JFrame{
    protected JPanel textPanel, buttonPanel, resultPanel, mainPanel;
    protected JLabel textLabel, resultLabel;
    protected JTextField statusField;
    protected JButton buttonNumberOne, buttonNumberTwo, buttonNumberThree, buttonNumberFour, buttonNumberFive,
            buttonNumberSix, buttonNumberSeven, buttonNumberEight, buttonNumberNine, buttonNumberTen;

    public GuessNumberGameWindow(String title) {
        super(title);
    }

    public void initComponent() {
        textPanel = new JPanel();
        textLabel = new JLabel("Please guess by clicking at the number :"); // set text of text label.
        textLabel.setFont(new Font(Font.SERIF,BOLD,24)); // set size and font name and font style of text on a text label.
        textLabel.setForeground(Color.BLUE); // set color of text on text label.

        resultPanel = new JPanel();
        resultLabel = new JLabel("Result"); // set text of result label.
        resultLabel.setFont(new Font(Font.SERIF, BOLD,24)); // set size and font name and font style of text on a result label.
        resultLabel.setForeground(Color.BLUE); // set color of text on result label.

        statusField = new JTextField();
        statusField = new JTextField("Congratulations!");  // set text of status field
        statusField.setCaretColor(Color.GRAY); // set color of text on status field
        statusField.setFont(new Font(Font.SERIF,BOLD,24)); // set size and font name and font style of text on status field
        statusField.setEditable(false); // cannot to edit

        buttonNumberOne = new JButton(new ImageIcon("labs/Icon/number1.png")); // import image to the button.
        buttonNumberOne.setPreferredSize(new Dimension(100,200)); // set size of the image button.

        buttonNumberTwo = new JButton( new ImageIcon("labs/Icon/number2.png"));
        buttonNumberTwo.setPreferredSize(new Dimension(100,200));

        buttonNumberThree = new JButton(new ImageIcon("labs/Icon/number3.png"));
        buttonNumberThree.setPreferredSize(new Dimension(100,200));

        buttonNumberFour = new JButton(new ImageIcon("labs/Icon/number4.png"));
        buttonNumberFour.setPreferredSize(new Dimension(100,200));

        buttonNumberFive = new JButton(new ImageIcon("labs/Icon/number5.png"));
        buttonNumberFive.setPreferredSize(new Dimension(100,200));

        buttonNumberSix = new JButton(new ImageIcon("labs/Icon/number6.png"));
        buttonNumberSix.setPreferredSize(new Dimension(100,200));

        buttonNumberSeven = new JButton(new ImageIcon("labs/Icon/number7.png"));
        buttonNumberSeven.setPreferredSize(new Dimension(100,200));

        buttonNumberEight = new JButton(new ImageIcon("labs/Icon/number8.png"));
        buttonNumberEight.setPreferredSize(new Dimension(100,200));

        buttonNumberNine = new JButton(new ImageIcon("labs/Icon/number9.png"));
        buttonNumberNine.setPreferredSize(new Dimension(100,200));

        buttonNumberTen = new JButton(new ImageIcon("labs/Icon/number10.png"));
        buttonNumberTen.setPreferredSize(new Dimension(100,200));
    }

    public void setFrameFeatures() {
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents() {
        initComponent();
        mainPanel = (JPanel) this.getContentPane();

        textPanel.add(textLabel); // add text label to text panel.

        resultPanel = new JPanel();
        resultPanel.add(resultLabel); // add the label to the result panel
        resultPanel.add(statusField); // add the status field to the result panel.

        buttonPanel = new JPanel(new GridLayout(2,5)); // set layout of button panel.
        buttonPanel.add(buttonNumberOne); // add the button number to button panel.
        buttonPanel.add(buttonNumberTwo);
        buttonPanel.add(buttonNumberThree);
        buttonPanel.add(buttonNumberFour);
        buttonPanel.add(buttonNumberFive);
        buttonPanel.add(buttonNumberSix);
        buttonPanel.add(buttonNumberSeven);
        buttonPanel.add(buttonNumberEight);
        buttonPanel.add(buttonNumberNine);
        buttonPanel.add(buttonNumberTen);

        mainPanel.setLayout(new BorderLayout()); // set layout of main panel
        mainPanel.add(textPanel,BorderLayout.NORTH); // add text panel to main panel and located is north on the main panel
        mainPanel.add(buttonPanel, BorderLayout.CENTER); // add button panel to main panel and located is center on the main panel
        mainPanel.add(resultPanel,BorderLayout.SOUTH); // add result panel to main panel and located is south on the main panel
    }

    public static void createAndShowGUI() {
        GuessNumberGameWindow guessNumberGameWindow = new GuessNumberGameWindow("GuessNumberGameWindow Version 1"); // set the title of the program.
        guessNumberGameWindow.addComponents();
        guessNumberGameWindow.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
