package org.engine.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private final JLabel label = new JLabel("Engine status: off.");
    private final JButton ignitionSwitch = new JButton("Start");
    private final JButton stepForward = new JButton(">>");
    private final JButton stepBackward = new JButton("<<");

    private boolean engineOn;

    public GUI() {
        ignitionSwitch.addActionListener(this);
        stepForward.setEnabled(false);
        stepBackward.setEnabled(false);

        GUIPanel panel = new GUIPanel();
        panel.add(ignitionSwitch);
        panel.add(stepForward);
        panel.add(stepBackward);
        panel.add(label);

        GUIFrame frame = new GUIFrame();
        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
    }

    @Override
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
