package CarRacingGame;

public class CarRacingGameDriver {

    public static void main(String[] args) {
        Input input = new Input();
        Output output = new Output();
        Play play = new Play();
        play.proceed(input, output);
    }
}
