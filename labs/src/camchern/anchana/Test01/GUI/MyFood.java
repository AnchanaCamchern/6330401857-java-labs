package camchern.anchana.Test01.GUI;
import javax.swing.*;
import java.awt.*;

public class MyFood extends JFrame {
    JPanel buttonsPanel, namePanel;
    public MyFood() {
        super("633040185-7");
    }

    public void addComponents() {
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameTxt = new JTextField("Anchana", 15);
        JPanel mainPanel = (JPanel) this.getContentPane();
        JButton food1Button = new JButton("Jelly");
        JButton food2Button = new JButton("Coca-cola");
        JButton food3Button = new JButton("Ice");

        mainPanel.setLayout(new BorderLayout());
        namePanel = new JPanel();
        buttonsPanel = new JPanel();
        namePanel.add(nameLabel);
        namePanel.add(nameTxt);
        buttonsPanel.add(food1Button);
        buttonsPanel.add(food2Button);
        buttonsPanel.add(food3Button);

        mainPanel.add(namePanel, BorderLayout.NORTH);
        mainPanel.add(buttonsPanel, BorderLayout.CENTER);
    }

    public void setFrameFeatures() {
        //  window.add(buttonsPanel);
        //  window.setContentPane(buttonsPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MyFood window = new MyFood();
        window.addComponents();
        window.setFrameFeatures();
    }
}

/**import javax.swing.*;
import java.awt.*;

public class MyFood {
    JPanel buttonsPanel, namePanel;
    public MyFood() {
        super("633040185-7");
    }

    public void addComponents() {
        JLabel nameLabel = new JLabel("Name:");
        JLabel nameLabel2 = new JLabel("Address");
        JTextField nameTxt = new JTextField("Anchana", 15);
        JPanel mainPanel = (JPanel) this.getContentPane();
        JButton food1Button = new JButton("OK");
        JButton food2Button = new JButton("Cancel");
        JTextArea news = new JTextArea(4,20);
        news.setLineWrap(true);
        news.setWrapStyleWord(true);
        news.setText("Sets the style of wrapping used if the text area is wrapping lines");
        news.append("If set to true the lines will be wrapped at word boundaries (whitespace)");
        news.append("If they are too long to fit within the allocated width.");
        news.append("By default this property is false.");
        JScrollPane sp = new JScrollPane(news);
        createRootPane().add(news);


        mainPanel.setLayout(new BorderLayout());
        namePanel = new JPanel();
        buttonsPanel = new JPanel();
        namePanel.add(nameLabel);
        namePanel.add(nameLabel2);
        namePanel.add(nameTxt);
        buttonsPanel.add(food1Button);
        buttonsPanel.add(food2Button);
        buttonsPanel.add(news);

        mainPanel.add(namePanel, BorderLayout.NORTH);
        mainPanel.add(buttonsPanel, BorderLayout.WEST);
        mainPanel.add(nameLabel2, BorderLayout.EAST);
        mainPanel.add(news, BorderLayout.CENTER);
    }

    public void setFrameFeatures() {
        //  window.add(buttonsPanel);
        //  window.setContentPane(buttonsPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MyFood window = new MyFood();
        window.addComponents();
        window.setFrameFeatures();
    }
}

public class MyFood extends JFrame {
    JPanel buttonsPanel, namePanel;
    public MyFood() {
        super("633040185-7");
    }

    public void addComponents() {
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameTxt = new JTextField("Anchana", 15);
        JPanel mainPanel = (JPanel) this.getContentPane();
        JButton food1Button = new JButton("Orange");
        JButton food2Button = new JButton("Pomelo");
        JButton food3Button = new JButton("Mango");

        mainPanel.setLayout(new BorderLayout());
        namePanel = new JPanel();
        buttonsPanel = new JPanel();
        namePanel.add(nameLabel);
        namePanel.add(nameTxt);
        buttonsPanel.add(food1Button);
        buttonsPanel.add(food2Button);
        buttonsPanel.add(food3Button);

        mainPanel.add(namePanel, BorderLayout.NORTH);
        mainPanel.add(buttonsPanel, BorderLayout.CENTER);
    }

    public void setFrameFeatures() {
        //  window.add(buttonsPanel);
        //  window.setContentPane(buttonsPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MyFood window = new MyFood();
        window.addComponents();
        window.setFrameFeatures();
    }
}
 */
