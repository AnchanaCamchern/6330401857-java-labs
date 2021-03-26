package camchern.anchana.Test01.GUI2;

import javax.imageio.ImageIO;
import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class ReadImage extends JPanel {
    BufferedImage image ;
    String fileName= "Labs/Icon/sunflowers.jpeg";

    public void paint(Graphics g) {
        g.drawImage(image,0 ,0,null);
    }

    public  ReadImage() {
        try {
            URL myImage = this.getClass().getResource("Labs/Icon/sunflowers.jpeg");
            image = ImageIO.read(myImage);
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    public Dimension getPreferredSize() {
        if (image == null) {
            return new Dimension(100, 100);
        } else {
            return new Dimension(image.getWidth() + 20, image.getHeight() + 60);
        }
    }
}
