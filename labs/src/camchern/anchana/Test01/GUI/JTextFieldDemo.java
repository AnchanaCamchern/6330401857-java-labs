package camchern.anchana.Test01.GUI;

import javax.swing.*;
import java.awt.*;

public class JTextFieldDemo {
    public static  void addComponents(Container cp) {
        cp.setLayout(new FlowLayout());
        JLabel name = new JLabel("name");
        JTextField nameInput = new JTextField("Anny", 15);
        cp.add(name);
        cp.add(nameInput);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextFieldDemo");
        JPanel content = new JPanel();
        addComponents(content);
        JPanel buttonPane = new JPanel();
        buttonPane.add(new JButton("Submit"));
        buttonPane.add(new JButton("Apple"));
        buttonPane.add(new JButton("Coca-Cola"));
        buttonPane.add(new JButton("Jelly"));
        frame.setLayout(new BorderLayout());
        frame.add(content, BorderLayout.NORTH);
        frame.add(buttonPane, BorderLayout.AFTER_LAST_LINE);
        frame.pack();
        frame.setLocation(100,100);
        frame.setVisible(true);
    }
}
