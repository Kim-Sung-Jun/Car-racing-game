package CarRacingGame;

import java.util.Iterator;

public class AttemptInspection implements Iterator<Integer> {

    private static final String NOT_POSITIVE_MESSAGE = "양수가 아닙니다.";
    private static final int MIN_ATTEMPT_NUMBER = 1;

    private int number;

    public AttemptInspection(int number) {
        validatePositive(number);
        this.number = number;
    }

    private void validatePositive(int number) {
        if (number < MIN_ATTEMPT_NUMBER) {
            throw new IllegalArgumentException(NOT_POSITIVE_MESSAGE);
        }
    }


    @Override
    public boolean hasNext() {
        return this.number < MIN_ATTEMPT_NUMBER;
    }

    @Override
    public Integer next() {
        return this.number--;
    }
}
