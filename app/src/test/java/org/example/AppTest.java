package org.example;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void appHasAGreeting() {
        App app = new App();
        assertNotNull(app, "App instance should not be null");
    }

    @Test
    void testRandomWalk() {
        // Test that the random walk simulation produces results within the expected range
        int steps = 100; // Number of steps
        int finalPosition = App.simulateRandomWalk(steps);

        // Verify the final position is within the range [-steps, steps]
        assertTrue(finalPosition >= -steps && finalPosition <= steps,
                "Final position should be within the range [-steps, steps]");
    }
}
