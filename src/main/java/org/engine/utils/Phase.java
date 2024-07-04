package org.engine.utils;

import java.util.HashMap;
import java.util.Map;

public enum Phase {
    A("Intake", 1),
    B("Compression", 2),
    C("Combustion", 3),
    D("Exhaust", 4);


    private static final Map<String, Phase> BY_PHASENAME = new HashMap<>();
    private static final Map<Integer, Phase> BY_PHASESTEP = new HashMap<>();

    static {
        for (Phase phase: values()) {
            BY_PHASENAME.put(phase.phaseName, phase);
            BY_PHASESTEP.put(phase.ordinal(), phase);
        }
    }

    public final String phaseName;
    public final int value;

    Phase(String phaseName, int step) {
        this.phaseName = phaseName;
        this.value = step;
    }

    public static Phase valueOfPhaseName(String phaseName) {
        return BY_PHASENAME.get(phaseName);
    }

    public static Phase valueOfPhaseValue(int value) {
        return BY_PHASESTEP.get(value);
    }

    @Override
    public String toString() {
        return this.phaseName + ',' + this.value;
    }
}
