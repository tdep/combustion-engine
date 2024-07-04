package org.engine;

public class EngineBlock {
    private final Engine engine;
    private final TimingBelt timingBelt;

    public EngineBlock(Engine engine, TimingBelt timingBelt) {
        this.engine = engine;
        this.timingBelt = timingBelt;
    }

    public void isOn() {
        if (engine.engineOn) {
            timingBelt.runStepper();
        }
    }

}
