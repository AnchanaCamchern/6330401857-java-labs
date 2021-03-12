package camchern.anchana.Test01.GUI;

import java.awt.*;

public class BorderLayoutDemo {
    public static void  addComponents(Container cp) {
        cp.setLayout(new BorderLayout());
        cp.add(new Button("North"), BorderLayout.NORTH);
        cp.add(new Button("South"), BorderLayout.SOUTH);
        cp.add(new Button("East"), BorderLayout.EAST);
        cp.add(new Button("West"), BorderLayout.WEST);
        cp.add(new Button("Center"), BorderLayout.CENTER);
    }
}
