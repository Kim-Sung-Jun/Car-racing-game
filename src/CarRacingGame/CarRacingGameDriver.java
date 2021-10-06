package CarRacingGame;

import java.util.InputMismatchException;

public class CarRacingGameDriver {

    public static void main(String[] args) {
        Play play = new Play();
        Output output = new Output();
        try {
            play.proceed(output);
        } catch (InputMismatchException ime) {
            output.InputMismatchException();
            output.printTermination();
        } catch (ExceptionLength el) {
            System.out.println(el.getMessage());
            output.printTermination();
        }
    }
}
