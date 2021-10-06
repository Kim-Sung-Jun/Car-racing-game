package CarRacingGame;

public class ExceptionLength extends Exception {
    @Override
    public String getMessage() {
        return " 자동차 이름은 5자 이하만 가능합니다 ";
    }
}
