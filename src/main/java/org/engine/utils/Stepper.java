package org.engine.utils;

public class Stepper extends Thread {

    public void run(boolean engineRunning) {
        if (engineRunning) {
            try {
                for (int i = 1; i < 5; i++) {
                    Thread.sleep(1000);
                    System.out.println(i);
                }
            } catch (InterruptedException e) {
                System.out.println("Stepper interrupted: " + e.getMessage());
            }
        }
    }

}
