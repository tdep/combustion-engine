package org.engine;

import org.engine.utils.Stepper;

public class TimingBelt {
    Stepper stepper;
    Engine engine;

    public TimingBelt(Engine engine) {
        this.engine = engine;
    }

    public void runStepper() {
        stepper = new Stepper();
        stepper.run(engine.engineOn);
    }
}
