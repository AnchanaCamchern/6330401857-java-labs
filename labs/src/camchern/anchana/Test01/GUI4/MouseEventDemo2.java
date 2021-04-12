package camchern.anchana.Test01.GUI4;


/*
 * Copyright (c) 1995 - 2008 Sun Microsystems, Inc.  All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Sun Microsystems nor the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/*
 * MouseEventDemo.java
 * Modified by Kanda Runapongsa Saikaew


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo2 extends JPanel  {
    BlankArea blankArea;
    JTextArea textArea;
    static final String NEWLINE = System.getProperty("line.separator");

    public MouseEventDemo2() {
        super(new GridLayout(0, 1));
        blankArea = new BlankArea(Color.YELLOW);
        add(blankArea);
        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setForeground(Color.DARK_GRAY);
        textArea.setFont(new Font("Arial", Font.BOLD, 20));
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(800, 75));
        add(scrollPane);
        // Register for mouse events on blankArea and the panel.
        MouseEventHandler meh = new MouseEventHandler();
        blankArea.addMouseListener(meh);
        addMouseListener(meh);
        setPreferredSize(new Dimension(800, 450));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    }

    class MouseEventHandler extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            eventOutput("Mouse pressed (# of clicks: " + e.getClickCount() + ")", e);
        }
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("MouseEventDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent newContentPane = new MouseEventDemo2();
        // How do JComponent, MouseEventDemo, and
        // JPanel relate to one another?
        frame.setContentPane(newContentPane);
        frame.pack();
        frame.setVisible(true);
    }

    void eventOutput(String eventDescription, MouseEvent e) {
        int diameter = 10;
        String sourceClassname = e.getComponent().getClass().getName();
        if (sourceClassname.contains("BlankArea")) {
            Graphics g = blankArea.getGraphics();
            g.setColor(Color.RED);
            // draw the filled circle at
            // x coordinate and y coordinate
            // with width = diamter and height = diameter
            g.fillOval(e.getX(), e.getY(), diameter, diameter);
        }
        textArea.append(eventDescription + " detected on " + sourceClassname + "." + NEWLINE);
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }

}
 */