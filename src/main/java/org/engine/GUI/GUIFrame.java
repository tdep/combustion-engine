package org.engine.GUI;

import javax.swing.*;
import java.awt.*;

public class GUIFrame extends JFrame {
    public GUIFrame() {
        setTitle("Engine");
        JLabel label = new JLabel("Internal Combustion Engine");
        add(label);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 600);
        setVisible(true);
    }
}
