package org.engine.utils;

public class Stepper extends Thread {

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            System.out.println("Stepper interrupted: " + e.getMessage());
        }
    }
}
