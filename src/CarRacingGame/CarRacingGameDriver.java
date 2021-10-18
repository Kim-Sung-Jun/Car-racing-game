package CarRacingGame;

public class CarRacingGameDriver {

    public static void main(String[] args) {
        String carsName = Input.inputCarName();
        String attempt = Input.inputProgressCount();
        Play play = createPlay(carsName, attempt);
        play.proceedGame();
    }

    private static Play createPlay(String carsName, String attempt) {
        while (true) {
            try {
                return new Play(carsName, attempt);
            } catch (IllegalArgumentException e) {
                Output.printExceptionMsg(e.getMessage());
            }
        }
    }
}
