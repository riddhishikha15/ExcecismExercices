class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return prisonerIsAwake && !archerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (!prisonerIsAwake && !petDogIsPresent) {
            return false; // if petDogIs not Present and prisoner is sleeping then false
        } else if (!knightIsAwake && !archerIsAwake) {
            return true; // Return true if knight and archer are sleeping, don't care about prisoner's sleep
        } else if (petDogIsPresent && !archerIsAwake) {
            return true; // if pet dog is present and archer is sleeping return true no matter the lnight's state ot prisoner's state
        } 
        return false;
    }
}
