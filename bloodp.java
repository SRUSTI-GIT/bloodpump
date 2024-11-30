public class HeartSimulation {

    // Constants
    private static final int HEART_RATE = 75; // Beats per minute
    private static final double CYCLE_TIME = 60.0 / HEART_RATE; // Cardiac cycle duration in seconds

    // Method to simulate systole (pumping blood out)
    private static void systole() {
        System.out.println("\n💓 Systole: The heart contracts, pumping blood out.");
        System.out.println("   - Blood is pushed from the ventricles to the arteries.");
        System.out.println("   - Pressure increases in the arteries.");
        System.out.println("   - The heart is working hard!");
    }

    // Method to simulate diastole (filling the heart)
    private static void diastole() {
        System.out.println("\n💓 Diastole: The heart relaxes, filling with blood.");
        System.out.println("   - Blood flows from the veins into the atria and ventricles.");
        System.out.println("   - Pressure decreases in the ventricles.");
        System.out.println("   - The heart is preparing for the next pump.");
    }

    // Main simulation loop
    private static void simulateHeart() {
        int beatCount = 0; // Counter for heartbeats

        while (true) {
            System.out.println("\n-----------------------------------------");
            System.out.println("Heartbeat #" + (++beatCount));
            
            systole(); // Simulate systole
            try {
                Thread.sleep((long) (CYCLE_TIME * 1000 / 2)); // Half of the cycle time in milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            diastole(); // Simulate diastole
            try {
                Thread.sleep((long) (CYCLE_TIME * 1000 / 2)); // Half of the cycle time in milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("\n-----------------------------------------");
        }
    }

    // Entry point
    public static void main(String[] args) {
        System.out.println("Heart Blood Pumping Simulation");
        System.out.println("Heart Rate: " + HEART_RATE + " beats per minute");
        System.out.println("-----------------------------------------");

        simulateHeart();
    }
}
