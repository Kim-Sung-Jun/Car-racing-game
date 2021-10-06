package CarRacingGame;

import java.util.Random;

public class RandomNumbers {

    private static final int RANDOM_NUMBERS_FROM_0_TO_9 = 9;

    public int makeRandomNumber() {
        Random random = new Random();
        return random.nextInt(RANDOM_NUMBERS_FROM_0_TO_9);
    }
}
