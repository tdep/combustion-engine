package org.engine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    Engine engine = new Engine();
    private JLabel engineStatusLabel = new JLabel(engine.engineStatus);
    private JFrame frame = new JFrame();

    public GUI() {
        JButton ignitionSwitch = new JButton("Ignition");
        ignitionSwitch.setActionCommand("start/stop");
        ignitionSwitch.addActionListener(this);

        JButton test = new JButton("Test");
        test.setActionCommand("test");
        test.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(2,1));
        panel.add(ignitionSwitch);
        panel.add(engineStatusLabel);
        panel.add(test);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Internal Combustion Engine");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("start/stop")) {
            engine.startEngine();
            engineStatusLabel.setText(engine.engineStatus);
        } else {
            engine.engineBlock.isOn();
        }
    }
}
