package org.engine;

public class Engine {
    public TimingBelt timingBelt = new TimingBelt(this);
    public EngineBlock engineBlock = new EngineBlock(this, timingBelt);
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
