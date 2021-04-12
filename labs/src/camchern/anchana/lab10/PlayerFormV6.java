/**
 * This is a PlayerFormV6 program that was inherited from PlayerFormV5 and was an implementation of ItemListener.
 * This program is the same as PlayerFormV5 and  when the user clicks any radio button of gender,
   the program will display the message dialog showing the update of gender.
 *
 * Author : Anchana  Canchern
 * Student ID : 633040185-7
 * Section : 2
 * Date : 12th April 2021
 */
package camchern.anchana.lab10;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PlayerFormV6 extends PlayerFormV5 implements ItemListener {
    public PlayerFormV6(String title) {
        super(title);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JRadioButton source = (JRadioButton) e.getSource();
        if (e.getStateChange() == ItemEvent.SELECTED){
            JOptionPane.showMessageDialog(this,"Gender is updated to " + source.getText());
        }
    }

    public void addListener() {
        super.addListener();
        maleButton.addItemListener(this);
        femaleButton.addItemListener(this);
    }

    public static void createAndShowGUI() {
        PlayerFormV6 playerFormV6 = new PlayerFormV6("Player Form V6");
        playerFormV6.addComponents();
        playerFormV6.addMenus();
        playerFormV6.addListener();
        playerFormV6.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
