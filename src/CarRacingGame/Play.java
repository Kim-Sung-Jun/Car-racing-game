package CarRacingGame;

import java.util.ArrayList;
import java.util.List;

public class Play {

    private static final CarName carName = new CarName();
    private static List<String> names = new ArrayList<>();
    private static int attempt = 0;

    public Play(String carsName, int attempt) {
        names = carName.divideName(carsName);
        Play.attempt = attempt;
    }

    public void proceedGame() {
        List<Car> cars = new ArrayList<>();

        for (String name : names) {
            Car car = new Car(name);
            cars.add(car);
        }
        Output.println();
        Output.printExecutionResult();
        showMoveDistance(attempt, cars);
        CarName.findWinnerName(cars);
    }

    private void showMoveDistance(int severalTimes, List<Car> cars) {
        for (int i = 0; i < severalTimes; i++) {
            for (Car car : cars) {
                RandomNumbers randomNumbers = new RandomNumbers();
                car.moveCar(randomNumbers);
                Output.drawPosition(car);
            }
            Output.println();
        }
    }
}
