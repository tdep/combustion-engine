package Engine;

import org.engine.Engine;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class EngineTest {

    @Test
    @DisplayName("Running startEngine the first time returns `true`")
    public void startEngineHappyPath() {
        Engine engineTest = new Engine();
        Assertions.assertTrue(engineTest.startEngine());
    }

    @Test
    @DisplayName("Engine Status Off")
    public void updateEngineStatusOff() {
        Engine engineTest = new Engine();
        String expectedOff = "Engine Status: OFF";
        String result = engineTest.engineStatus;
        Assertions.assertEquals(expectedOff, result);
    }

    @Test
    @DisplayName("Engine Status On")
    public void updateEngineStatusOn() {
        Engine engineTest = new Engine();
        String expectedOn = "Engine Status: ON";
        engineTest.startEngine();
        String result = engineTest.engineStatus;
        Assertions.assertEquals(expectedOn, result);
    }
}
