/**
 * This is a PlayerFormV8 program that was inherited from PlayerFormV7 and was an implementation of ActionListener.
 * This program is the same as PlayerFormV7.
 * When the user clicks the menu item Exit, the program will exits.
 * When the user clicks the menu item Open, the program opens the open file dialog
 * If the user selects an existing file, the program shows the message dialog
 displaying the name of the file that is selected to open.
 * If the user presses Cancel, the program should show the option message “Open command cancelled” .
 * When the user clicks the menu item Save, the program opens the save file dialog.
 * If the user selects an existing file, the program shows the message dialog displaying
   the name of the file that is selected to save.
 * If the user presses Cancel, the program should show the option message “Save command cancelled”.
 * This program have Mnemonic keys and accelerator keys of open, save and exit menu items.
 * This program can change the color of text of name, nationality and date of birth.
 * This program can change the size of text in note panel.
 *
 * Author : Anchana  Canchern
 * Student ID : 633040185-7
 * Section : 2
 * Date : 12th April 2021
 */

package camchern.anchana.lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

public class PlayerFormV8 extends PlayerFormV7 implements ActionListener {
    protected JFileChooser fileChooser;
    public PlayerFormV8(String title) {
        super(title);
        fileChooser = new JFileChooser();
    }

    @Override
    public void addMenus() {
        super.addMenus();
        saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
                Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
        openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,
                Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,
                Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
    }

    public void handleOpenMenuItem() {
        int returnVal = fileChooser.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            //This is where a real application would open the file.
            JOptionPane.showMessageDialog(this,
                    "Open file " + file.getName() + ".");
        } else if (returnVal == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(this,
                    "Open command cancelled by user.");
        }
    }

    public void handleSaveMenuItem() {
        int save = fileChooser.showSaveDialog(this);
        if (save == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile(); //This is where a real application would open the file.
            JOptionPane.showMessageDialog(this,
                    "Save file " + file.getName() + ".");
        } else if (save== JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(this,
                    "Save command cancelled by user.");
        }
    }

    public void handleRedColor() {
        nameTxtArea.setForeground(Color.RED);
        nationalityTxtArea.setForeground(Color.RED);
        dateOfBirthTxtArea.setForeground(Color.RED);
    }

    public void handleGreenColor() {
        nameTxtArea.setForeground(Color.GREEN);
        nationalityTxtArea.setForeground(Color.GREEN);
        dateOfBirthTxtArea.setForeground(Color.GREEN);
    }

    public void handleBlueColor() {
        nameTxtArea.setForeground(Color.BLUE);
        nationalityTxtArea.setForeground(Color.BLUE);
        dateOfBirthTxtArea.setForeground(Color.BLUE);
    }

    public void handleFontSizeItem16() {
        noteTxtArea.setFont(new Font(Font.SERIF,Font.PLAIN,16));
    }

    public void handleFontSizeItem20() {
        noteTxtArea.setFont(new Font(Font.SERIF,Font.PLAIN,20));
    }

    public void handleFontSizeItem24() {
        noteTxtArea.setFont(new Font(Font.SERIF,Font.PLAIN,24));
    }

    public void actionPerformed(ActionEvent e) {
        Object srcObject = e.getSource();

        if (srcObject == openItem) {
            handleOpenMenuItem();
        }
        else if (srcObject == exitItem){
            System.exit(0);
        }
        else if (srcObject == saveItem){
            handleSaveMenuItem();
        }
        else if (srcObject == redItem){
            handleRedColor();
        }
        else if (srcObject == greenItem){
            handleGreenColor();
        }
        else if (srcObject == blueItem){
            handleBlueColor();
        }
        else if (srcObject == sizeItem16) {
            handleFontSizeItem16();
        }
        else if (srcObject == sizeItem20) {
            handleFontSizeItem20();
        }
        else if (srcObject == sizeItem24) {
            handleFontSizeItem24();
        }
        else {
            super.actionPerformed(e);
        }
    }

    public void addListener() {
        super.addListener();
        openItem.addActionListener(this);
        exitItem.addActionListener(this);
        saveItem.addActionListener(this);
        redItem.addActionListener(this);
        greenItem.addActionListener(this);
        blueItem.addActionListener(this);
        sizeItem16.addActionListener(this);
        sizeItem20.addActionListener(this);
        sizeItem24.addActionListener(this);
    }

    public static void createAndShowGUI() {
        PlayerFormV8 playerFormV8 = new PlayerFormV8("Player Form V8");
        playerFormV8.addComponents();
        playerFormV8.addMenus();
        playerFormV8.addListener();
        playerFormV8.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
