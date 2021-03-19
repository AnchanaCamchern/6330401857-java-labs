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


    contentPanel.setLayout(new GridLayout(4,2)); // ทำให้ตรง มากกว่า  FlowLayout());
    contentPanel.add(nameLabel);
    contentPanel.add(nameTxt);
    contentPanel.add(addrLabel);
    contentPanel.add(addrScrollPane);
    contentPanel.add(languagesLabel);
    contentPanel.add(languagesPanel);
    contentPanel.add(genderLabel);
    contentPanel.add(genderPanel);
    mainPanel.setLayout(new BorderLayout());

    ButtonGroup genderGrd = new ButtonGroup(); // select only one
    genderGrd.add(male);
    genderGrd.add(female);
    genderGrd.add(other);
    mainPanel.add(contentPanel, BorderLayout.CENTER);
    mainPanel.add(buttonsPanel, BorderLayout.SOUTH);
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

        mainPanel = (JPanel) this.getContentPane();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(languagesLabel, BorderLayout.AFTER_LAST_LINE);

    }

    public void setFrameFeatures() {
        //  window.add(buttonsPanel);
        //  window.setContentPane(buttonsPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
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
}
