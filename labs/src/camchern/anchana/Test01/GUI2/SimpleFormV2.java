package camchern.anchana.Test01.GUI2;

import camchern.anchana.Test01.GUI.*;

import javax.swing.*;
import java.awt.*;

public class SimpleFormV2 extends SimpleForm {
    protected  JCheckBox python, java, javascript;
    protected  JPanel languagesPanel;
    protected  JLabel languagesLabel, genderLabel;
    protected  JPanel contentPanel, genderPanel;
    protected  JRadioButton male, female, other;

    public SimpleFormV2(String title) {
        super(title);
    }
@Override
    public void addComponents() {
    super.addComponents();
    initComponents();

    contentPanel = new JPanel();
    languagesPanel.setLayout(new FlowLayout());
    languagesPanel.add(python);
    languagesPanel.add(java);
    languagesPanel.add(javascript);

    contentPanel.setLayout(new GridLayout(4,2));
    contentPanel.add(nameLabel);
    contentPanel.add(nameTxt);
    contentPanel.add(addrLabel);
    contentPanel.add(addrScrollPane);
    contentPanel.add(languagesLabel);
    contentPanel.add(languagesPanel);
    contentPanel.add(genderLabel);
    contentPanel.add(genderPanel);


    ButtonGroup genderGrd = new ButtonGroup();
    genderGrd.add(male);
    genderGrd.add(female);
    genderGrd.add(other);

    mainPanel.add(contentPanel, BorderLayout.NORTH);
    mainPanel.add(buttonsPanel, BorderLayout.CENTER);
    }

    public void  initComponents() {
        python = new JCheckBox("Python", true);
        java = new JCheckBox("Java", true);
        javascript = new JCheckBox("Javascript");
        languagesPanel = new JPanel();
        languagesLabel = new JLabel("Languages");
        male = new JRadioButton("Male");
        female = new JRadioButton("Female", true);
        other = new JRadioButton("Other");
        genderPanel = new JPanel();
        genderLabel = new JLabel("Gender");
        languagesPanel.add(python);
        languagesPanel.add(java);
        languagesPanel.add(javascript);
        genderPanel.add(male);
        genderPanel.add(female);
        genderPanel.add(other);
        mainPanel.add(languagesLabel, BorderLayout.AFTER_LAST_LINE);

    }

    public static void createAndShoeGUI() {
        SimpleForm window = new SimpleFormV2("SimpleForm2");
        window.addComponents();
        window.setFrameFeatures();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShoeGUI();
            }
        });
    }
/**
    public class JRadioButton {
        public void addComponents(Container cp) {
            cp.setLayout(new GridLayout(2,1));
            JLabel label = new JLabel("Gender");
            JPanel gender = new JPanel();
            JRadioButton male = new JRadioButton("Male",true);
            JRadioButton female = new JRadioButton("Female");
            gender.add(male);
            gender.add(female);
        cp.add(label);
        cp.add(gender);
        }
    }
 */
}
