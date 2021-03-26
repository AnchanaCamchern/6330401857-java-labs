package camchern.anchana.Test01.GUI2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionButton extends JFrame implements ActionListener {
    protected JButton okButton, cancelButton;
    protected JPanel namePanel,mainPanel,TaPanel,buttonPanel;
    protected JTextArea nameArea;
    protected JTextField nameField;
    protected JLabel nameLabel;
    protected String name;

    public ActionButton(String title) {
        super(title);
    }

    public void addComponents() {
        mainPanel = (JPanel) this.getContentPane();
        okButton = new JButton("OK");
        cancelButton = new JButton("CANCEL");

        namePanel = new JPanel();
        nameLabel = new JLabel("Name : ");
        nameArea = new JTextArea();

        nameField = new JTextField(15);
        nameArea = new JTextArea(2,20);

        namePanel = new JPanel();
        namePanel.add(nameLabel);
        namePanel.add(nameField);

        TaPanel = new JPanel();
        TaPanel.add(nameArea);

        buttonPanel = new JPanel();
        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);



        mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(namePanel,BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(TaPanel, BorderLayout.SOUTH);
        setContentPane(mainPanel);
    }

    public void addListener() {
        okButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }

    public void setFrameFeatures() {
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void createAndShowGUI() {
        ActionButton actionButton = new ActionButton("633040185-7");
        actionButton.addComponents();
        actionButton.setFrameFeatures();
        actionButton.addListener();
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
        String command = e.getActionCommand();
        if (command.equalsIgnoreCase("CANCEL")){
            nameField.setText(" ");
        }else  if (command.equalsIgnoreCase("OK")){
            name += nameField.getText() + " ";
            nameArea.setText(name);
            nameField.setText(" ");
        }
        //nameField.setText(" ");
    }
}
