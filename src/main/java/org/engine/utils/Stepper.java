package org.engine.utils;

public class Stepper extends Thread {

    public void runStepper() {
        try {
            for (int i = 0; i < 4; i++) {
                Thread.sleep(1000);
                System.out.println(Phase.valueOfPhaseValue(i));
            }
        } catch (InterruptedException e) {
            System.out.println("Stepper interrupted: " + e.getMessage());
        }
    }
}
