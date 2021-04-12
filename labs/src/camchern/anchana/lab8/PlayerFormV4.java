/**
 * This is PlayerFormV4 program that was inherited from PlayerFormV3.
 * PlayerFormV4 program is as same as PlayerFormV3.
 * PlayerFormV4 has the menu bar with two menus, that's  “File” and “Config” menu.
 * Menu “File” has four menu items which are “New”, “Open”, “Save”,and “Exit”. The new , open and save menu item will have an icon image.
 * Menu “Config” has two menus which are “Color”, and “Size”
 * The color menu has three menu items, that's Red, Green and Blue item.
 * The size menu also has three menu items, that's 16, 20 and 24 item.
 * The title of the program is “Player Form V4” and also has addMenus() method  to initialize and add menus to the PlayerFormV4 .
 *
 * Autor : Anchana  Camchern
 * Student ID : 633040185-7
 * Section 2
 * Date 18th March 2021
 */

package camchern.anchana.lab8;

import javax.swing.*;

public class PlayerFormV4 extends PlayerFormV3 {

    protected JMenu fileMenu, configMenu, subMenuColor, subMenuSize;
    protected JMenuBar menuBar ;
    protected JMenuItem newItem, openItem, saveItem, exitItem, redItem, greenItem, blueItem, sizeItem16, sizeItem20, sizeItem24;

    public PlayerFormV4(String title) {
        super(title);
    }

    public void addMenus() {
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        configMenu = new JMenu("Config");
        menuBar.add(fileMenu);
        menuBar.add(configMenu);

        newItem = new JMenuItem("New", new ImageIcon("labs/Icon/NewIcon.png"));
        fileMenu.add(newItem);

        openItem = new JMenuItem("Open", new ImageIcon("labs/Icon/OpenIcon.png"));
        fileMenu.add(openItem);

        saveItem = new JMenuItem("Save", new ImageIcon("Labs/Icon/SaveIcon.png"));
        fileMenu.add(saveItem);

        exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);

        configMenu.addSeparator();
        subMenuColor = new JMenu("Color");
        redItem = (new JMenuItem("Red"));
        greenItem = (new JMenuItem("Green"));
        blueItem = (new JMenuItem("Blue"));
        subMenuColor.add(redItem);
        subMenuColor.add(greenItem);
        subMenuColor.add(blueItem);
        configMenu.add(subMenuColor);

        subMenuSize = new JMenu("Size");
        sizeItem16 = (new JMenuItem("16"));
        sizeItem20 = (new JMenuItem("20"));
        sizeItem24 = (new JMenuItem("24"));
        subMenuSize.add(sizeItem16);
        subMenuSize.add(sizeItem20);
        subMenuSize.add(sizeItem24);
        configMenu.add(subMenuSize);

        menuBar.add(fileMenu);
        menuBar.add(configMenu);

        setJMenuBar(menuBar);
    }

    public void setFrameFeatures() {
        super.setFrameFeatures();
    }

    public static void createAndShowGUI() {
        PlayerFormV4 playerFormV4 = new PlayerFormV4("Player Form V4");
        playerFormV4.addComponents();
        playerFormV4.addMenus();
        playerFormV4.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
