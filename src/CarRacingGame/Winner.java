package CarRacingGame;

import java.util.List;

public class Winner {

    private static final int INITIAL_PRICE = -1;
    private static final String WINNER_NAME_DELIMITER = ", ";

    public static void findWinnerName(List<Car> cars) {
        String name = "";
        int max = INITIAL_PRICE;
        for (Car car : cars) {
            if (car.getPosition() == max) {
                name = (String.join(WINNER_NAME_DELIMITER, name, car.getName()));
            }
            if (car.getPosition() > max) {
                name = car.getName();
                max = car.getPosition();
            }
        }
        Output.printWinner(name);
    }
}
