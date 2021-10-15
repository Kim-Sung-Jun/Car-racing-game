package CarRacingGame;

import java.util.List;

public class CarNameLnspection {

    private static final int MIN_INPUT_LENGTH_DELIMITER = 1;
    private static final int MIN_CAR_NAME_LENGTH = 1;
    private static final int MAX_CAR_NAME_LENGTH = 5;
    private static final String NOT_INPUT_MESSAGE = "이름을 입력하지 않았습니다.";
    private static final String WRONG_NAME_LENGTH_MESSAGE = "이름 길이는 1~5 이여야 합니다.";


    public static void validateInputLength(String carNames) {
        if (carNames.length() < MIN_INPUT_LENGTH_DELIMITER) {
            throw new IllegalArgumentException(NOT_INPUT_MESSAGE);
        }
    }

    public static void validateCarNameLength(List<String> names) {
        for (String name : names) {
            if (name.length() < MIN_CAR_NAME_LENGTH || name.length() > MAX_CAR_NAME_LENGTH) {
                throw new IllegalArgumentException(WRONG_NAME_LENGTH_MESSAGE);
            }
        }
    }
}
