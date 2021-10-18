package CarRacingGame;

public class Car {

    private static final int CONDITION_NUMBER = 4;
    private static final String BLANK_SPACE = " ";
    private static final int MAX_NAME_LENGTH = 5;

    private final String name;
    private int position = 0;

    public Car(String name) {
        isProperName(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    private void isProperName(String name) {
        // 빈문자열, 5글자, 이름에 공백
        validateEmptyName(name);
        validateNameLength(name);
        validateNameContainsBlank(name);
    }

    private void validateEmptyName(String name) {
        if (name.length() == 0) {
            throw new IllegalArgumentException("비어 있는 이름을 입력할 수 없습니다");
        }
    }

    private void validateNameLength(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("이름은 5글자를 넘을 수 없습니다");
        }
    }

    private void validateNameContainsBlank(String name) {
        if (name.contains(BLANK_SPACE)) {
            throw new IllegalArgumentException("이름은 공백을 포함할 수 없습니다");
        }
    }

    public void moveCar(RandomNumbers randomNumbers) {
        if (CONDITION_NUMBER >= randomNumbers.makeRandomNumber()) {
            position += 1;
        }
    }
}
