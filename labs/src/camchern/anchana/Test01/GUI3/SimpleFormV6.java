package camchern.anchana.Test01.GUI3;

import javax.swing.*;
import java.awt.event.*;

public class SimpleFormV6 extends SimpleFormV5 {
    protected String gender;
    protected String languages;
    public SimpleFormV6(String title) {
        super(title);
    }
    protected void getGender() {
        if (male.isSelected()) {
            gender = "male";
        } else if (female.isSelected()) {
            gender = "female";
        } else if (other.isSelected()) {
            gender = "other";
        }
    }

    protected void getLanguages() {
        languages = "";
        if (python.isSelected()) {
            languages += " python ";
        }
        if (java.isSelected()) {
            languages += " java ";
        }
        if (javascript.isSelected()) {
            languages += " javascript ";
        }
    }
    public void actionPerformed(ActionEvent e) {
        Object srcObj = e.getSource();
        if (srcObj == okButton) {
            handleSubmitButtonClick();
        }

    }
    protected void handleSubmitButtonClick() {
        super.handleSubmitButtonClick();
        getGender();
        getLanguages();
        JOptionPane.showMessageDialog(this, name + " lives in " + addr
                + " gender is " + gender + " knows these languages:" + languages);
    }
    public static void createAndShowGUI() {
        SimpleFormV6 window = new SimpleFormV6("SimpleFormV6");
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
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeListener;
import java.awt.event.*;

public class SimpleFormV6 extends SimpleFormV5 implements ActionListener {
    protected  String gender , languages;
    public SimpleFormV6(String title) {
        super(title);
    }

    protected  void getGender() {

        if(male.isSelected()){
            gender = " male";
        }
        if (female.isSelected()){
            gender = " female";
        }
        if (other.isSelected()){
            gender = " other";
        }
    }

    protected void  getLanguages() {
        languages = " ";

        if (python.isSelected()) {
            languages += " python";
        }
        if (java.isSelected()) {
            languages += " java";
        }
        if (javascript.isSelected()){
            languages += " javascript";
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == okButton) {
            handlerSubmitButtonClick();
        }
    }

    public void addListeners() {
        okButton.addActionListener(this);
    }

    protected void handlerSubmitButtonClick() {
        super.handlerSubmitButtonClick();
        getGender();
        getLanguages();
        JOptionPane.showMessageDialog(this, name + " live in " + address
                + " gender is" + gender +
                " knows these languages:" +languages );
    }

    public static void createAndShowGUI() {
        SimpleFormV6 simpleFormV6 = new SimpleFormV6("Simple Form Version 6");
        simpleFormV6.addComponents();
        simpleFormV6.setFrameFeatures();
        simpleFormV6.addListeners();
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

 public class SimpleFormV6 extends SimpleFormV5 {
 protected String gender;
 protected String languages;
 public SimpleFormV6(String title) {
 super(title);
 }
 protected void getGender() {
 if (male.isSelected()) {
 gender = "male";
 } else if (female.isSelected()) {
 gender = "female";
 } else if (other.isSelected()) {
 gender = "other";
 }
 }

 protected void getLanguages() {
 languages = "";
 if (python.isSelected()) {
 languages += " python ";
 }
 if (java.isSelected()) {
 languages += " java ";
 }
 if (javascript.isSelected()) {
 languages += " javascript ";
 }
 }
 public void actionPerformed(ActionEvent e) {
 Object srcObj = e.getSource();
 if (srcObj == okButton) {
 handleSubmitButtonClick();
 }
 }
 protected void handleSubmitButtonClick() {
 super.handleSubmitButtonClick();
 getGender();
 getLanguages();
 JOptionPane.showMessageDialog(this, name + " lives in " + addr
 + " gender is " + gender + " knows these languages:" + languages);
 }
 public static void createAndShowGUI() {
 SimpleFormV6 window = new SimpleFormV6("SimpleFormV6");
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

 public class SimpleFormV6 extends SimpleFormV5 {
 protected String gender;
 protected String languages;
 public SimpleFormV6(String title) {
 super(title);
 }
 protected void getGender() {
 if (male.isSelected()) {
 gender = "male";
 } else if (female.isSelected()) {
 gender = "female";
 } else if (other.isSelected()) {
 gender = "other";
 }
 }

 protected void getLanguages() {
 languages = "";
 if (python.isSelected()) {
 languages += " python ";
 }
 if (java.isSelected()) {
 languages += " java ";
 }
 if (javascript.isSelected()) {
 languages += " javascript ";
 }
 }
 public void actionPerformed(ActionEvent e) {
 Object srcObj = e.getSource();
 if (srcObj == okButton) {
 handleSubmitButtonClick();
 }
 }
 protected void handleSubmitButtonClick() {
 super.handleSubmitButtonClick();
 getGender();
 getLanguages();
 JOptionPane.showMessageDialog(this, name + " lives in " + addr
 + " gender is " + gender + " knows these languages:" + languages);
 }
 public static void createAndShowGUI() {
 SimpleFormV6 window = new SimpleFormV6("SimpleFormV6");
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
 */
