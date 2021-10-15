package CarRacingGame;

import java.util.Random;

public class RandomNumbers {

    private static final int RANDOM_NUMBERS_FROM_0_TO_9 = 9;
    private static final Random random = new Random();

    public int makeRandomNumber() {
        return random.nextInt(RANDOM_NUMBERS_FROM_0_TO_9);
    }
}
