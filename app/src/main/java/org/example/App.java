package org.example;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        System.out.println("Random Walk Simulation Starting...");

        // Define values for N (number of steps) and M (number of trials)
        int[] stepsArray = {10, 50, 100, 500, 1000};
        int M = 10;

        // Run the simulation
        for (int N : stepsArray) {
            System.out.println("Number of Steps (N): " + N);
            for (int trial = 1; trial <= M; trial++) {
                int finalPosition = simulateRandomWalk(N);
                System.out.printf("Trial %d: Final Position (D) = %d%n", trial, finalPosition);
            }
            System.out.println(); // Add space between each N group
        }
    }

    /**
     * Simulates a one-dimensional random walk.
     * @param steps The number of steps to simulate.
     * @return The final position of the particle.
     */
    public static int simulateRandomWalk(int steps) {
        Random random = new Random();
        int currentPosition = 0;

        for (int i = 0; i < steps; i++) {
            if (random.nextBoolean()) {
                currentPosition++; // Move right
            } else {
                currentPosition--; // Move left
            }
        }
        return currentPosition;
    }
}
