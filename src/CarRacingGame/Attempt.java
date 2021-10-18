package CarRacingGame;

public class Attempt {

    private static final String NOT_INTEGER_MESSAGE = "정수가 아닙니다.";
    private static final String NOT_POSITIVE_MESSAGE = "양수가 아닙니다.";
    private static final int MIN_ATTEMPT_NUMBER = 1;

    private static int number;

    public Attempt(String number) {
        validateInteger(number);
        validatePositive(number);
        Attempt.number = Integer.parseInt(number);
    }

    public static int getNumber() {
        return number;
    }

    private void validateInteger(String number) {
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(NOT_INTEGER_MESSAGE);
        }
    }

    private void validatePositive(String number) {
        if (Integer.parseInt(number) < MIN_ATTEMPT_NUMBER) {
            throw new IllegalArgumentException(NOT_POSITIVE_MESSAGE);
        }
    }
}
