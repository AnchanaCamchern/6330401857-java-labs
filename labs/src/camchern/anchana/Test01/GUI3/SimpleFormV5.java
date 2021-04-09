package camchern.anchana.Test01.GUI3;

import javax.swing.*;
import java.awt.event.*;

public class SimpleFormV5 extends SimpleFormV4
        implements ActionListener  {
    protected String name, addr;
    public SimpleFormV5(String name) {
        super(name);
    }
    public void addListeners() {
        okButton.addActionListener(this);
    }
    protected void handleSubmitButtonClick() {
        name = nameTxt.getText();
        addr = addrTxtArea.getText();
    }
    public void actionPerformed(ActionEvent e) {
        Object srcObject = e.getSource();
        if (srcObject == okButton) {
            handleSubmitButtonClick();
            JOptionPane.showMessageDialog(this, name + " lives at " + addr);
        }
    }
    public static void createAndShowGUI() {
        SimpleFormV5 window = new SimpleFormV5("SimpleFormV5");
        window.addComponents();
        window.addMenus();
        window.addListeners();
        window.setFrameFeatures();
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
import javax.swing.*;
import java.awt.event.*;

public class SimpleFormV5 extends SimpleFormV4 implements ActionListener  {
    protected String name, address;
    public SimpleFormV5(String name) {
        super(name);
    }
    public void addListeners() {
        okButton.addActionListener(this);
    }
    protected void handlerSubmitButtonClick() {
        name = nameTxt.getText();
        address = addrTxtArea.getText();
    }
    public void actionPerformed(ActionEvent e) {
        Object srcObject = e.getSource();
        if (srcObject == okButton) {
            handlerSubmitButtonClick();
            JOptionPane.showMessageDialog(this, name + " lives at " + address);
        }
    }
    public static void createAndShowGUI() {
        SimpleFormV5 window = new SimpleFormV5("SimpleFormV5");
        window.addComponents();
        window.addMenus();
        window.addListeners();
        window.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
import javax.swing.*;
import java.awt.event.*;

public class SimpleFormV5 extends SimpleFormV4 implements ActionListener {
    protected  String command, address,name;
    public SimpleFormV5(String title) {
        super(title);
    }

    public void addListener() {
        okButton.addActionListener(this);
    }

    protected void handlerSubmitButtonClick(){
        address = addrTxtArea.getText();
        name = nameTxt.getText();
    }

    public static void createAndShowGUI() {
        SimpleFormV5 simpleFormV5 = new SimpleFormV5("Simple Form Version 5");
        simpleFormV5.addComponents();
        simpleFormV5.setFrameFeatures();
        simpleFormV5.addListener();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         command = e.getActionCommand();
        if (command.equalsIgnoreCase("OK")) {
            handlerSubmitButtonClick();
            JOptionPane.showMessageDialog(null, name + "\n " + "live in " + address);
        }
    }
}
*/