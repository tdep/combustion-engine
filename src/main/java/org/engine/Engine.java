package org.engine;

public class Engine {
    public boolean engineOn = false;
    public String engineStatus = "Engine Status: OFF";

    public Engine() {
    }

    public boolean startEngine() {
        if (engineOn) {
            engineStatus = "Engine Status: OFF";
            System.out.println(engineStatus);
            return engineOn = false;
        }
        engineStatus = "Engine Status: ON";
        System.out.println(engineStatus);
        return engineOn = true;
    }
}
