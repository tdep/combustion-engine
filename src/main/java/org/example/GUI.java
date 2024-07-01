package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private final JLabel label = new JLabel("Engine status: off.");
    private final JFrame frame = new JFrame();
    private final JButton ignitionSwitch = new JButton("Start");
    private final JButton stepForward = new JButton(">>");
    private final JButton stepBackward = new JButton("<<");

    private boolean engineOn;

    public GUI() {
        ignitionSwitch.addActionListener(this);
        stepForward.addActionListener(this);
        stepForward.setEnabled(false);
        stepBackward.addActionListener(this);
        stepBackward.setEnabled(false);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(ignitionSwitch);
        panel.add(stepForward);
        panel.add(stepBackward);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Engine");
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        engineStartStop();
    }

    public void engineStartStop() {
        if (!engineOn) {
            ignitionSwitch.setText("Stop");
            engineOn = true;
            label.setText("Engine status: on.");
            buttonEnabler(engineOn);
        } else {
            ignitionSwitch.setText("Start");
            engineOn = false;
            label.setText("Engine status: off.");
            buttonEnabler(engineOn);
        }
    }

    public void buttonEnabler(boolean engineOn) {
        stepForward.setEnabled(engineOn);
        stepBackward.setEnabled(engineOn);
    }
}
