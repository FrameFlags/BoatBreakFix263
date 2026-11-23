package itamio.boatbreakfix;

/** Pure rules for the Boat Break Fix port (clean-room interpretation). */
public final class BoatBreakFixLogic {
    private BoatBreakFixLogic() {}

    /** Older boats could break on a fall and kill the rider; suppress that. */
    public static boolean shouldPreventBreak(float fallDistance, boolean hasPassenger) {
        return hasPassenger && fallDistance > 3.0f;
    }

    /** How many boat items should be dropped when a boat is broken. */
    public static int dropCount(int passengerCount) {
        return Math.max(1, passengerCount);
    }
}
