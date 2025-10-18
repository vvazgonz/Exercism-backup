class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        // True if Knight isn't awake.
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        // True if at least 1 is awake.
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        // True <- Archer isn't awake and prisoner is.
        return !archerIsAwake && prisonerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        // True <- if knight is awake, archer isn't, prisoner is wake and Dog is present. Otherwise, if archer and knight aren't awake, and prisoner is awake.
        return (petDogIsPresent && !archerIsAwake)  || (prisonerIsAwake && (!knightIsAwake && !archerIsAwake));
    }
}
