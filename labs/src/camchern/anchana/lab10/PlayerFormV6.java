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
            JOptionPane.showMessageDialog(this,"Gender is update to " + source.getText());
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
